package com.academitics.text;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.hibernate.Session;

import com.academitics.DAO.AlumnoDAO;
import com.academitics.mapeo.Alumno;
import com.academitics.mapeo.Idioma;
import com.academitics.util.HibernateUtil;
import com.academitics.util.LlenarControles;
import com.academitics.util.Variables;

@ManagedBean
@SessionScoped
public class AlumnoHelper{	
	private Alumno nuevo;
	private Idioma idioma;
	private List<SelectItem> idiomas;
	
	public AlumnoHelper() {
		nuevo = new Alumno(Variables.idAnio, Variables.idCarrera, 4);	
		
		actualizarIdiomas();
	}
	private PersonaDireccion direccionActual = new PersonaDireccion();
	private PersonaDireccion direccionNacimiento = new PersonaDireccion();
	private Nombres nombresAlumno = new Nombres();
	
	public void actualizarIdiomas(){
		idiomas = LlenarControles.llenarCombo(idiomas,
				AlumnoDAO.qryCboGrupoIdioma("0"));		
	}
	
	public void guardar() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
			
		nuevo.setDireccionActual(direccionActual.Direccion()); 
		nuevo.setNombres(nombresAlumno.Nombre());
		nuevo.setApellidos(nombresAlumno.Apellido());
		System.out.println("codigoMineduc= " + nuevo.getCodigoMineduc());
		System.out.println("nombresALumno:  "+ nombresAlumno.Nombre() + " apellido: " + nombresAlumno.Apellido());
		
		session.save(nuevo);
		session.getTransaction().commit();	
	}

	public void actualizarDireccionActual() {		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(direccionActual.obtenerDepartamentoNombre(direccionActual.depto, direccionActual.departamentos));
		buffer.append(",");
		buffer.append(direccionActual.obtenerMunicipioNombre(direccionActual.municipio,direccionActual.municipios));
		buffer.append(",");
		buffer.append(direccionActual.Direccion());
		
		nuevo.setDireccionActual(buffer.toString());			
	}
	
	public void actualizarDireccionNacimiento() {	 		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(direccionNacimiento.obtenerDepartamentoNombre(direccionNacimiento.depto, direccionActual.departamentos));
		buffer.append(",");
		buffer.append(direccionNacimiento.obtenerMunicipioNombre(direccionNacimiento.municipio,direccionActual.municipios));
		buffer.append(",");
		buffer.append(direccionNacimiento.Direccion());
		
		nuevo.setDireccionNacimiento(buffer.toString());				
	}
	
	public String gotoSecond() {
        return "pm:second";
    }
	
	public Alumno getNuevo() {
		return nuevo;
	}

	public void setNuevo(Alumno nuevo) {
		this.nuevo = nuevo;
	}

	public PersonaDireccion getDireccionActual() {
		return direccionActual;
	}

	public void setDireccionActual(PersonaDireccion direccionActual) {
		this.direccionActual = direccionActual;
	}

	public PersonaDireccion getDireccionNacimiento() {
		return direccionNacimiento;
	}

	public void setDireccionNacimiento(PersonaDireccion direccionNacimiento) {
		this.direccionNacimiento = direccionNacimiento;
	}

	public Nombres getNombresAlumno() {
		return nombresAlumno;
	}

	public void setNombresAlumno(Nombres nombresAlumno) {
		this.nombresAlumno = nombresAlumno;
	}
	
	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public List<SelectItem> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<SelectItem> idiomas) {
		this.idiomas = idiomas;
	}
}
