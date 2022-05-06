package ar.edu.ort.clases;

public class Heladera extends Electrodomestico{
    private int capacicad;
    private boolean frost;

    public Heladera(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int capacicad, boolean frost) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.capacicad = capacicad;
        this.frost = frost;
    }

    @Override
    public String toString() {
        return String.format("%s %s, modelo %s, %s, capacidad %d litros => Precio: $ %.2f", getClass().getSimpleName(), super.getMarca(), super.getModelo(), (frost ? "frost" : "no frost"),
                this.capacicad, super.getPrecio());
    }
}
