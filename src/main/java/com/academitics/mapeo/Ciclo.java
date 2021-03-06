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
 * Ciclo generated by hbm2java
 */
@Entity
@Table(name = "ciclo", catalog = "academitics")
public class Ciclo implements java.io.Serializable {

	private int idCiclo;
	private String descripcion;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private String usuarioModifica;
	private String usuarioAdiciona;
	private Boolean eliminado;
	private Integer sucursal;
	private String nombre;
	private int idTipoCiclo;
	private int idCicloEscolarDetalle;

	public Ciclo() {
	}

	public Ciclo(int idCiclo, int idTipoCiclo, int idCicloEscolarDetalle) {
		this.idCiclo = idCiclo;
		this.idTipoCiclo = idTipoCiclo;
		this.idCicloEscolarDetalle = idCicloEscolarDetalle;
	}

	public Ciclo(int idCiclo, String descripcion, Date fechaAdicion,
			Date fechaModificacion, Date fechaEliminacion,
			String usuarioElimina, String usuarioModifica,
			String usuarioAdiciona, Boolean eliminado, Integer sucursal,
			String nombre, int idTipoCiclo, int idCicloEscolarDetalle) {
		this.idCiclo = idCiclo;
		this.descripcion = descripcion;
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.usuarioModifica = usuarioModifica;
		this.usuarioAdiciona = usuarioAdiciona;
		this.eliminado = eliminado;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.idTipoCiclo = idTipoCiclo;
		this.idCicloEscolarDetalle = idCicloEscolarDetalle;
	}

	@Id
	@Column(name = "id_ciclo", unique = true, nullable = false)
	public int getIdCiclo() {
		return this.idCiclo;
	}

	public void setIdCiclo(int idCiclo) {
		this.idCiclo = idCiclo;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	@Column(name = "fecha_modificacion", length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "nombre", length = 10)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "id_tipo_ciclo", nullable = false)
	public int getIdTipoCiclo() {
		return this.idTipoCiclo;
	}

	public void setIdTipoCiclo(int idTipoCiclo) {
		this.idTipoCiclo = idTipoCiclo;
	}

	@Column(name = "id_ciclo_escolar_detalle", nullable = false)
	public int getIdCicloEscolarDetalle() {
		return this.idCicloEscolarDetalle;
	}

	public void setIdCicloEscolarDetalle(int idCicloEscolarDetalle) {
		this.idCicloEscolarDetalle = idCicloEscolarDetalle;
	}

}
