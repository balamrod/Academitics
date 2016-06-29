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
 * CompresionIdioma generated by hbm2java
 */
@Entity
@Table(name = "compresion_idioma", catalog = "academitics")
public class CompresionIdioma implements java.io.Serializable {

	private Integer idCompresionIdioma;
	private String nombre;
	private String descripcion;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private Date fechaEliminacion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Boolean eliminado;
	private String usuarioElimina;
	private Integer sucursal;

	public CompresionIdioma() {
	}

	public CompresionIdioma(String nombre, String descripcion,
			Date fechaModificacion, Date fechaAdicion, Date fechaEliminacion,
			String usuarioAdiciona, String usuarioModifica, Boolean eliminado,
			String usuarioElimina, Integer sucursal) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.eliminado = eliminado;
		this.usuarioElimina = usuarioElimina;
		this.sucursal = sucursal;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_compresion_idioma", unique = true, nullable = false)
	public Integer getIdCompresionIdioma() {
		return this.idCompresionIdioma;
	}

	public void setIdCompresionIdioma(Integer idCompresionIdioma) {
		this.idCompresionIdioma = idCompresionIdioma;
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

	@Column(name = "sucursal")
	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

}
