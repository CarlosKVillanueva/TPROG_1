package ar.edu.ort.tp1.parcial1.clases;

/**
 * TP1-2022-C1-Parcial1-VillanuevaCarlos @author CKVillanueva el 5/10/2022 | 7:26 PM
 */
public class SeguroAuto extends Seguro {
    private static final double INDICE_PREMIO_AUTO = 0.0015;
    public static final String CONSTANTE_DESCRIPCION = "Seguro de automotor todo riesgo";
    private MarcaAuto marca;

    public SeguroAuto(double valorAsegurado, MarcaAuto marca, String modelo) {
        super(CONSTANTE_DESCRIPCION, valorAsegurado, modelo);
        this.marca = marca;
    }

    @Override
    public double calculoEspecifico() {
        return INDICE_PREMIO_AUTO * marca.getIndiceMarca();
    }


    @Override
    public String texto() {
        return String.format(PATRON_TEXTO_AUTO,marca,getModelo(),getValorAsegurado());
    }
}
