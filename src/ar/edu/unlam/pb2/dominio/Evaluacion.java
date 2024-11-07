package ar.edu.unlam.pb2.dominio;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.enums.NivelEducativo;

public class Evaluacion {
	private String fecha;
	private Alumno alumno;
	private Docente docente;
	private NivelEducativo nivel;
	private Integer nota;
	
	
	public Evaluacion(Alumno alumno,String fecha, Docente docente, NivelEducativo nivel, Integer nota) {
		super();
		this.alumno=alumno;
		this.fecha = fecha;
		this.docente = docente;
		this.nivel = nivel;
		this.nota = nota;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Docente getDocente() {
		return docente;
	}


	public void setDocente(Docente docente) {
		this.docente = docente;
	}


	


	public Integer getNota() {
		return nota;
	}


	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	
}
