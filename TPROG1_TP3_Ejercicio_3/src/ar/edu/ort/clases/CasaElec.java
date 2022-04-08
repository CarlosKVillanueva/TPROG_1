package ar.edu.ort.clases;

import java.util.ArrayList;

public class CasaElec {
    private String nombre;
    private ArrayList<Electrodomestico> electrodomesticos;

    public CasaElec(String nombre) {
        this.nombre = nombre;
        electrodomesticos = new ArrayList<>();
    }

    public void agregarElectro(Electrodomestico e) {
        electrodomesticos.add(e);
    }

    @Override
    public String toString() {
        return "CasaElec{" +
                "nombre='" + nombre + '\'' +
                ", electrodomesticos=" + electrodomesticos +
                '}';
    }
}

