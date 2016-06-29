package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Periodo generated by hbm2java
 */
@Entity
@Table(name = "periodo", catalog = "academitics")
public class Periodo implements java.io.Serializable {

	private Integer idPeriodo;
	private Integer idTipoCiclo;
	private Integer sucursal;
	private Boolean eliminado;
	private String nombre;
	private String idTipoPeriodo;

	public Periodo() {
	}

	public Periodo(String idTipoPeriodo) {
		this.idTipoPeriodo = idTipoPeriodo;
	}

	public Periodo(Integer idTipoCiclo, Integer sucursal, Boolean eliminado,
			String nombre, String idTipoPeriodo) {
		this.idTipoCiclo = idTipoCiclo;
		this.sucursal = sucursal;
		this.eliminado = eliminado;
		this.nombre = nombre;
		this.idTipoPeriodo = idTipoPeriodo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_periodo", unique = true, nullable = false)
	public Integer getIdPeriodo() {
		return this.idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	@Column(name = "id_tipo_ciclo")
	public Integer getIdTipoCiclo() {
		return this.idTipoCiclo;
	}

	public void setIdTipoCiclo(Integer idTipoCiclo) {
		this.idTipoCiclo = idTipoCiclo;
	}

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	@Column(name = "nombre", length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "id_tipo_periodo", nullable = false, length = 10)
	public String getIdTipoPeriodo() {
		return this.idTipoPeriodo;
	}

	public void setIdTipoPeriodo(String idTipoPeriodo) {
		this.idTipoPeriodo = idTipoPeriodo;
	}

}