package ar.edu.unlam.pb2.curso;
import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.docentes.MaestroPrimaria;
import ar.edu.unlam.pb2.dominio.Evaluable;
import ar.edu.unlam.pb2.dominio.Evaluacion;
import ar.edu.unlam.pb2.enums.NivelEducativo;
import ar.edu.unlam.pb2.exceptions.CantidadMaximaDocentesException;
import ar.edu.unlam.pb2.exceptions.DocenteNoCompetenteException;
import ar.edu.unlam.pb2.exceptions.EdadAlumnoNoCompatibleException;

public class Primaria extends Curso implements Evaluable {

	public Primaria(NivelEducativo grado ) {
		super(grado);
	}
	
	
	@Override
	public void agregarDocente(Docente docente) throws CantidadMaximaDocentesException, DocenteNoCompetenteException {
	
		if(this.getDocentes().size() >= 1) {
			throw new CantidadMaximaDocentesException("No se puede tener un grado con mas de 1 docente");
		} else if (!(docente instanceof MaestroPrimaria)) {
			throw new DocenteNoCompetenteException("Docente no competente");
		} else {
			this.getDocentes().add(docente);
		}
		
	}

	public void agregarAlumno(Alumno alumno) throws EdadAlumnoNoCompatibleException {
		
		  if (alumno.getEdad() < 6) {
			throw new EdadAlumnoNoCompatibleException("La edad del alumno es baja");
		} 
		  
			this.getAlumnos().add(alumno);
		
	}
	
	
	@Override
	public Evaluacion evaluar(Alumno alumno, Docente docente, String fecha, NivelEducativo grado, Integer nota) {
		return new Evaluacion(alumno,fecha,docente,grado,nota);
	}

	

	

	
	
	
	
	
	

}
