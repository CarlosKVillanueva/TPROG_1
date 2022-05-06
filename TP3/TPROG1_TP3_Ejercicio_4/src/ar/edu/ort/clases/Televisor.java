package ar.edu.ort.clases;

public class Televisor extends Electrodomestico implements Imprimible{
    private int pulgadas;
    private boolean smart;


    public Televisor(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int pulgadas, boolean smart) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.pulgadas = pulgadas;
        this.smart = smart;
    }

    @Override
    public void imprimir() {
        System.out.printf("%s %s %s %s pulgadas, modelo %s => Precio: $%.2f\n",getClass().getSimpleName(), (smart ? "smart " : "no smart"),
                super.getMarca(), this.pulgadas, super.getModelo(), super.getPrecio());
    }
}
