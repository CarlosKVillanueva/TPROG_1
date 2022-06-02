package ar.ort.edu.clases;

import java.util.ArrayList;

/**
 * Practica_Escuela @author CKVillanueva el 5/1/2022 | 10:19 PM
 */
public class Preceptor extends Persona {
    private int cantCursos;
    private ArrayList<Curso> cursos;

    public Preceptor(String nombre, String dni, int cantCursos) {
        super(nombre, dni);
        this.cantCursos = cantCursos;
        this.cursos = new ArrayList<>();
    }

    public void mostrar() {
        System.out.println(cantCursos);
    }
}
