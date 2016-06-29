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
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso", catalog = "academitics")
public class Curso implements java.io.Serializable {

	private Integer idCurso;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private Date fechaModificacion;
	private Date fechaAdicion;
	private String usuarioModifica;
	private String usuarioAdiciona;
	private Integer sucursal;
	private Boolean eliminado;
	private String codigo;
	private Boolean estado;
	private String nombre;
	private int idTipoCurso;

	public Curso() {
	}

	public Curso(int idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}

	public Curso(Date fechaEliminacion, String usuarioElimina,
			Date fechaModificacion, Date fechaAdicion, String usuarioModifica,
			String usuarioAdiciona, Integer sucursal, Boolean eliminado,
			String codigo, Boolean estado, String nombre, int idTipoCurso) {
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.fechaModificacion = fechaModificacion;
		this.fechaAdicion = fechaAdicion;
		this.usuarioModifica = usuarioModifica;
		this.usuarioAdiciona = usuarioAdiciona;
		this.sucursal = sucursal;
		this.eliminado = eliminado;
		this.codigo = codigo;
		this.estado = estado;
		this.nombre = nombre;
		this.idTipoCurso = idTipoCurso;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_curso", unique = true, nullable = false)
	public Integer getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
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

	@Column(name = "eliminado")
	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	@Column(name = "codigo", length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "estado")
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "id_tipo_curso", nullable = false)
	public int getIdTipoCurso() {
		return this.idTipoCurso;
	}

	public void setIdTipoCurso(int idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}

}
