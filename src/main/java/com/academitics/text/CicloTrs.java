package com.academitics.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Session;
import org.primefaces.component.api.UIColumn;
import org.primefaces.component.column.Column;
import org.primefaces.component.columns.Columns;
import org.primefaces.component.commandlink.CommandLink;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.panel.Panel;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;
import org.primefaces.context.RequestContext;

import com.academitics.mapeo.Carrera;
import com.academitics.mapeo.Ciclo;
import com.academitics.mapeo.CicloEscolarDetalle;
import com.academitics.mapeo.Jornada;
import com.academitics.mapeo.Nivel;
import com.academitics.util.CicloUtil;
import com.academitics.util.HibernateUtil;

@ManagedBean
@SessionScoped
public class CicloTrs {
	public static Panel pnlC = new Panel();

	public static DataTable dtNiveles = new DataTable();
	public static DataTable dtCiclos = new DataTable();

	private List<Jornada> jornadas = new ArrayList<Jornada>();
	private List<Jornada> jornadasSeleccionadas;

	// jornada niveles creo jeje
	List<CicloEscolarDetalle>[][] CicloEscolarDetalleMtx = new ArrayList[20][15];
	// CicloEscolarDetalle[][] CicloEscolarDetalleMtx = new
	// CicloEscolarDetalle[20][15];
	private List<ColumnModel> columns;

	private List<UIColumn> columns1;

	private List<Nivel> niveles = new ArrayList<Nivel>();
	private List<Ciclo> ciclos = new ArrayList<Ciclo>();
	private List<CicloEscolarDetalle> detallesCiclos = new ArrayList<CicloEscolarDetalle>();
	private List<Carrera> carreras = new ArrayList<Carrera>();

	private String columna;
	private Boolean nivelValorActual;
	HashMap<Integer, String> jornadasPar = new HashMap<Integer, String>();
	HashMap<Integer, String> nivelesPar = new HashMap<Integer, String>();
	HashMap<String, String> CarreraPar = new HashMap<String, String>();

	HashMap<Integer, String> nivelesParSeleccionadas = new HashMap<Integer, String>();

	private final static List<String> VALID_COLUMN_KEYS = Arrays.asList(
			"descripcion", "nombre");
	private String columnTemplate = "nombre descripcion";

	int indice = 0;
	int max = 2;
	int min = 0;

	private String nuevoDetalleCiclo;

	public CicloTrs() {
		jornadas = CicloUtil.obtenerJornadas();
		niveles = CicloUtil.obtenerNiveles();

		columns1 = crearColumnas();
		createDynamicColumns();

		ciclos = traerCiclos("2016");
		detallesCiclos = traerDetallesCiclos("2016");

		carreras = CicloUtil.obtenerCarreras();

		crearParCarrera();
	}

	private void crearParCarrera() {

		for (Carrera carrera : carreras) {
			System.out.println("Id carrera para crear lista: "
					+ carrera.getIdCarrera());

			CarreraPar.put(carrera.getIdCarrera().toString(),
					carrera.getNombre());
		}

		System.out.println("CarreraPar " + CarreraPar);
	}

	private String validarNull(String idCarrera) {

		idCarrera = idCarrera == null ? "0" : idCarrera;

		return idCarrera;
	}

	private List<UIColumn> crearColumnas() {
		List<UIColumn> columnasEstaticas = new ArrayList<UIColumn>();

		Column colNombre = new Column();
		colNombre.setHeaderText("Nombre");
		// colNombre.setValueExpression(arg0, arg1);

		Column colDescripcion = new Column();
		colNombre.setHeaderText("Descripción");

		columnasEstaticas.add(colNombre);
		columnasEstaticas.add(colDescripcion);

		return columnasEstaticas;
	}

	private void createDynamicColumns() {
		String[] columnKeys = columnTemplate.split(" ");
		columns = new ArrayList<ColumnModel>();

		for (String columnKey : columnKeys) {
			String key = columnKey.trim();

			if (VALID_COLUMN_KEYS.contains(key)) {
				columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
			}
		}
	}

	public void siguiente() {
		if (indice < max) {
			if (indice == 0 && jornadasSeleccionadas != null) {
				indice++;
				validarIndice(indice);
			} else if (indice == 1) {
				indice++;
				validarIndice(indice);
			} else
				System.out.println("No ha seleccionado ningun registro ");
		}
	}

	public void atras() {
		if (indice > min) {
			indice--;
			System.out.println("indice   " + indice);
		}
	}

