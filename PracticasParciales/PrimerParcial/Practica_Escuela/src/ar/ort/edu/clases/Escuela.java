package ar.ort.edu.clases;

import java.util.ArrayList;
import javax.print.Doc;

/**
 * Practica_Escuela @author CKVillanueva el 5/1/2022 | 10:15 PM
 */
public class Escuela {
    private String nombre;
    private ArrayList<Persona> personas;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public void agregarPersonas(Persona persona){
        personas.add(persona);
    }

    public void mostrarAlumnos() {
        for (Persona persona : personas) {
            if (persona instanceof Docente) {
                persona.mostrar();
            }
        }
    }

    public int contarAlumnos() {
        int contadorAlumnos = 0;
        for (Persona persona : personas) {
            if (persona instanceof Docente) {
                contadorAlumnos += ((Docente) persona).contarAlumnos();
            }
        }
        return contadorAlumnos;
    }

    public void mostrarAlumnosPorDocente(String dni) {
        Persona docente = buscarDocente(dni);
        if (docente instanceof Docente ) {
            docente.mostrar();
        }
    }

    public Persona buscarDocente(String dni) {
        int i = 0, cantidadElementos = personas.size();
        Persona persona = null;

        while (i < cantidadElementos && persona == null) {
            Persona personaBuscada = personas.get(i);
            if (personaBuscada.mismoMetodo(dni)) {
                persona = personaBuscada;
            } else {
                i++;
            }
        }
        return persona;
    }

    public void mostrarTodo() {
        for (Persona persona : personas) {
            persona.mostrar();
        }
    }
}
