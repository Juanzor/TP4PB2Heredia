package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
	private Division nivelEducativoAprobado;

	public Alumno(String nombre, Integer edad, Integer dni) {
		super(nombre, edad, dni);
	}
	
	
	
	

	public Division getNivelEducativoAprobado() {
		return nivelEducativoAprobado;
	}

	public void setNivelEducativoAprobado(Division nivelEducativoAprobado) {
		this.nivelEducativoAprobado = nivelEducativoAprobado;
	}

	

	
}
