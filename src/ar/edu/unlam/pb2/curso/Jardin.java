package ar.edu.unlam.pb2.curso;

import java.util.List;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.docentes.Maestro;
import ar.edu.unlam.pb2.enums.NivelEducativo;
import ar.edu.unlam.pb2.exceptions.AlumnoNoPuedeInscribirseException;
import ar.edu.unlam.pb2.exceptions.CantidadMaximaDocentesException;
import ar.edu.unlam.pb2.exceptions.DocenteNoCompetenteException;
import ar.edu.unlam.pb2.exceptions.EdadAlumnoNoCompatibleException;


public class Jardin extends Curso {


	public Jardin( NivelEducativo salita) {
		super(salita);
		
	}

	@Override
	public void agregarDocente(Docente docente) throws CantidadMaximaDocentesException, DocenteNoCompetenteException {

		if(this.getDocentes().size() >= 2) {
			throw new CantidadMaximaDocentesException("No se puede tener una sala con mas de 2 docentes");
		} else if (!(docente instanceof Maestro)) {
			throw new DocenteNoCompetenteException("Docente no competente");
		} else {
			this.getDocentes().add(docente);
		}
		
	}

	@Override
	public void agregarAlumno(Alumno alumno) throws EdadAlumnoNoCompatibleException, AlumnoNoPuedeInscribirseException {
		// TODO Auto-generated method stub
		
	}
	
	

	

	
}
