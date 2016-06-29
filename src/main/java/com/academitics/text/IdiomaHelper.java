package com.academitics.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.hibernate.Session;
import org.hibernate.metadata.ClassMetadata;
import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.panelgrid.PanelGrid;
import org.primefaces.context.RequestContext;

import com.academitics.DAO.IdiomaDAO;
import com.academitics.mapeo.Idioma;
import com.academitics.util.HibernateUtil;
import com.academitics.util.LlenarControles;
import com.academitics.util.Maestro;

@ManagedBean
@ViewScoped
public class IdiomaHelper {

	/*
	 * modificar para que el registro seleccionado de la tabla principal se
	 * extraiga del mismo y no se haga una consulta a base de datos modificar
	 * insertar modificar y eliminar para que funcione para cualquier tabla.
	 */

	private Idioma nuevo = new Idioma();
	public Object[] seleccionado =  new Object[10];
	private List<Object> seleccionadoDet;
	private static List<Object[]> setIdiomas;
	private List<Object[]> setIdiomasFilt;
	private List<SelectItem> grupoIdiomas;
	private int grupoIdioma;
	private boolean editando = false;
	private List<ColumnModel> columnas;
	private List<ColumnModel> columnasDet;
	public static PanelGrid panelGrid = new PanelGrid();
	
	private List<String> COLUMNAS_VALIDAS = obtenerColumnas();

	public List<String> getCOLUMNAS_VALIDAS() {
		return COLUMNAS_VALIDAS;
	}

	public void setCOLUMNAS_VALIDAS(List<String> cOLUMNAS_VALIDAS) {
		COLUMNAS_VALIDAS = cOLUMNAS_VALIDAS;
	}

	private String nombreColumnas = "grupoIdioma nombre descripcion usuarioAdiciona ";

	private List<String> obtenerColumnas() {

		ClassMetadata classMetadata = HibernateUtil.getSessionFactory()
				.getClassMetadata(Idioma.class);

		List<String> list = Arrays.asList(classMetadata.getPropertyNames());

		System.out.println("mostrar objeto columnas1: " + list);

		return list;
	}

	public IdiomaHelper() {
		panelGrid = new PanelGrid();
		seleccionadoDet = new ArrayList<Object>();
		initTable();
		columnas = LlenarControles.crearColumnasDinamicas(columnas,
				COLUMNAS_VALIDAS, nombreColumnas);
		construirDetalle();
	}

	public static void initTable() {
		setIdiomas = LlenarControles.llenarDt(IdiomaDAO.tblIdiomas);
	}

	// la version con set de idiomas se encuentra en la academitics V2
	// 28-08-2015

	public void eliminar() {
		Maestro.eliminar("Idioma", seleccionado[0].toString(), "id_idioma");
		setIdiomas.remove(seleccionado);
	}
	
	public void editar() {		
		System.out.println("estoy editando");
		
		try{
		  IdiomaIngreso.Iniciar(seleccionado);}
		catch (Exception e) {}
		finally {
			
		}
		RequestContext context = RequestContext.getCurrentInstance();
	    context.execute("PF('dlgIng').show()");
	}
	
	public void mostrar(){	
		panelGrid.getChildren().clear();
		RequestContext.getCurrentInstance().update("@form");
		
		String[] label =  IdiomaDAO.tblIdiomasCampos.split(",");
		int i = 0;
		
		for (Object item: seleccionado ) {
			OutputLabel etiqueta = new OutputLabel();
			etiqueta.setValue(label[i] + ":");		
			panelGrid.getChildren().add(etiqueta);
			
			OutputLabel valor = new OutputLabel();
			valor.setValue(item);		
			panelGrid.getChildren().add(valor);	
			
			i++;
		}	
				
		RequestContext context = RequestContext.getCurrentInstance();
	    context.execute("PF('dlgDet').show()");			
	}
	
	public void nuevo() {	
		System.out.println("llego a insertar");
		IdiomaIngreso.Iniciar(new Object[100]);		
	}
	

	public void construirDetalle() {
		String COLUMNAS_VALIDAS_DET = "";

		for (String s : COLUMNAS_VALIDAS) {
			COLUMNAS_VALIDAS_DET += s + " ";
		}

		System.out.println("COLUMNAS_VALIDAS_DET: " + COLUMNAS_VALIDAS_DET);

		columnasDet = LlenarControles.crearColumnasDinamicas(columnasDet,
				COLUMNAS_VALIDAS, COLUMNAS_VALIDAS_DET);

	}

	/*public Idioma traerIdioma(Integer Id) {
		Idioma idioma = new Idioma();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		idioma = (Idioma) session.load(Idioma.class, Id);

		// no se porque si quito este sistem me da un error de proxy :(
		System.out.println("seleccionado: " + idioma.getNombre());
		session.getTransaction().commit();

		return idioma;
	}
*/
	public Idioma getNuevo() {
		return nuevo;
	}

	public void setNuevo(Idioma nuevo) {
		this.nuevo = nuevo;
	}

	public Object[] getSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(Object[] seleccionado) {
		this.seleccionado = seleccionado;
	}

	public List<Object[]> getSetIdiomas() {
		return setIdiomas;
	}

	public void setSetIdiomas(List<Object[]> setIdiomas) {
		this.setIdiomas = setIdiomas;
	}

	public int getGrupoIdioma() {
		return grupoIdioma;
	}

	public void setGrupoIdioma(int grupoIdioma) {
		this.grupoIdioma = grupoIdioma;
	}

	public List<SelectItem> getGrupoIdiomas() {
		return grupoIdiomas;
	}

	public void setGrupoIdiomas(List<SelectItem> grupoIdiomas) {
		this.grupoIdiomas = grupoIdiomas;
	}

	public List<ColumnModel> getColumnas() {
		return columnas;
	}

	public void setColumnas(List<ColumnModel> columnas) {
		this.columnas = columnas;
	}

	public List<ColumnModel> getColumnasDet() {
		return columnasDet;
	}

	public void setColumnasDet(List<ColumnModel> columnasDet) {
		this.columnasDet = columnasDet;
	}

	public List<Object> getSeleccionadoDet() {
		return seleccionadoDet;
	}

	public void setSeleccionadoDet(List<Object> seleccionadoDet) {
		this.seleccionadoDet = seleccionadoDet;
	}

	public List<Object[]> getSetIdiomasFilt() {
		return setIdiomasFilt;
	}

	public void setSetIdiomasFilt(List<Object[]> setIdiomasFilt) {
		this.setIdiomasFilt = setIdiomasFilt;
	}
	
	public  PanelGrid getPanelGrid() {
		return panelGrid;
	}

	public  void setPanelGrid(PanelGrid panelGrid) {
		IdiomaHelper.panelGrid = panelGrid;
	}

}
