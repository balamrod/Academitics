package com.academitics.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class mensajes {
	
	public static void msgSevInsertado(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO:",
						"Registro Actualizado Correctamente"));
	}
	
	public static void msgSevEliminado(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta:",
						"Datos eliminados correctamente"));
	}
	
	public static void msgSevActualizado(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO:",
						"Registro Actualizado Correctamente"));
	}
	
	public static void msgSevOpRealizada(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info:",
						"Operación realizada correctamente"));
	}
	
	public static void msgSevNoPuedeEliminar(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Alerta:",
						"No ha seleccionado ningun registro para eliminar"));
	}
}
