package com.academitics.DAO;

import com.academitics.util.Variables;

public class FamiliarDAO {

	public static String qryDtFamilia(String anio, String correlativo, String carrera, String nivel) {

		String qry = " select ae.id.idAlumnoFamiliar as idFam, ae.esEncargado, tf.nombre,  f.nombres, f.apellidos"
				+ " from AlumnoEncargado ae, Familiar f, TipoFamiliar tf "
				+ " where ae.id.idFamiliar = f.idFamiliar "
				+ " and tf.idTipoFamiliar = f.idTipoFamiliar "
				+ " and ae.id.idAnio = " + anio
				+ " and ae.id.idCorrelativo  = " + correlativo
				+ " and ae.id.idCarrera = " + carrera
				+ " and ae.id.idNivel = " + nivel				
				+ " and ae.sucursal = " + Variables.sucursal
				+ " and ae.eliminado = 0 ";	
		
		return qry;
	}

}
