package ar.edu.ort.entidades;


public class ProductoSinTacc extends Producto {

    private static final String NOMBRE_MOSTRABLE = "Producto Sin TACC";

    private String certificadoraSinTacc;


    public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadoraSinTacc) {
        super(familiaProducto, nombre, precio);
        this.certificadoraSinTacc = certificadoraSinTacc;
    }

    @Override
    public String getTaccSinTacc() {
        return NOMBRE_MOSTRABLE;
    }
}
