package ar.edu.ort.clases;

import java.util.ArrayList;

public class Ticket {
    private ArrayList<Electrodomestico> compras;
    private Cliente cliente;

    public Ticket(Cliente c) {
        compras = new ArrayList<>();
        this.cliente = c;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "compras=" + compras +
                '}';
    }

    public void compra(Electrodomestico e) {
        compras.add(e);
    }

    public void mostrarCompra() {
        System.out.println("Ticket de Venta");
        System.out.printf("Cliente: %s | CUIL: %s\n", cliente.getApenom(), cliente.getCuil());
        System.out.println("Articulos:");
        double totalCompra = 0;
        for (Electrodomestico e : compras) {
            e.imprimir();
            totalCompra += e.getPrecio();
        }
        System.out.println("Total Compra: $" + totalCompra);
    }
}
