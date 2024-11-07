package ar.edu.unlam.pb2;

public class Docente extends Persona {

	private Division experiencia[];

	public Docente(String nombre, Integer dni, Integer edad, Division[] experiencia) {
		super(nombre, dni, edad);
		this.experiencia = experiencia;
		
	}

}
