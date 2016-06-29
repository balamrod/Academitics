package com.academitics.util;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class Maestro {
	public static void insertar(String tabla, String columnas, String valores) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		SQLQuery sqlQuery = session
				.createSQLQuery("insert into  "
						+ tabla
						+ "("
						+ columnas
						+ " Eliminado, Usuario_Adiciona,Fecha_Adicion, sucursal) values("
						+ valores + " 0,'" + Variables.usuarioSesion
						+ "',NOW()," + Variables.sucursal + ")");
		sqlQuery.executeUpdate();
		session.getTransaction().commit();		
	}

	public static void eliminar(String tabla, String id, String idTabla) {
		/*Falta colocar la actualización del registro, fecha usuario elimina.*/
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery("delete from " + tabla
				+ " where  " + idTabla + " = " + id);
		
		sqlQuery.executeUpdate();
		session.getTransaction().commit();		
	}
	
	public static void editar(String tabla, String columnas, String valores, String idTabla, String id) {
		/*Falta colocar la actualización del registro, fecha usuario modifica.*/
		String[] columnasArray = columnas.split(",");
		String[] valoresArray = valores.split(",");
		String updates = "";

		for (int i = 0; i < columnasArray.length; i++) {
			updates += " " + columnasArray[i] + " = " + valoresArray[i] + ", ";			
		}
		
		updates = updates.substring(0, updates.length()-2);

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery("update " + tabla	+ " set  " + updates + " where " + idTabla + " = " + id);
		
		System.out.println("query para editar: " +  " update from " + tabla
				+ " set  " + updates + " where " + idTabla + " = " + id);
		

		sqlQuery.executeUpdate();
		session.getTransaction().commit();

	}

	public static String traerDatosSelectOneMenu(String id, String tabla) {
		String ComboStr = "select " + id + ", nombre  from " + tabla
				+ " where sucursal = " + Variables.sucursal
				+ " and eliminado = 0 ";

		return ComboStr;
	}
	
	public static List<Object[]> obtenerDatos(String Qry) {
		List<Object[]> setList;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		setList = session.createQuery(Qry).list();
		// setIdiomasTmp = setIdiomas;
		session.getTransaction().commit();

		return setList;
	}
}