	private void validarIndice(int indice) {
		if (indice == 1) {

			System.out.println("esto en el indice 1");

			for (Jornada jornada : jornadasSeleccionadas) {
				jornadasPar.put(jornada.getIdJornada(), jornada.getNombre());
			}

			for (Nivel nivel : niveles) {
				nivelesPar.put(nivel.getIdNivel(), nivel.getNombre());
			}

		} else if (indice == 2) {
			System.out.println("estoy en el indice 2");

		}
	}

	public void obtNivelValor(ValueChangeEvent event) {
		nivelValorActual = Boolean.valueOf(event.getNewValue().toString());
	}

	public void enviar(String jornadaNombre, int nivelId, int jornadaId) {

		List<CicloEscolarDetalle> cicloEscolarDetalleFiltrados = detallesCiclos
				.stream()
				.filter((c) -> c.getIdJornada() == jornadaId
						&& c.getIdNivel() == nivelId)
				.collect(Collectors.toList());

		if (nivelValorActual) {
			CicloEscolarDetalleMtx[jornadaId][nivelId] = cicloEscolarDetalleFiltrados;
		} else {
			CicloEscolarDetalleMtx[jornadaId][nivelId] = null;
		}
	}

	public void guardarNiveles() {

		nivelesParSeleccionadas = new HashMap<Integer, String>();
		TabView tabview = new TabView();
		tabview.setId("tabview1");

		pnlC.clearInitialState();

		FacesContext fctx = FacesContext.getCurrentInstance();
		ELContext elctx = fctx.getELContext();
		Application jsfApp = fctx.getApplication();
		ExpressionFactory exprFactory = jsfApp.getExpressionFactory();
		Tab tabR;

		for (int row = 0; row < CicloEscolarDetalleMtx.length; row++) {

			Tab tab = new Tab();

			for (int col = 0; col < CicloEscolarDetalleMtx[row].length; col++) {

				if (CicloEscolarDetalleMtx[row][col] != null) {

					if (CicloEscolarDetalleMtx[row][col].size() == 1) {

						CicloEscolarDetalle detalle = CicloEscolarDetalleMtx[row][col]
								.get(0);
						tabR = crearVistaTabla(elctx, exprFactory, detalle,
								col, row, tab, false, null);
						tabview.getChildren().add(tabR);

					} else {
						List<CicloEscolarDetalle> detalles = CicloEscolarDetalleMtx[row][col];

						Panel pnlCarrera = new Panel();
						pnlCarrera.setHeader(nivelesPar.get(col));

						for (CicloEscolarDetalle detalle : detalles) {
							tabR = crearVistaTabla(elctx, exprFactory, detalle,
									col, row, tab, true, pnlCarrera);
							tabview.getChildren().add(tabR);

						}
					}
				}
			}
		}

		pnlC.getChildren().add(tabview);
		// RequestContext.getCurrentInstance().update("@form");

		System.out.println(" valores niveles seleccionados "
				+ nivelesParSeleccionadas);
	}

	private Tab crearVistaTabla(ELContext elctx, ExpressionFactory exprFactory,
			CicloEscolarDetalle DetalleCiclo, int col, int row, Tab tab,
			boolean tieneHijos, Panel pnlCarrera) {
		DataTable tabla = new DataTable();
		tabla = crearTablaDin(elctx, exprFactory, tabla, DetalleCiclo, row, col);
		//tabla.setId("tabla" + DetalleCiclo);

		Panel pnl = crearPanel(elctx, exprFactory, DetalleCiclo);
		pnl.getChildren().add(tabla);

		if (tieneHijos) {
			pnl.setHeader(CarreraPar.get(DetalleCiclo.getIdCarrera())); // carreras
			pnlCarrera.getChildren().add(pnl);
			tab.getChildren().add(pnlCarrera);
		} else {
			pnl.setHeader(nivelesPar.get(DetalleCiclo.getIdNivel())); // niveles
			tab.getChildren().add(pnl);
		}

		tab.setTitle(jornadasPar.get(row)); // Jornadas

		return tab;

	}	

	private Panel crearPanel(ELContext elctx, ExpressionFactory exprFactory, CicloEscolarDetalle IdCicloEscolarDetalle) {
		Panel pnl = new Panel();
		pnl.setId("pnlCiclo"+ validarNull(IdCicloEscolarDetalle.getIdCarrera()) + IdCicloEscolarDetalle.getIdJornada() + IdCicloEscolarDetalle.getIdNivel());

		HtmlOutputText otNuevoCiclo = new HtmlOutputText();
		otNuevoCiclo.setStyleClass("ui-icon ui-icon-plusthick");

		CommandLink clNuevoCiclo = new CommandLink();				
		
		clNuevoCiclo
				.setStyleClass("ui-panel-titlebar-icon ui-corner-all ui-state-default");
		clNuevoCiclo.getChildren().add(otNuevoCiclo);

		/*ValueExpression actionListenerDialogo = exprFactory
				.createValueExpression(elctx, "PF('dialCiclo').show()",
						Object.class);*/
		
		ValueExpression actionListenerDialogo = exprFactory
				.createValueExpression(elctx, "#{cicloTrs.buttonAction}",
						Object.class);

		clNuevoCiclo.setValueExpression("actionListener", actionListenerDialogo);		
		
		InputText idDetalleCiclo = new InputText();
		idDetalleCiclo.setValue(IdCicloEscolarDetalle.getIdCicloEscolarDetalle().toString());
		idDetalleCiclo.setId("txtIdPnl"+IdCicloEscolarDetalle.getIdCicloEscolarDetalle().toString());
		idDetalleCiclo.setRendered(false);

		pnl.getFacets().put("actions", clNuevoCiclo);
		pnl.getChildren().add(idDetalleCiclo);
		
		return pnl;
	}
	
