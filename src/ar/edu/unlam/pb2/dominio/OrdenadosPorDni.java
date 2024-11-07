package ar.edu.unlam.pb2.dominio;

import java.util.Comparator;

import ar.edu.unlam.pb2.alumnos.Alumno;

public class OrdenadosPorDni implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		 return o1.getDni().compareTo(o2.getDni());
		
	}

}
