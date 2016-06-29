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
 * CicloEscolarDetalle generated by hbm2java
 */
@Entity
@Table(name = "ciclo_escolar_detalle", catalog = "academitics")
public class CicloEscolarDetalle implements java.io.Serializable {

	private Integer idCicloEscolarDetalle;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Boolean activo;
	private String idCarrera;
	private Integer sucursal;
	private String nombre;
	private Boolean eliminado;
	private int idJornada;
	private int idNivel;
	private int idPensum;
	private int anio;

	public CicloEscolarDetalle() {
	}

	public CicloEscolarDetalle(int idJornada, int idNivel, int idPensum,
			int anio) {
		this.idJornada = idJornada;
		this.idNivel = idNivel;
		this.idPensum = idPensum;
		this.anio = anio;
	}

	public CicloEscolarDetalle(Date fechaEliminacion, String usuarioElimina,
			Date fechaModificacion, Date fechaAdicion, String usuarioAdiciona,
			String usuarioModifica, Boolean activo, String idCarrera,
			Integer sucursal, String nombre, Boolean eliminado, int idJornada,
			int idNivel, int idPensum, int anio) {
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.activo = activo;
		this.idCarrera = idCarrera;
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.eliminado = eliminado;
		this.idJornada = idJornada;
		this.idNivel = idNivel;
		this.idPensum = idPensum;
		this.anio = anio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_ciclo_escolar_detalle", unique = true, nullable = false)
	public Integer getIdCicloEscolarDetalle() {
		return this.idCicloEscolarDetalle;
	}

	public void setIdCicloEscolarDetalle(Integer idCicloEscolarDetalle) {
		this.idCicloEscolarDetalle = idCicloEscolarDetalle;
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

	@Column(name = "activo")
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Column(name = "id_carrera", length = 2)
	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
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

	@Column(name = "id_jornada", nullable = false)
	public int getIdJornada() {
		return this.idJornada;
	}

	public void setIdJornada(int idJornada) {
		this.idJornada = idJornada;
	}

	@Column(name = "id_nivel", nullable = false)
	public int getIdNivel() {
		return this.idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	@Column(name = "id_pensum", nullable = false)
	public int getIdPensum() {
		return this.idPensum;
	}

	public void setIdPensum(int idPensum) {
		this.idPensum = idPensum;
	}

	@Column(name = "anio", nullable = false)
	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
