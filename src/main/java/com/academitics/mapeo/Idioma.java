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
 * Idioma generated by hbm2java
 */
@Entity
@Table(name = "idioma", catalog = "academitics")
public class Idioma implements java.io.Serializable {

	private Integer idIdioma;
	private String nombre;
	private String descripcion;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Boolean eliminado;
	private String usuarioElimina;
	private Date fechaEliminacion;
	private Integer sucursal;
	private int grupoIdioma;

	public Idioma() {
	}

	public Idioma(int grupoIdioma) {
		this.grupoIdioma = grupoIdioma;
	}

	public Idioma(String nombre, String descripcion, Date fechaAdicion,
			Date fechaModificacion, String usuarioAdiciona,
			String usuarioModifica, Boolean eliminado, String usuarioElimina,
			Date fechaEliminacion, Integer sucursal, int grupoIdioma) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.eliminado = eliminado;
		this.usuarioElimina = usuarioElimina;
		this.fechaEliminacion = fechaEliminacion;
		this.sucursal = sucursal;
		this.grupoIdioma = grupoIdioma;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_idioma", unique = true, nullable = false)
	public Integer getIdIdioma() {
		return this.idIdioma;
	}

	public void setIdIdioma(Integer idIdioma) {
		this.idIdioma = idIdioma;
	}

	@Column(name = "nombre", length = 50)
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

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
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

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "grupo_idioma", nullable = false)
	public int getGrupoIdioma() {
		return this.grupoIdioma;
	}

	public void setGrupoIdioma(int grupoIdioma) {
		this.grupoIdioma = grupoIdioma;
	}

}
