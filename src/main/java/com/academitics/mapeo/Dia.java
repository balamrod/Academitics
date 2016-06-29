package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dia generated by hbm2java
 */
@Entity
@Table(name = "dia", catalog = "academitics")
public class Dia implements java.io.Serializable {

	private int idDia;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private String usuarioModifica;
	private String usuarioAdiciona;
	private Integer sucursal;
	private String nombre;
	private Boolean eliminado;

	public Dia() {
	}

	public Dia(int idDia) {
		this.idDia = idDia;
	}

	public Dia(int idDia, Date fechaModificacion, Date fechaAdicion,
			Date fechaEliminacion, String usuarioElimina,
			String usuarioModifica, String usuarioAdiciona, Integer sucursal,
			String nombre, Boolean eliminado) {
		this.idDia = idDia;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.usuarioModifica = usuarioModifica;
		this.usuarioAdiciona = usuarioAdiciona;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.eliminado = eliminado;
	}

	@Id
	@Column(name = "id_dia", unique = true, nullable = false)
	public int getIdDia() {
		return this.idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_adicion", length = 19)
	public Date getFechaAdicion() {
		return this.fechaAdicion;
	}

	public void setFechaAdicion(Date fechaAdicion) {
		this.fechaAdicion = fechaAdicion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_eliminacion", length = 19)
	public Date getFechaEliminacion() {
		return this.fechaEliminacion;
	}

	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

	@Column(name = "usuario_elimina", length = 10)
	public String getUsuarioElimina() {
		return this.usuarioElimina;
	}

	public void setUsuarioElimina(String usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}

	@Column(name = "usuario_modifica", length = 10)
	public String getUsuarioModifica() {
		return this.usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	@Column(name = "usuario_adiciona", length = 10)
	public String getUsuarioAdiciona() {
		return this.usuarioAdiciona;
	}

	public void setUsuarioAdiciona(String usuarioAdiciona) {
		this.usuarioAdiciona = usuarioAdiciona;
	}

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "nombre", length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

}
