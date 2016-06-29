package com.academitics.util;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.academitics.mapeo.ConfigTabla;

public class CfgUtil {
	/* inserción masiva */
	public static void insertarCfg(String Qry) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		SQLQuery sqlQuery = session
				.createSQLQuery(Qry);
		sqlQuery.executeUpdate();
		session.getTransaction().commit();	
		
	}
	
	public static List<ConfigTabla>  validarTabla(String tabla) {
		
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<ConfigTabla> configTabla = session.createQuery("from ConfigTabla where tabla = '" + tabla + "' order by orden asc").list();
			session.getTransaction().commit();
			
			return configTabla;		
	}
}
