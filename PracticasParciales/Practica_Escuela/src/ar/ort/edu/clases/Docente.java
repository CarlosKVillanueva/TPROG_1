package ar.ort.edu.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Practica_Escuela @author CKVillanueva el 5/1/2022 | 10:17 PM
 */
public class Docente extends Persona {
    private int cantAlumnos;
    private int canMaterias;
    private ArrayList<Persona> alumnos;

    public Docente(String nombre, String dni, int cantAlumnos, int canMaterias) {
        super(nombre, dni);
        this.cantAlumnos = cantAlumnos;
        this.canMaterias = canMaterias;
        this.alumnos = new ArrayList<>(
                List.of(new Alumno("Juan", "123", 7.0, 4),
                new Alumno("Jose", "321", 9.0, 5),
                new Alumno("Diego", "Maria", 2.0, 4))
        );


    }

    public void mostrar() {
        for (Persona alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public int contarAlumnos() {
        return alumnos.size();
    }
}
