package ar.edu.unlam.pb2;

import java.util.List;

public class Jardin extends Curso {

	private List<Alumno> alumnos;
	private Docente docente2;

	public Jardin(Division division, Docente docente, Docente docente2) {
		super(division, docente);

		this.docente2 = docente2;

	}
	
	public void agregarAlumnoAJardin(Alumno alumno) {
		//if(this.getAlumnos().size() < 10)
		//super.agregarAlumno(alumno);
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	
}
