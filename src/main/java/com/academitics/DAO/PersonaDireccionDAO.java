package com.academitics.DAO;

public class PersonaDireccionDAO {

	public static String comboDepartamento = "select idDepartamento, nombre "
			+ "from Departamento ";		
		
	
	public static String qryCboMunicipio( String departamento) {		
		String comboMunicipio = "select id, nombre "
				+ "from Municipio "			
				+ " where id_departamento = " + departamento ;
		
		return comboMunicipio;
	}
	
}
