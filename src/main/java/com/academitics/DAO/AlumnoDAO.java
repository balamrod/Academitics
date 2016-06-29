package com.academitics.DAO;

import com.academitics.util.Variables;

public class AlumnoDAO {

	public static String qryCboGrupoIdioma(String grupoIdioma) {

		String qry = "select idIdioma,nombre from Idioma "
				+ " where grupoIdioma = " + grupoIdioma + " and sucursal = "
				+ Variables.sucursal + " and eliminado = 0 ";		
		return qry;
	}

}
