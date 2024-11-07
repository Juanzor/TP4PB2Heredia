package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	
	private Division division;
	private Docente docente;
	private List<Alumno> alumnos;

	public Curso( Division division, Docente docente) {
		
		this.division = division;
		this.docente = docente;
		this.alumnos = new ArrayList<Alumno>();

	}


	public void listarAlumnos() {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
	}

	
	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
