/**
 * 
 */
package ar.edu.ort.entidades;


/**
 * Un producto
 */
public abstract class Producto implements Mostrable {

	/**
	 * Atributos, Completar
	 */
	private static final float DESCUENTO_POR_MAYOR = 0;
	public static final float DESCUENTO_DIEZ = 0.9f;
	private String nombre;
	private float precio;
	private FamiliaProducto familiaProducto;

	/**
	 * Constructor del pedido, recibe sus atributos como par�metro
	 * 
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		this.familiaProducto = familiaProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Aplica el descuento segun el tipo de pedido
	 * @param tipoPedido
	 * @return
	 */

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
