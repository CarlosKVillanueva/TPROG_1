package ar.edu.ort.clases;

public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean smart;


    public Televisor(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int pulgadas, boolean smart) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.pulgadas = pulgadas;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + pulgadas +
                ", smart=" + smart +
                '}';
    }
}
