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

    public void mostrarCompra() {
        System.out.println("Ticket de Venta");
        System.out.println("Articulos:");
        double totalCompra = 0;
        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e);
            totalCompra += e.getPrecio();
        }
        System.out.println("Total Compra: $" + totalCompra);
    }


    @Override
    public String toString() {
        return "CasaElec{" +
                "nombre='" + nombre + '\'' +
                ", electrodomesticos=" + electrodomesticos +
                '}';
    }

}

