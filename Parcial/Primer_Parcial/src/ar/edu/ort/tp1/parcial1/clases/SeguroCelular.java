package ar.edu.ort.tp1.parcial1.clases;

/**
 * TP1-2022-C1-Parcial1-VillanuevaCarlos @author CKVillanueva el 5/10/2022 | 7:30 PM
 */
public class SeguroCelular extends Seguro {
    public static final double INDICE_CONSTANTE = 0.0025;
    private String marca;

    public SeguroCelular(String descripcion, double valorAsegurado, String marca, String modelo) {
        super(descripcion, valorAsegurado, modelo);
        this.marca = marca;
    }

    @Override
    public double calculoEspecifico() {
        return INDICE_CONSTANTE;
    }

    @Override
    public String toString() {
        return "SeguroCelular{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
