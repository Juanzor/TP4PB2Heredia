package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Secundaria extends Curso {

	private List<Alumno> alumnos;

	
	public Secundaria(Division division, Docente docente) {
		super(division, docente);
		this.alumnos = new ArrayList<Alumno>();

	}

	public boolean inscribirse(Alumno alumno) {
		if (alumno.getNivelEducativoAprobado() == Division.SextoGrado) {
			this.alumnos.add(alumno);
			return true;
		}
		return false;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


}
