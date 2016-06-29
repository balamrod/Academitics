package com.academitics.text;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.FacesComponent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

import com.academitics.DAO.AsignacionGeneralDao;
import com.academitics.util.LlenarControles;

@FacesComponent("asignacionGeneral")
@ManagedBean
@SessionScoped
public class AsignacionGeneral {
	List<SelectItem> niveles;
	List<SelectItem> jornadas;
	List<SelectItem> carreras;
	List<SelectItem> grados;
	String nivel;
	String jornada;
	String carrera;
	String grado;

	public AsignacionGeneral() {
		jornadas = LlenarControles.llenarCombo(jornadas,
				AsignacionGeneralDao.combojornada);

		actualizarJornadas(null);
	}

	public void actualizarJornadas(AjaxBehaviorEvent ev) {
		niveles = null;
		carreras= null;
		grados = null;
		
		if (ev == null)
			jornada = jornadas.get(0).getValue().toString();

		niveles = LlenarControles.llenarCombo(niveles,
				AsignacionGeneralDao.qryCboNivel(jornada));

		if (!jornadas.isEmpty())
			actualizarNiveles(null);

	}

	public void actualizarNiveles(AjaxBehaviorEvent ev) {
		carreras = null;
		carrera = null;
		
		if (ev == null)
			nivel = niveles.get(0).getValue().toString();

		actualizarCarreras(null);

	}

	public void actualizarCarreras(AjaxBehaviorEvent ev) {
		if (!niveles.isEmpty()) {

			carreras = LlenarControles.llenarCombo(carreras,
					AsignacionGeneralDao.qryCboCarrera(jornada, nivel));

			if (ev == null && carreras.size() > 0)
				carrera = carreras.get(0).getValue().toString();

			actualizarGrados(null);
		}

	}

	public void actualizarGrados(AjaxBehaviorEvent ev) {

		grados = LlenarControles.llenarCombo(grados,
				AsignacionGeneralDao.qryCboGrado(jornada, nivel, carrera));

	}
	
	public List<SelectItem> getNiveles() {
		return niveles;
	}

	public void setNiveles(List<SelectItem> niveles) {
		this.niveles = niveles;
	}

	public List<SelectItem> getJornadas() {
		return jornadas;
	}

	public void setJornadas(List<SelectItem> jornadas) {
		this.jornadas = jornadas;
	}

	public List<SelectItem> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<SelectItem> carreras) {
		this.carreras = carreras;
	}

	public List<SelectItem> getGrados() {
		return grados;
	}

	public void setGrados(List<SelectItem> grados) {
		this.grados = grados;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

}
