package ar.edu.unlam.pb2.dominio;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.enums.NivelEducativo;

public interface Evaluable {
	
	public Evaluacion evaluar(Alumno alumno, Docente docente, String fecha, NivelEducativo grado, Integer nota);

}
