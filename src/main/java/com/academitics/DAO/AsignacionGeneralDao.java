package com.academitics.DAO;

import com.academitics.util.Variables;

public class AsignacionGeneralDao {
	
	public static String combojornada = "select distinct j.idJornada, j.nombre "
			+ "from CicloEscolarDetalle ced, Jornada j "
			+ "where  j.idJornada = ced.idJornada "
			+ "and anio = '" + Variables.anio + "'"
			+ "and ced.sucursal = "	+ Variables.sucursal
			+ " and ced.eliminado = 0 ";
	
	public static String qryCboNivel( String jornada) {
		
		String comboNivel = "select distinct n.idNivel, n.nombre "
				+ " from Nivel n, CicloEscolarDetalle ced "
				+ " where n.idNivel = ced.idNivel " 
				+ " and ced.idJornada = " + jornada 
				+ " and anio = '" + Variables.anio + "'" 
				+ " and ced.sucursal = " + Variables.sucursal
				+ " and ced.eliminado = 0 ";
		
		return comboNivel;
	}	 	
	
	public static String qryCboCarrera( String jornada, String nivel) {
		
		String comboCarrera = "select distinct c.idCarrera, c.nombre "			
			+ " from CicloEscolarDetalle ced, Carrera c "
			+ " where c.idCarrera = ced.idCarrera "
			+ " and ced.idJornada = " + jornada
			+ " and ced.idNivel = " + nivel
			+ " and anio = '" + Variables.anio + "'"
			+ " and ced.sucursal = "	+ Variables.sucursal
			+ " and ced.eliminado = 0 ";
		
		System.out.println("CarreraQuery = " + comboCarrera);

		return comboCarrera;
	}	 

	public static String qryCboGrado( String jornada, String nivel, String carrera) {
		String comboGrado = "select distinct c.idCiclo, c.nombre "
				+ " from CicloEscolarDetalle ced, Ciclo c "
				+ " where c.idCicloEscolarDetalle = ced.idCicloEscolarDetalle "
				+ " and ced.idJornada =  " + jornada
				+ " and ced.idNivel =  " + nivel
				+ " and ced.idCarrera =  " + carrera
				+ " and anio = '" + Variables.anio + "'"
				+ " and c.sucursal = " + Variables.sucursal 
				+ " and c.eliminado = 0 ";
		
		return comboGrado;
		
	}
	
}
