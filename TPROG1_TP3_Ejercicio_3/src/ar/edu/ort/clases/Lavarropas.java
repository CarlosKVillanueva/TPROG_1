package ar.edu.ort.clases;

public class Lavarropas extends  Electrodomestico{
    private int cargaMax;
    private Tipo tipo;



    public Lavarropas(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int cargaMax, Tipo tipo) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.cargaMax = cargaMax;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Lavarropas{" +
                "cargaMax=" + cargaMax +
                ", tipo=" + tipo +
                '}';
    }
}
