package ar.edu.ort.clases;

public class Licuadora extends Electrodomestico{
    private int potencia;
    private int velocidades;

    public Licuadora(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int potencia, int velocidades) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.potencia = potencia;
        this.velocidades = velocidades;
    }


    @Override
    public String toString() {
        return "Licuadora{" +
                "potencia=" + potencia +
                ", velocidades=" + velocidades +
                '}';
    }
}
