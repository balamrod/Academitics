package com.academitics.mapeo;

// Generated 31/07/2015 07:24:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AlumnoId generated by hbm2java
 */
@Embeddable
public class AlumnoId implements java.io.Serializable {

	private String idAnio;
	private int idCorrelativo;
	private int idCarrera;
	private int idNivel;

	public AlumnoId() {
	}

	public AlumnoId(String idAnio, int idCarrera, int idNivel) {
		this.idAnio = idAnio;		
		this.idCarrera = idCarrera;
		this.idNivel = idNivel;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AlumnoId))
			return false;
		AlumnoId castOther = (AlumnoId) other;

		return ((this.getIdAnio() == castOther.getIdAnio()) || (this
				.getIdAnio() != null && castOther.getIdAnio() != null && this
				.getIdAnio().equals(castOther.getIdAnio())))
				&& (this.getIdCorrelativo() == castOther.getIdCorrelativo())
				&& (this.getIdCarrera() == castOther.getIdCarrera())
				&& (this.getIdNivel() == castOther.getIdNivel());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdAnio() == null ? 0 : this.getIdAnio().hashCode());
		result = 37 * result + this.getIdCorrelativo();
		result = 37 * result + this.getIdCarrera();
		result = 37 * result + this.getIdNivel();
		return result;
	}

}
