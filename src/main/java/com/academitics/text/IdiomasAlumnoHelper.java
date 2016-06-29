package com.academitics.text;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.academitics.mapeo.IdiomasAlumno;

@ManagedBean
@SessionScoped
public class IdiomasAlumnoHelper {
	
	IdiomasAlumno nuevo = new IdiomasAlumno();

	public IdiomasAlumno getNuevo() {
		return nuevo;
	}

	public void setNuevo(IdiomasAlumno nuevo) {
		this.nuevo = nuevo;
	}

}
