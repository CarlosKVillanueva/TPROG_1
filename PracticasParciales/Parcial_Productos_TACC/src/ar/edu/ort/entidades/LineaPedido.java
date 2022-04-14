
package ar.edu.ort.entidades;


public class LineaPedido implements Mostrable {

    private Producto producto;
    private int cantidad;


    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }


    public float getPrecioLineaPedido(TipoPedido tipo) {

        return cantidad * producto.getPrecio(tipo);
    }

    public void adicionarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    @Override
    public void mostrar() {
        System.out.printf(Mostrable.FORMATO_PRECIO_RENGLON_CONSOLA, cantidad);
        producto.mostrar();
    }
}
