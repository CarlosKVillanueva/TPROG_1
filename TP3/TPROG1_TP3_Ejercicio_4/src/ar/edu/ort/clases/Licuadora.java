package ar.edu.ort.clases;

public class Licuadora extends Electrodomestico implements Imprimible{
    private int potencia;
    private int velocidades;

    public Licuadora(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio, int potencia, int velocidades) {
        super(marca, modelo, nroSerie, voltaje, estado, precio);
        this.potencia = potencia;
        this.velocidades = velocidades;
    }

    @Override
    public void imprimir() {
        System.out.printf("%s %s modelo %s, %d velocidades, %d  => Precio: $%.2f\n",getClass().getSimpleName(),
                super.getMarca(), super.getModelo(), this.velocidades, this.potencia,  super.getPrecio());
    }
}

