package ar.edu.ort.clases;

public class Mueble {
    private String nombre;
    private String material;
    private String color;

    public Mueble(String nombre, String material, String color) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s %s %s\n", nombre, material, color);
    }
}
