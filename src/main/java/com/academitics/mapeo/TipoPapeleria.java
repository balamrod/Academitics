package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TipoPapeleria generated by hbm2java
 */
@Entity
@Table(name = "tipo_papeleria", catalog = "academitics")
public class TipoPapeleria implements java.io.Serializable {

	private Integer idTipoPapeleria;
	private String usuarioElimina;
	private Date fechaElminacion;
	private String usuarioModifica;
	private String usuarioAdiciona;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private Integer sucursal;
	private String nombre;
	private Boolean eliminado;

	public TipoPapeleria() {
	}

	public TipoPapeleria(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public TipoPapeleria(String usuarioElimina, Date fechaElminacion,
			String usuarioModifica, String usuarioAdiciona,
			Date fechaModificacion, Date fechaAdicion, Integer sucursal,
			String nombre, Boolean eliminado) {
		this.usuarioElimina = usuarioElimina;
		this.fechaElminacion = fechaElminacion;
		this.usuarioModifica = usuarioModifica;
		this.usuarioAdiciona = usuarioAdiciona;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.eliminado = eliminado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tipo_papeleria", unique = true, nullable = false)
	public Integer getIdTipoPapeleria() {
		return this.idTipoPapeleria;
	}

	public void setIdTipoPapeleria(Integer idTipoPapeleria) {
		this.idTipoPapeleria = idTipoPapeleria;
	}

	@Column(name = "usuario_elimina", length = 10)
	public String getUsuarioElimina() {
		return this.usuarioElimina;
	}

	public void setUsuarioElimina(String usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_elminacion", length = 19)
	public Date getFechaElminacion() {
		return this.fechaElminacion;
	}

	public void setFechaElminacion(Date fechaElminacion) {
		this.fechaElminacion = fechaElminacion;
	}

	@Column(name = "usuario_modifica", nullable = false, length = 10)
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

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "nombre", length = 50)
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
