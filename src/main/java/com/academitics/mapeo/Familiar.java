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
 * Familiar generated by hbm2java
 */
@Entity
@Table(name = "familiar", catalog = "academitics")
public class Familiar implements java.io.Serializable {

	private Integer idFamiliar;
	private Date fechaEliminacion;
	private String usuarioElimina;
	private String pasaporte;
	private String comunidadEtnica;
	private String pueblo;
	private Date fechaAdicion;
	private Date fechaModificacion;
	private String usuarioAdiciona;
	private String usuarioModifica;
	private Integer sucursal;
	private String foto;
	private Boolean genero;
	private String relacionParentesco;
	private Date fechaNac;
	private String correo;
	private boolean eliminado;
	private String cui;
	private Boolean estado;
	private String nombres;
	private String apellidos;
	private String direccion;
	private Integer telefono;
	private Integer celular;
	private int idTipoFamiliar;
	private int idComunidadEtnica;
	private int idPueblo;

	public Familiar() {
	}

	public Familiar(boolean eliminado, int idTipoFamiliar,
			int idComunidadEtnica, int idPueblo) {
		this.eliminado = eliminado;
		this.idTipoFamiliar = idTipoFamiliar;
		this.idComunidadEtnica = idComunidadEtnica;
		this.idPueblo = idPueblo;
	}

	public Familiar(Date fechaEliminacion, String usuarioElimina,
			String pasaporte, String comunidadEtnica, String pueblo,
			Date fechaAdicion, Date fechaModificacion, String usuarioAdiciona,
			String usuarioModifica, Integer sucursal, String foto,
			Boolean genero, String relacionParentesco, Date fechaNac,
			String correo, boolean eliminado, String cui, Boolean estado,
			String nombres, String apellidos, String direccion,
			Integer telefono, Integer celular, int idTipoFamiliar,
			int idComunidadEtnica, int idPueblo) {
		this.fechaEliminacion = fechaEliminacion;
		this.usuarioElimina = usuarioElimina;
		this.pasaporte = pasaporte;
		this.comunidadEtnica = comunidadEtnica;
		this.pueblo = pueblo;
		this.fechaAdicion = fechaAdicion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioAdiciona = usuarioAdiciona;
		this.usuarioModifica = usuarioModifica;
		this.sucursal = sucursal;
		this.foto = foto;
		this.genero = genero;
		this.relacionParentesco = relacionParentesco;
		this.fechaNac = fechaNac;
		this.correo = correo;
		this.eliminado = eliminado;
		this.cui = cui;
		this.estado = estado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.celular = celular;
		this.idTipoFamiliar = idTipoFamiliar;
		this.idComunidadEtnica = idComunidadEtnica;
		this.idPueblo = idPueblo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_familiar", unique = true, nullable = false)
	public Integer getIdFamiliar() {
		return this.idFamiliar;
	}

	public void setIdFamiliar(Integer idFamiliar) {
		this.idFamiliar = idFamiliar;
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

	@Column(name = "pasaporte", length = 25)
	public String getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	@Column(name = "comunidad_etnica", length = 30)
	public String getComunidadEtnica() {
		return this.comunidadEtnica;
	}

	public void setComunidadEtnica(String comunidadEtnica) {
		this.comunidadEtnica = comunidadEtnica;
	}

	@Column(name = "pueblo", length = 30)
	public String getPueblo() {
		return this.pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
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

	@Column(name = "foto")
	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name = "genero")
	public Boolean getGenero() {
		return this.genero;
	}

	public void setGenero(Boolean genero) {
		this.genero = genero;
	}

	@Column(name = "relacion_parentesco", length = 50)
	public String getRelacionParentesco() {
		return this.relacionParentesco;
	}

	public void setRelacionParentesco(String relacionParentesco) {
		this.relacionParentesco = relacionParentesco;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nac", length = 10)
	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Column(name = "correo", length = 50)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "eliminado", nullable = false)
	public boolean isEliminado() {
		return this.eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
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

	@Column(name = "nombres")
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "apellidos")
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	@Column(name = "id_tipo_familiar", nullable = false)
	public int getIdTipoFamiliar() {
		return this.idTipoFamiliar;
	}

	public void setIdTipoFamiliar(int idTipoFamiliar) {
		this.idTipoFamiliar = idTipoFamiliar;
	}

	@Column(name = "id_comunidad_etnica", nullable = false)
	public int getIdComunidadEtnica() {
		return this.idComunidadEtnica;
	}

	public void setIdComunidadEtnica(int idComunidadEtnica) {
		this.idComunidadEtnica = idComunidadEtnica;
	}

	@Column(name = "id_pueblo", nullable = false)
	public int getIdPueblo() {
		return this.idPueblo;
	}

	public void setIdPueblo(int idPueblo) {
		this.idPueblo = idPueblo;
	}

}
