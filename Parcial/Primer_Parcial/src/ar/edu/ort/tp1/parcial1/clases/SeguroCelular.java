package ar.edu.ort.tp1.parcial1.clases;

/**
 * TP1-2022-C1-Parcial1-VillanuevaCarlos @author CKVillanueva el 5/10/2022 | 7:30 PM
 */
public class SeguroCelular extends Seguro {
    public static final double INDICE_CONSTANTE = 0.0025;
    public static final String CONSTANTE_DESCRIPCION = "Seguro de robo de celular";
    private String marca;

    public SeguroCelular(double valorAsegurado, String marca, String modelo) {
        super(CONSTANTE_DESCRIPCION, valorAsegurado, modelo);
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


    @Override
    public String texto() {
        return String.format(PATRON_TEXTO_CEL,marca,getModelo(),getValorAsegurado());
    }
}
