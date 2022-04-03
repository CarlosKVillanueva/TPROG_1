package ar.edu.ort.clases;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s %s %d\n", nombre, apellido, edad);
    }
}
