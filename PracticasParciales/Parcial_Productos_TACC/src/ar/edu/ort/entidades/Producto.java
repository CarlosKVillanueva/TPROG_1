package ar.edu.ort.entidades;

public abstract class Producto implements Mostrable {

    public static final float DESCUENTO_DIEZ = 0.9f;
    private String nombre;
    private float precio;
    private FamiliaProducto familiaProducto;

    public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
        this.familiaProducto = familiaProducto;
        this.nombre = nombre;
        this.precio = precio;
    }


    public float getPrecio(TipoPedido tipoPedido) {
        return (tipoPedido == TipoPedido.POR_MAYOR) ? this.precio * DESCUENTO_DIEZ : this.precio;
    }

    @Override
    public void mostrar() {
        System.out.printf(Mostrable.FORMATO_RENGLON_CONSOLA,this.nombre,this.familiaProducto, this.precio, getTaccSinTacc());
    }

    public  abstract String getTaccSinTacc();

    public String getNombre() {
        return this.nombre;
    }

    public boolean mismoNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}

