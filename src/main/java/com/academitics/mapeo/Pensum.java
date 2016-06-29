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
 * Pensum generated by hbm2java
 */
@Entity
@Table(name = "pensum", catalog = "academitics")
public class Pensum implements java.io.Serializable {

	private Integer idPensum;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Integer sucursal;
	private Boolean eliminado;
	private Boolean estado;
	private String anio;
	private String descripcion;
	private int idCarrera;
	private int idNivel;
	private int idJornada;

	public Pensum() {
	}

	public Pensum(int idCarrera, int idNivel, int idJornada) {
		this.idCarrera = idCarrera;
		this.idNivel = idNivel;
		this.idJornada = idJornada;
	}

	public Pensum(Date fechaEliminacion, String usuarioElimina,
			Date fechaModificacion, Date fechaAdicion, String usuarioAdiciona,
			String usuarioModifica, Integer sucursal, Boolean eliminado,
			Boolean estado, String anio, String descripcion, int idCarrera,
			int idNivel, int idJornada) {
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.sucursal = sucursal;
		this.eliminado = eliminado;
		this.estado = estado;
		this.anio = anio;
		this.descripcion = descripcion;
		this.idCarrera = idCarrera;
		this.idNivel = idNivel;
		this.idJornada = idJornada;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_pensum", unique = true, nullable = false)
	public Integer getIdPensum() {
		return this.idPensum;
	}

	public void setIdPensum(Integer idPensum) {
		this.idPensum = idPensum;
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

	@Column(name = "estado")
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Column(name = "anio", length = 4)
	public String getAnio() {
		return this.anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "id_carrera", nullable = false)
	public int getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	@Column(name = "id_nivel", nullable = false)
	public int getIdNivel() {
		return this.idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	@Column(name = "id_jornada", nullable = false)
	public int getIdJornada() {
		return this.idJornada;
	}

	public void setIdJornada(int idJornada) {
		this.idJornada = idJornada;
	}

}
