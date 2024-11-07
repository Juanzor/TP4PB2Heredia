package ar.edu.unlam.pb2.docentes;

import java.util.Objects;

import ar.edu.unlam.pb2.enums.NivelEducativo;

public class Docente {
	
	private String nombre;
	private Integer dni;
	private Integer edad;
	private NivelEducativo experiencia[];

	public Docente(String nombre, Integer dni, Integer edad, NivelEducativo experiencia[]) {
		this.nombre= nombre;
		this.dni= dni;
		this.edad= edad;
		this.experiencia = experiencia;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		return Objects.equals(dni, other.dni);
	}


	





	public NivelEducativo[] getExperiencia() {
		return experiencia;
	}



	public void setExperiencia(NivelEducativo[] experiencia) {
		this.experiencia = experiencia;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
