package com.academitics.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.Session;

import com.academitics.text.ColumnModel;

public class LlenarControles {

	/* Llenar SelectOneMenu */
	public static List<SelectItem> llenarCombo(List<?> coleccion, String Qry) {
		List<SelectItem> items = new ArrayList<SelectItem>();
		coleccion = traerDatos(Qry);

		Iterator<?> iter = coleccion.iterator();
		while (iter.hasNext()) {
			Object[] result = (Object[]) iter.next();
			items.add(new SelectItem(result[0], result[1].toString()));
		}
		return items;
	}

	public static List<SelectItem> llenarCombo(String Qry) {
		List<?> coleccion;
		List<SelectItem> items = new ArrayList<SelectItem>();
		coleccion = traerDatos(Qry);

		Iterator<?> iter = coleccion.iterator();
		while (iter.hasNext()) {
			Object[] result = (Object[]) iter.next();
			items.add(new SelectItem(result[0], result[1].toString()));
		}
		return items;
	}

	public static List<?> traerDatos(String Qry) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<?> datos = session.createQuery(Qry).list();
		session.getTransaction().commit();
		return datos;
	}

	/* Llenar Datatable */

	public static List<Object[]> llenarDt(String Qry) {
		List<Object[]> setList;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		setList = session.createQuery(Qry).list();
		// setIdiomasTmp = setIdiomas;
		session.getTransaction().commit();

		return setList;
	}

	public static List<ColumnModel> crearColumnasDinamicas(
			List<ColumnModel> columnas, List<String> VALID_COLUMN_KEYS,
			String columnTemplate) {

		String[] columnKeys = columnTemplate.split(" ");
		columnas = new ArrayList<ColumnModel>();
		int i = 1;
		for (String columnKey : columnKeys) {
			String key = columnKey.trim();
			if (VALID_COLUMN_KEYS.contains(key)) {
				columnas.add(new ColumnModel(columnKey.toUpperCase(), i));
			}
			i++;
		}

		return columnas;
	}	
}
