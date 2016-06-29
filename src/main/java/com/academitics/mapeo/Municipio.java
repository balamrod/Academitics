package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name = "municipio", catalog = "academitics")
public class Municipio implements java.io.Serializable {

	private MunicipioId id;
	private String nombre;

	public Municipio() {
	}

	public Municipio(MunicipioId id) {
		this.id = id;
	}

	public Municipio(MunicipioId id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMunicipio", column = @Column(name = "id_municipio", nullable = false)),
			@AttributeOverride(name = "idDepartamento", column = @Column(name = "id_departamento", nullable = false)) })
	public MunicipioId getId() {
		return this.id;
	}

	public void setId(MunicipioId id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
