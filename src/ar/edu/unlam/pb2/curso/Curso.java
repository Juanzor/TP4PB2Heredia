package ar.edu.unlam.pb2.curso;

import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.docentes.Docente;
import ar.edu.unlam.pb2.dominio.OrdenadosPorDni;
import ar.edu.unlam.pb2.enums.NivelEducativo;
import ar.edu.unlam.pb2.exceptions.AlumnoNoEncontradoException;
import ar.edu.unlam.pb2.exceptions.AlumnoNoPuedeInscribirseException;
import ar.edu.unlam.pb2.exceptions.CantidadMaximaDocentesException;
import ar.edu.unlam.pb2.exceptions.DocenteNoCompetenteException;
import ar.edu.unlam.pb2.exceptions.EdadAlumnoNoCompatibleException;

public abstract class Curso {
	
	private Set<Docente> docentes;
	private Set<Alumno> alumnos;
	private NivelEducativo nivel;
	

	public Curso( NivelEducativo nivel) {	
		this.alumnos = new TreeSet<Alumno>();
		this.docentes = new TreeSet<Docente>();
		this.nivel=nivel;
	}
	
	
	 public abstract void agregarDocente(Docente docente) throws CantidadMaximaDocentesException, DocenteNoCompetenteException;
	 public abstract void agregarAlumno (Alumno alumno) throws EdadAlumnoNoCompatibleException, AlumnoNoPuedeInscribirseException;
	 
	 
	 public Alumno buscarAlumnoPorDni(Integer dni) throws AlumnoNoEncontradoException {
	        for (Alumno alumno : alumnos) {
	            if (alumno.getDni().equals(dni)) {
	                return alumno;
	            }
	        }
	        throw new AlumnoNoEncontradoException("Alumno con DNI " + dni + " no encontrado!");
	    }
	 
 
	 
	@Override
	public String toString() {
		return "Curso [docentes=" + docentes + ", alumnos=" + alumnos + ", nivel=" + nivel + "]";
	}




	public Set<Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}


	public Set<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	public TreeSet<Alumno> listarAlumnosPorDni(){
		
		OrdenadosPorDni ordenadosComparator = new OrdenadosPorDni();
		
		TreeSet<Alumno> alumnosOrdenados = new TreeSet<Alumno>(ordenadosComparator);

				for(Alumno alumno : this.alumnos) {
					alumnosOrdenados.add(alumno);
				}
				
		return alumnosOrdenados;
		
	}


	

	

	
	

	
	


	


	

}
