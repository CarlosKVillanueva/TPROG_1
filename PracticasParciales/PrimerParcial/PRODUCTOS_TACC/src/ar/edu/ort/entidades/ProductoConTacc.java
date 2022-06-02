
package ar.edu.ort.entidades;

public class ProductoConTacc extends Producto {
	private static final String NOMBRE_MOSTRABLE = "Producto Con TACC";


	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
	}
	@Override
	public String getTaccSinTacc() {
		return NOMBRE_MOSTRABLE;
	}
}
