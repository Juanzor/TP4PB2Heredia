package ar.edu.unlam.pb2.alumnos;



import java.util.Objects;

import ar.edu.unlam.pb2.enums.NivelEducativo;

public class Alumno implements Comparable<Alumno> {
	

	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer dni;
	private NivelEducativo nivel;

	
	public Alumno( String nombre, String apellido,Integer edad, Integer dni, NivelEducativo nivel) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.nivel=nivel;
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
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}





	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", nivel="
				+ nivel + "]";
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public NivelEducativo getNivel() {
		return nivel;
	}



	public void setNivel(NivelEducativo nivel) {
		this.nivel = nivel;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public Integer getDni() {
		return dni;
	}




	public void setDni(Integer dni) {
		this.dni = dni;
	}



	 @Override
	    public int compareTo(Alumno otro) {
	        int comparacionApellido = this.apellido.compareTo(otro.apellido);
	        if (comparacionApellido != 0) {
	            return comparacionApellido;
	        }
	        return this.nombre.compareTo(otro.nombre);
	    }




	

	

	
}
