package ar.edu.ort.clases;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private String nroSerie;
    private int voltaje;
    private boolean estado;
    private double precio;


    public Electrodomestico(String marca, String modelo, String nroSerie, int voltaje, boolean estado, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.nroSerie = nroSerie;
        this.voltaje = voltaje;
        this.estado = estado;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroSerie='" + nroSerie + '\'' +
                ", voltaje=" + voltaje +
                ", estado=" + estado +
                ", precio=" + precio +
                '}';
    }
}
