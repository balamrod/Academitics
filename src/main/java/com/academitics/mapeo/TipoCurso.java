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
 * TipoCurso generated by hbm2java
 */
@Entity
@Table(name = "tipo_curso", catalog = "academitics")
public class TipoCurso implements java.io.Serializable {

	private Integer idTipoCurso;
	private Integer sucursal;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private String usuarioAdicion;
	private String usuarioModificacion;
	private Boolean eliminado;
	private String nombre;

	public TipoCurso() {
	}

	public TipoCurso(Integer sucursal, Date fechaAdicion,
			Date fechaModificacion, String usuarioAdicion,
			String usuarioModificacion, Boolean eliminado, String nombre) {
		this.sucursal = sucursal;
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioAdicion = usuarioAdicion;
		this.usuarioModificacion = usuarioModificacion;
		this.eliminado = eliminado;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tipo_curso", unique = true, nullable = false)
	public Integer getIdTipoCurso() {
		return this.idTipoCurso;
	}

	public void setIdTipoCurso(Integer idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
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

	@Column(name = "usuario_adicion", length = 10)
	public String getUsuarioAdicion() {
		return this.usuarioAdicion;
	}

	public void setUsuarioAdicion(String usuarioAdicion) {
		this.usuarioAdicion = usuarioAdicion;
	}

	@Column(name = "usuario_modificacion", length = 10)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