	public void buttonAction(ActionEvent actionEvent) {
		
		//nuevoDetalleCiclo = DetalleCiclo;
		
		System.out.println("llego a llamar a ciclo dial");
		
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('dialCiclo').show()");	
	}

	private List<Ciclo> traerCiclos(String i) {
		List<Ciclo> setList;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		setList = session.createQuery("from Ciclo").list();
		session.getTransaction().commit();

		return setList;
	}

	private List<CicloEscolarDetalle> traerDetallesCiclos(String anio) {
		List<CicloEscolarDetalle> setList;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		setList = session.createQuery(
				"from CicloEscolarDetalle where anio = " + anio).list();
		session.getTransaction().commit();

		return setList;
	}

	private DataTable crearTablaDin(ELContext elctx,
			ExpressionFactory exprFactory, DataTable dt,
			CicloEscolarDetalle DetalleCiclo, int row, int col) {
		Columns columnas = new Columns();

		UIOutput cabec = new UIOutput();
		UIOutput items = new UIOutput();

		ValueExpression header = exprFactory.createValueExpression(elctx,
				"#{column.header}", Object.class);
		ValueExpression itemsV = exprFactory.createValueExpression(elctx,
				"#{item[column.property]}", Object.class);

		items.setValueExpression("value", itemsV);
		cabec.setValueExpression("value", header);
		columnas.setValue(columns);
		columnas.setVar("column");
		columnas.getChildren().add(items);
		columnas.getFacets().put("header", cabec);

		dt.setValue(ObtenerDatosFiltrados(DetalleCiclo));
		dt.setVar("item");
		dt.getChildren().add(columnas);

		return dt;
	}

	private List<Ciclo> ObtenerDatosFiltrados(CicloEscolarDetalle DetalleCiclo) {
		List<Ciclo> ciclosFiltrados = ciclos
				.stream()
				.filter((c) -> c.getIdCicloEscolarDetalle() == DetalleCiclo
						.getIdCicloEscolarDetalle())
				.collect(Collectors.toList());

		return ciclosFiltrados;
	}

	public List<Jornada> getJornadas() {
		return jornadas;
	}

	public void setJornadas(List<Jornada> jornadas) {
		this.jornadas = jornadas;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public List<Jornada> getJornadasSeleccionadas() {
		return jornadasSeleccionadas;
	}

	public void setJornadasSeleccionadas(List<Jornada> jornadasSeleccionadas) {
		this.jornadasSeleccionadas = jornadasSeleccionadas;
	}

	public List<Nivel> getNiveles() {
		return niveles;
	}

	public void setNiveles(List<Nivel> niveles) {
		this.niveles = niveles;
	}

	public DataTable getdtNiveles() {
		return dtNiveles;
	}

	public void setdtNiveles(DataTable dtNiveles) {
		CicloTrs.dtNiveles = dtNiveles;
	}

	public String getColumna() {
		return columna;
	}

	public void setColumna(String columna) {
		this.columna = columna;
	}

	public Panel getPnlC() {
		return pnlC;
	}

	public void setPnlC(Panel pnlC) {
		CicloTrs.pnlC = pnlC;
	}

	public DataTable getDtCiclos() {
		return dtCiclos;
	}

	public void setDtCiclos(DataTable dtCiclos) {
		CicloTrs.dtCiclos = dtCiclos;
	}

	public List<ColumnModel> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnModel> columns) {
		this.columns = columns;
	}

	public List<Ciclo> getCiclos() {
		return ciclos;
	}

	public void setCiclos(List<Ciclo> ciclos) {
		this.ciclos = ciclos;
	}

	static public class ColumnModel implements Serializable {

		private String header;
		private String property;

		public ColumnModel(String header, String property) {
			this.header = header;
			this.property = property;
		}

		public String getHeader() {
			return header;
		}

		public String getProperty() {
			return property;
		}
	}
}
