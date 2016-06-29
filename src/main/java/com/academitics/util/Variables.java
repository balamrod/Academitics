package com.academitics.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Variables {
	public static int sucursal  = 1;	
	public static String usuarioSesion  = "blfrodri";	
	public String redireccionarLink ="/sicin/secure/categoria2.jsf";
		 
	public static String anio = new SimpleDateFormat("yyyy").format(new Date());
	public static String idAnio = anio.substring(anio.length() - 2);
	public static int idCarrera = 1;
	public static Object[] seleccionadoG = new Object[100];
}
