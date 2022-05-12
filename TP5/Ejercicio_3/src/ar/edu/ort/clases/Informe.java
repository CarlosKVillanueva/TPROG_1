package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/12/2022 | 3:28 PM
 */
public class Informe {
    private String nombre;
    private double importe;

    public Informe(String nombre, double importe) {
        this.nombre = nombre;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f", nombre, importe);
    }
}
