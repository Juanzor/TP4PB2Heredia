package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Primaria extends Curso {

	private List<Alumno> alumnos;
	
	public Primaria(Division division, Docente docente) {
		super(division, docente);
		this.alumnos = new ArrayList<Alumno>();

	}

	public boolean agregarAlumno(Alumno alumno) {
		if (this.getAlumnos().contains(alumno)) {
			System.out.println("duplicado");
			return false;
		} else if (alumno.getEdad() > 11 || alumno.getEdad() < 6) {
			return false;
		}
			this.getAlumnos().add(alumno);
		return true;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
