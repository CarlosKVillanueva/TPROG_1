package ar.edu.ort.clases;

public class Mascota {
    private String nombre;
    private String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return especie + ", " + nombre;
    }

}
