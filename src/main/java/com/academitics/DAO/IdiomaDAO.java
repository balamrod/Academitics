package com.academitics.DAO;

public class IdiomaDAO {

	public static String tblIdiomasCampos = "select i.idIdioma, "
			+ "gi.nombre, "
			+ "i.nombre, "
			+ "i.descripcion, "
			+ "i.usuarioAdiciona,"
			+ "i.fechaAdicion,"
			+ "i.fechaModificacion, "
			+ "i.usuarioModifica ";

	public static String tblIdiomas = tblIdiomasCampos 
			+ " from Idioma i, GrupoIdioma gi  " + " where i.eliminado != 1"
			+ " and i.grupoIdioma = gi.grupoIdioma";
	/* + " and i.sucursal = " + Variables.sucursal; */
}
