package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ConfigTablaMaestro generated by hbm2java
 */
@Entity
@Table(name = "config_tabla_maestro", catalog = "academitics")
public class ConfigTablaMaestro implements java.io.Serializable {

	private Integer idConfigTablaMaestro;
	private String query;
	private Byte esMantenimiento;
	private String configurado;
	private String nombreTabla;
	private String clase;

	public ConfigTablaMaestro() {
	}

	public ConfigTablaMaestro(String query, Byte esMantenimiento,
			String configurado, String nombreTabla, String clase) {
		this.query = query;
		this.esMantenimiento = esMantenimiento;
		this.configurado = configurado;
		this.nombreTabla = nombreTabla;
		this.clase = clase;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_config_tabla_maestro", unique = true, nullable = false)
	public Integer getIdConfigTablaMaestro() {
		return this.idConfigTablaMaestro;
	}

	public void setIdConfigTablaMaestro(Integer idConfigTablaMaestro) {
		this.idConfigTablaMaestro = idConfigTablaMaestro;
	}

	@Column(name = "query", length = 65535)
	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Column(name = "esMantenimiento")
	public Byte getEsMantenimiento() {
		return this.esMantenimiento;
	}

	public void setEsMantenimiento(Byte esMantenimiento) {
		this.esMantenimiento = esMantenimiento;
	}

	@Column(name = "configurado", length = 10)
	public String getConfigurado() {
		return this.configurado;
	}

	public void setConfigurado(String configurado) {
		this.configurado = configurado;
	}

	@Column(name = "nombre_tabla", length = 100)
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	@Column(name = "clase", length = 100)
	public String getClase() {
		return this.clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

}
