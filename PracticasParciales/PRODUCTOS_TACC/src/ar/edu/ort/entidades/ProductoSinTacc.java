/**
 * 
 */
package ar.edu.ort.entidades;


/**
 * Representa un producto sin tacc
 */
public class ProductoSinTacc extends Producto {

	private static final String NOMBRE_MOSTRABLE = "Producto Sin TACC";

	//Completar atributos y metodos
	private String certificadoraSinTacc;

	/**
	 * Constructor del pedido, recibe sus atributos como parametro
	 *
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadoraSinTacc) {
		super(familiaProducto, nombre, precio);
		this.certificadoraSinTacc = certificadoraSinTacc;
	}

	@Override
	public String getTaccSinTacc() {
		return NOMBRE_MOSTRABLE;
	}
}
