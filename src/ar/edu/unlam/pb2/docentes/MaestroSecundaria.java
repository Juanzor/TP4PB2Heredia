package ar.edu.unlam.pb2.docentes;

import ar.edu.unlam.pb2.enums.NivelEducativo;

public class MaestroSecundaria extends Docente{
	
	public MaestroSecundaria(String nombre, Integer dni, Integer edad, NivelEducativo[] experiencia) {
		super(nombre, dni, edad, experiencia);
		
	}
}
