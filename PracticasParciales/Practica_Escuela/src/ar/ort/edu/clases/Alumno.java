package ar.ort.edu.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Practica_Escuela @author CKVillanueva el 5/1/2022 | 10:18 PM
 */
public class Alumno extends Persona {
    private double promedioNotas;
    private int materiasCursadas;
    private ArrayList<Persona> amigos;

    public Alumno(String nombre, String dni, double promedioNotas, int materiasCursadas) {
        super(nombre, dni);
        this.promedioNotas = promedioNotas;
        this.materiasCursadas = materiasCursadas;
        this.amigos = new ArrayList<>(
                List.of(new Persona("Francisco", "123"),
                        new Persona("Anabella", "321")));
    }

    public void mostrar(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "promedioNotas=" + promedioNotas +
                ", materiasCursadas=" + materiasCursadas +
                ", amigos=" + amigos +
                '}';
    }

}
