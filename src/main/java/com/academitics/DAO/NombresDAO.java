package com.academitics.DAO;

import com.academitics.util.Variables;

public class NombresDAO {
	
	public static String comboPueblo = "select distinct idPueblo, nombre "
			+ "from Pueblo "			
			+ " where sucursal = "	+ Variables.sucursal
			+ " and eliminado = 0 ";
	
	public static String comboComunidad = "select distinct idComunidadEtnica, nombre "
			+ "from ComunidadEtnica "			
			+ " where sucursal = "	+ Variables.sucursal
			+ " and eliminado = 0 ";

}
