package com.academitics.text;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

import com.academitics.DAO.PersonaDireccionDAO;
import com.academitics.mapeo.Municipio;
import com.academitics.util.LlenarControles;
	

@FacesComponent("personaDireccion")
@ManagedBean
@SessionScoped
public class PersonaDireccion extends UINamingContainer implements Serializable {
	
	public PersonaDireccion() {
		departamentos =  LlenarControles.llenarCombo(departamentos,
				PersonaDireccionDAO.comboDepartamento);
		
		depto = departamentos.get(0).getValue().toString();
		
		municipios =  LlenarControles.llenarCombo(municipios,
				PersonaDireccionDAO.qryCboMunicipio(depto));		
		
	}

	List<SelectItem> departamentos;
	List<SelectItem> municipios ;

	String depto;
	String departamento;
	String municipio;
	int zona;
	int avenida;
	int calle;
	String aldea;
	String cacerio;
	String barrio;
	String colonia;
	String canton;
	String numeroCasa;	

	public String Direccion() {
		StringBuffer buffer = new StringBuffer();		
		buffer.append(zona);
		buffer.append(",");
		buffer.append(avenida);
		buffer.append(",");
		buffer.append(calle);
		buffer.append(",");
		buffer.append(aldea);
		buffer.append(",");
		buffer.append(cacerio);
		buffer.append(",");
		buffer.append(barrio);
		buffer.append(",");
		buffer.append(colonia);
		buffer.append(",");
		buffer.append(canton);
		buffer.append(",");
		buffer.append(numeroCasa);		
		return buffer.toString();
	}	
	
	public String obtenerMunicipioNombre(String municipio, List<SelectItem> municipios){
		String municipioEncontrado = null;
		for (int i = 0; i < municipios.size(); i++) {			
			if (municipios.get(i).getValue().toString().equals(municipio))
				municipioEncontrado=municipios.get(i).getLabel();
		}
		
		return municipioEncontrado;
	}
	
	public String obtenerDepartamentoNombre(String depto, List<SelectItem> departamentos){	
		String DepartamentoEncontrado = null;
		for (int i = 0; i < departamentos.size(); i++) {			
			/*
			System.out.println("lista " + departamentos.get(i).getValue().toString().trim());
			System.out.println("municipio  " + depto);
			System.out.println("resultado " + departamentos.get(i).getValue().toString().equals(depto));*/
			if (departamentos.get(i).getValue().toString().equals(depto))
				DepartamentoEncontrado=departamentos.get(i).getLabel();
		}
		
		return DepartamentoEncontrado;
	}
	
	public void cambio(AjaxBehaviorEvent ev) {		
		municipios = LlenarControles.llenarCombo(municipios, PersonaDireccionDAO.qryCboMunicipio(depto));		
	}	
	
	public List<SelectItem> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<SelectItem> departamentos) {
		this.departamentos = departamentos;
	}

	public List<SelectItem> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<SelectItem> municipios) {
		this.municipios = municipios;
	}		
	
	public String getDepto() {	
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getAvenida() {
		return avenida;
	}

	public void setAvenida(int avenida) {
		this.avenida = avenida;
	}

	public int getCalle() {
		return calle;
	}

	public void setCalle(int calle) {
		this.calle = calle;
	}

	public String getAldea() {
		return aldea;
	}

	public void setAldea(String aldea) {
		this.aldea = aldea;
	}

	public String getCacerio() {
		return cacerio;
	}

	public void setCacerio(String cacerio) {
		this.cacerio = cacerio;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
