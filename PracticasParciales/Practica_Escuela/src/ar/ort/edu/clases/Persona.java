package ar.ort.edu.clases;

import java.util.ArrayList;

/**
 * Practica_Escuela @author CKVillanueva el 5/1/2022 | 10:16 PM
 */
public class Persona implements Mostrable {
    private String nombre;
    private String dni;
    private ArrayList<Persona> familiares;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.familiares = new ArrayList<>();
    }


    public boolean mismoMetodo(String dni) {
        return this.dni == dni;
    }

    public void mostrarFamiliares() {
        for (Persona familiar : familiares) {
            System.out.println(familiar);
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'';
    }

    @Override
    public void mostrar() {

    }
}
