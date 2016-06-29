package com.academitics.text;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.model.SelectItem;

import com.academitics.DAO.NombresDAO;
import com.academitics.util.LlenarControles;

@FacesComponent("nombres")
@ManagedBean
@SessionScoped
public class Nombres extends UINamingContainer implements Serializable{
	List<SelectItem> pueblos;
	List<SelectItem> comunidades;
	
	String nombre1;
	String nombre2;
	String nombre3;
	String apellido1;
	String apellido2;
	String apellido3;	
	
	public Nombres () {
		pueblos = LlenarControles.llenarCombo(pueblos,
				NombresDAO.comboPueblo);
		
		comunidades = LlenarControles.llenarCombo(comunidades,
				NombresDAO.comboComunidad);
	}
	
	
	public String Nombre() {		
		StringBuffer buffer = new StringBuffer();
		buffer.append(nombre1);
		buffer.append(",");
		buffer.append(nombre2);
		buffer.append(",");
		buffer.append(nombre3);	
		return buffer.toString();
	}
	
	public String Apellido() {		
		StringBuffer buffer = new StringBuffer();
		buffer.append(apellido1);
		buffer.append(",");
		buffer.append(apellido2);
		buffer.append(",");
		buffer.append(apellido3);	
		return buffer.toString();
	}
	
	public List<SelectItem> getPueblos() {
		return pueblos;
	}

	public void setPueblos(List<SelectItem> pueblos) {
		this.pueblos = pueblos;
	}

	public List<SelectItem> getComunidades() {
		return comunidades;
	}

	public void setComunidades(List<SelectItem> comunidades) {
		this.comunidades = comunidades;
	}
	
	public String getNombre1() {
		System.out.println(nombre1);
		return nombre1;
	}

	public void setNombre1(String nombre1) {		
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getNombre3() {
		return nombre3;
	}

	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getApellido3() {
		return apellido3;
	}

	public void setApellido3(String apellido3) {
		this.apellido3 = apellido3;
	}


	
}
