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
 * Carrera generated by hbm2java
 */
@Entity
@Table(name = "carrera", catalog = "academitics")
public class Carrera implements java.io.Serializable {

	private Integer idCarrera;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private String usuarioElimina;
	private Date fechaEliminacion;
	private Boolean eliminado;
	private Integer sucursal;
	private String nombre;
	private int idNivel;

	public Carrera() {
	}

	public Carrera(int idNivel) {
		this.idNivel = idNivel;
	}

	public Carrera(String usuarioAdiciona, String usuarioModifica,
			Date fechaAdicion, Date fechaModificacion, String usuarioElimina,
			Date fechaEliminacion, Boolean eliminado, Integer sucursal,
			String nombre, int idNivel) {
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioElimina = usuarioElimina;
		this.fechaEliminacion = fechaEliminacion;
		this.eliminado = eliminado;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.idNivel = idNivel;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_carrera", unique = true, nullable = false)
	public Integer getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
	}

	@Column(name = "usuario_adiciona", length = 10)
	public String getUsuarioAdiciona() {
		return this.usuarioAdiciona;
	}

	public void setUsuarioAdiciona(String usuarioAdiciona) {
		this.usuarioAdiciona = usuarioAdiciona;
	}

	@Column(name = "usuario_modifica", length = 10)
	public String getUsuarioModifica() {
		return this.usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
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

	@Column(name = "usuario_elimina", length = 10)
	public String getUsuarioElimina() {
		return this.usuarioElimina;
	}

	public void setUsuarioElimina(String usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_eliminacion", length = 19)
	public Date getFechaEliminacion() {
		return this.fechaEliminacion;
	}

	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
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

	@Column(name = "nombre", length = 250)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "id_nivel", nullable = false)
	public int getIdNivel() {
		return this.idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

}
