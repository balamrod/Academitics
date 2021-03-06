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
 * Empleado generated by hbm2java
 */
@Entity
@Table(name = "empleado", catalog = "academitics")
public class Empleado implements java.io.Serializable {

	private Integer idEmpleado;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Integer sucursal;
	private Boolean eliminado;
	private String foto;
	private Date fechaIngreso;
	private Date fechaSalida;
	private String nombre;
	private String direccion;
	private Integer telefono;
	private Integer celular;
	private String cui;
	private Boolean estado;
	private int idTipoEmpleado;
	private Integer idUsuario;

	public Empleado() {
	}

	public Empleado(int idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}

	public Empleado(Date fechaAdicion, Date fechaModificacion,
			String usuarioAdiciona, String usuarioModifica, Integer sucursal,
			Boolean eliminado, String foto, Date fechaIngreso,
			Date fechaSalida, String nombre, String direccion,
			Integer telefono, Integer celular, String cui, Boolean estado,
			int idTipoEmpleado, Integer idUsuario) {
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.sucursal = sucursal;
		this.eliminado = eliminado;
		this.foto = foto;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.celular = celular;
		this.cui = cui;
		this.estado = estado;
		this.idTipoEmpleado = idTipoEmpleado;
		this.idUsuario = idUsuario;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_empleado", unique = true, nullable = false)
	public Integer getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	@Column(name = "foto")
	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_ingreso", length = 19)
	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_salida", length = 19)
	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono")
	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	@Column(name = "celular")
	public Integer getCelular() {
		return this.celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	@Column(name = "cui", length = 15)
	public String getCui() {
		return this.cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	@Column(name = "estado")
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Column(name = "id_tipo_empleado", nullable = false)
	public int getIdTipoEmpleado() {
		return this.idTipoEmpleado;
	}

	public void setIdTipoEmpleado(int idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}

	@Column(name = "id_usuario")
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
