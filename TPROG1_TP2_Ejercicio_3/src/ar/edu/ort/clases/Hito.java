package ar.edu.ort.clases;

import java.time.LocalDate;

public class Hito {
    private LocalDate fecha;
    private String descripcion;
    private int personasInvolucradas;

    public Hito(String fecha, String descripcion, int personasInvolucradas) {
        this.fecha = LocalDate.parse(fecha);
        this.descripcion = descripcion;
        this.personasInvolucradas = personasInvolucradas;
    }

    public void mostrar() {
        System.out.println(fecha + ", " + descripcion + ", " + personasInvolucradas + " espectadores.");
    }

}