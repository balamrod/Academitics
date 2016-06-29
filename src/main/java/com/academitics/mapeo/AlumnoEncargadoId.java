package com.academitics.mapeo;

// Generated 10/06/2016 05:07:22 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AlumnoEncargadoId generated by hbm2java
 */
@Embeddable
public class AlumnoEncargadoId implements java.io.Serializable {

	private String idAnio;
	private int idCorrelativo;
	private int idCarrera;
	private int idNivel;
	private int idFamiliar;
	private int idAlumnoFamiliar;

	public AlumnoEncargadoId() {
	}

	public AlumnoEncargadoId(String idAnio, int idCorrelativo, int idCarrera,
			int idNivel, int idFamiliar, int idAlumnoFamiliar) {
		this.idAnio = idAnio;
		this.idCorrelativo = idCorrelativo;
		this.idCarrera = idCarrera;
		this.idNivel = idNivel;
		this.idFamiliar = idFamiliar;
		this.idAlumnoFamiliar = idAlumnoFamiliar;
	}

	@Column(name = "id_anio", nullable = false, length = 2)
	public String getIdAnio() {
		return this.idAnio;
	}

	public void setIdAnio(String idAnio) {
		this.idAnio = idAnio;
	}

	@Column(name = "id_correlativo", nullable = false)
	public int getIdCorrelativo() {
		return this.idCorrelativo;
	}

	public void setIdCorrelativo(int idCorrelativo) {
		this.idCorrelativo = idCorrelativo;
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

	@Column(name = "id_familiar", nullable = false)
	public int getIdFamiliar() {
		return this.idFamiliar;
	}

	public void setIdFamiliar(int idFamiliar) {
		this.idFamiliar = idFamiliar;
	}

	@Column(name = "id_alumno_familiar", nullable = false)
	public int getIdAlumnoFamiliar() {
		return this.idAlumnoFamiliar;
	}

	public void setIdAlumnoFamiliar(int idAlumnoFamiliar) {
		this.idAlumnoFamiliar = idAlumnoFamiliar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AlumnoEncargadoId))
			return false;
		AlumnoEncargadoId castOther = (AlumnoEncargadoId) other;

		return ((this.getIdAnio() == castOther.getIdAnio()) || (this
				.getIdAnio() != null && castOther.getIdAnio() != null && this
				.getIdAnio().equals(castOther.getIdAnio())))
				&& (this.getIdCorrelativo() == castOther.getIdCorrelativo())
				&& (this.getIdCarrera() == castOther.getIdCarrera())
				&& (this.getIdNivel() == castOther.getIdNivel())
				&& (this.getIdFamiliar() == castOther.getIdFamiliar())
				&& (this.getIdAlumnoFamiliar() == castOther
						.getIdAlumnoFamiliar());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdAnio() == null ? 0 : this.getIdAnio().hashCode());
		result = 37 * result + this.getIdCorrelativo();
		result = 37 * result + this.getIdCarrera();
		result = 37 * result + this.getIdNivel();
		result = 37 * result + this.getIdFamiliar();
		result = 37 * result + this.getIdAlumnoFamiliar();
		return result;
	}

}