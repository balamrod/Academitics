package com.academitics.util;

import java.util.List;

import org.hibernate.Session;

import com.academitics.mapeo.Carrera;
import com.academitics.mapeo.Jornada;
import com.academitics.mapeo.Nivel;

public class CicloUtil {

	public static List<Jornada> obtenerJornadas() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Jornada> jornada = session.createQuery(
				"from Jornada where eliminado!= 1  and sucursal = "
						+ Variables.sucursal).list();
		session.getTransaction().commit();

		return jornada;
	}

	
	public static List<Nivel> obtenerNiveles() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Nivel> niveles = session.createQuery(
				"from Nivel where eliminado!= 1  and sucursal = "
						+ Variables.sucursal).list();
		session.getTransaction().commit();

		return niveles;
	}
	
	public static List<Carrera> obtenerCarreras() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Carrera> carreras = session.createQuery(
				"from Carrera").list();
		session.getTransaction().commit();

		return carreras;
	}
}
