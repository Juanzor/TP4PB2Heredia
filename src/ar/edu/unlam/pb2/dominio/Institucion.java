package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlam.pb2.curso.Curso;

public class Institucion {
    private String nombre;
    private List<Curso> listaCursos;

    public Institucion(String nombre) {
        this.nombre = nombre;
        this.listaCursos = new ArrayList<>();
    }

  
    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
    }
}
