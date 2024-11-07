package ar.edu.unlam.pb2.curso;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.docentes.MaestroPrimaria;
import ar.edu.unlam.pb2.docentes.MaestroSecundaria;
import ar.edu.unlam.pb2.enums.NivelEducativo;
import ar.edu.unlam.pb2.exceptions.AlumnoNoPuedeInscribirseException;
import ar.edu.unlam.pb2.exceptions.CantidadMaximaDocentesException;
import ar.edu.unlam.pb2.exceptions.DocenteNoCompetenteException;

public class Secundaria extends Curso {

	
	public Secundaria(NivelEducativo anio) {
		super(anio);
	
	
	}

	public void agregarAlumno(Alumno alumno) throws AlumnoNoPuedeInscribirseException {
		if (alumno.getNivel() == NivelEducativo.SEXTO_GRADO) {
			this.getAlumnos().add(alumno);
		
		} else {
			throw new AlumnoNoPuedeInscribirseException("El alumno no se puede inscribir");
		}
		
	}

	@Override
	public void agregarDocente(Docente docente) throws CantidadMaximaDocentesException, DocenteNoCompetenteException {
		if(this.getDocentes().size() >= 1) {
			throw new CantidadMaximaDocentesException("");
		} else if (!(docente instanceof MaestroSecundaria)) {
			throw new DocenteNoCompetenteException("Docente no competente");
		} else {
			this.getDocentes().add(docente);
		}
		
	}
	
	


}
