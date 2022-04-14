/**
 * 
 */
package ar.edu.ort.entidades;

/**
 * Representa un producto con tacc que puede estar en un pedido
 */
public class ProductoConTacc extends Producto {
	private static final String NOMBRE_MOSTRABLE = "Producto Con TACC";

	/**
	 * Constructor del pedido, recibe sus atributos como par�metro
	 *
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
	}

	@Override
	public void mostrar() {
		System.out.println();
	}

	@Override
	public String getTaccSinTacc() {
		return NOMBRE_MOSTRABLE;
	}
}
