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
 * Pueblo generated by hbm2java
 */
@Entity
@Table(name = "pueblo", catalog = "academitics")
public class Pueblo implements java.io.Serializable {

	private Integer idPueblo;
	private Date fechaModificacion;
	private Date fechaEliminacion;
	private Date fechaAdicion;
	private String usuarioModifica;
	private String usuarioElimina;
	private String usuarioAdiciona;
	private Boolean eliminado;
	private Integer sucursal;
	private String nombre;
	private String descripcion;

	public Pueblo() {
	}

	public Pueblo(Date fechaModificacion, Date fechaEliminacion,
			Date fechaAdicion, String usuarioModifica, String usuarioElimina,
			String usuarioAdiciona, Boolean eliminado, Integer sucursal,
			String nombre, String descripcion) {
		this.fechaModificacion = fechaModificacion;
		this.fechaEliminacion = fechaEliminacion;
		this.fechaAdicion = fechaAdicion;
		this.usuarioModifica = usuarioModifica;
		this.usuarioElimina = usuarioElimina;
		this.usuarioAdiciona = usuarioAdiciona;
		this.eliminado = eliminado;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_pueblo", unique = true, nullable = false)
	public Integer getIdPueblo() {
		return this.idPueblo;
	}

	public void setIdPueblo(Integer idPueblo) {
		this.idPueblo = idPueblo;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_adicion", length = 19)
	public Date getFechaAdicion() {
		return this.fechaAdicion;
	}

	public void setFechaAdicion(Date fechaAdicion) {
		this.fechaAdicion = fechaAdicion;
	}

	@Column(name = "usuario_modifica", length = 10)
	public String getUsuarioModifica() {
		return this.usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	@Column(name = "usuario_elimina", length = 10)
	public String getUsuarioElimina() {
		return this.usuarioElimina;
	}

	public void setUsuarioElimina(String usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
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

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
