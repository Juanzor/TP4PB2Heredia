package ar.edu.unlam.pb2.dominio;

import java.util.TreeSet;

import ar.edu.unlam.pb2.alumnos.Alumno;
import ar.edu.unlam.pb2.curso.Primaria;
import ar.edu.unlam.pb2.curso.Secundaria;
import ar.edu.unlam.pb2.enums.NivelEducativo;
import ar.edu.unlam.pb2.exceptions.EdadAlumnoNoCompatibleException;

public class Main {

	public static void main(String[] args) throws EdadAlumnoNoCompatibleException {
		
		Institucion institucion = new Institucion("Instituto Educativo");
		
		Primaria cursoPrimaria = new Primaria(NivelEducativo.AZUL);
		
		Secundaria cursoSecundaria = new Secundaria(NivelEducativo.PRIMER_AÑO);

		institucion.agregarCurso(cursoPrimaria);
		institucion.agregarCurso(cursoSecundaria);

		
		cursoPrimaria.agregarAlumno(new Alumno("Gomez", "Behringer", 6, 7034203, NivelEducativo.PRIMER_GRADO ));
		cursoPrimaria.agregarAlumno(new Alumno("Juan", "Carlos", 6, 1034203, NivelEducativo.PRIMER_GRADO ));
		cursoPrimaria.agregarAlumno(new Alumno("Rodrigo", "Zapata", 6, 2034203, NivelEducativo.PRIMER_GRADO ));

		

		TreeSet<Alumno> alumnosOrdenados = cursoPrimaria.listarAlumnosPorDni();
		
		alumnosOrdenados.forEach(alumno ->{
			System.out.println(alumno);
		});

	}

}
