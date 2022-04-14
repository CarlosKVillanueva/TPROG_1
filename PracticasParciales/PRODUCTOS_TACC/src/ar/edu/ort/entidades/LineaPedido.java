/**
 * 
 */
package ar.edu.ort.entidades;

/**
 * L�nea de un pedido, incluye el producto y la cantidad del mismo
 */
public class LineaPedido implements Mostrable {

	private Producto producto;
	private int cantidad;

	/**
	 * Constructor de la entidad
	 * 
	 * @param producto {@link Producto} contenido en la l�nea.
	 * @param cantidad {@link Integer} representando la cantidad de producto de la
	 *                 l�nea
	 */
	public LineaPedido(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve le precio de una linea de pedido
	 * 
	 * @param tipo {@link TipoPedido} para calular el precio
	 * @return {@link Float} con el precio de la l�nea
	 */
	public float getPrecioLineaPedido(TipoPedido tipo) {

		return cantidad * producto.getPrecio(tipo);
	}

	/**
	 * Agraga la cantidad indicada de producto a la {@link LineaPedido}
	 * 
	 * @param cantidad {@link Integer} con la cantidad a agregar (debe ser positivo,
	 *                 si no, no agrega)
	 */
	public void adicionarCantidad(int cantidad) {
		this.cantidad += cantidad;
	}

	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_PRECIO_RENGLON_CONSOLA, cantidad);
		producto.mostrar();
	}
}
