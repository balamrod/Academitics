package com.academitics.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.SelectEvent;

import com.academitics.DAO.FamiliarDAO;
import com.academitics.mapeo.Familiar;
import com.academitics.util.LlenarControles;

@ManagedBean
@SessionScoped
public class FamiliarHelper {

	private Familiar nuevo = new Familiar(false, 1, 1, 1);
	private Nombres nombres = new Nombres();
	private List<?> setFamiliares;
	private Object[] seleccionado;
	private List<ColumnModel> columns;
	private final static List<String> VALID_COLUMN_KEYS = Arrays.asList("idFamiliar",
			"esEncargado", "Nombre", "nombres", "apellidos");

	private String columnTemplate = "idFamiliar esEncargado Nombre nombres apellidos";

	public FamiliarHelper() {
		setFamiliares = LlenarControles.llenarDt(FamiliarDAO.qryDtFamilia("1",
				"1", "1", "1"));
		createDynamicColumns();
	}

	private void createDynamicColumns() {
		String[] columnKeys = columnTemplate.split(" ");
		columns = new ArrayList<ColumnModel>();
		int i = 0 ;
		for (String columnKey : columnKeys) {
			String key = columnKey.trim();			
			if (VALID_COLUMN_KEYS.contains(key)) {
				columns.add(new ColumnModel(columnKey.toUpperCase(), i));
			}
			i++;
		}

		/*
		 * esto me sirivio para recuperar los datos de cada columna del query.
		 * for(int i=0; i<setFamiliares.size(); i++) { Object[] objArr =
		 * (Object[]) setFamiliares.get(i); for(Object obj: objArr){
		 * System.out.println(obj); } }
		 */
	}

	public Familiar getNuevo() {
		return nuevo;
	}

	public void setNuevo(Familiar nuevo) {
		this.nuevo = nuevo;
	}

	public Nombres getNombres() {
		return nombres;
	}

	public void setNombres(Nombres nombres) {
		this.nombres = nombres;
	}

	public List<?> getSetFamiliares() {
		return setFamiliares;
	}

	public void setSetFamiliares(List<?> setFamiliares) {
		this.setFamiliares = setFamiliares;
	}

	public Object[] getSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(Object[] seleccionado) {
		this.seleccionado = seleccionado;
	}

	public void onRowSelect(SelectEvent event) {

	}
	

	public List<ColumnModel> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnModel> columns) {
		this.columns = columns;
	}

}
