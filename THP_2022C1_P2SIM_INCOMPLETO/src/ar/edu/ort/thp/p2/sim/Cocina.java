package ar.edu.ort.thp.p2.sim;

public class Cocina {

	private Deposito refrigerados;
	private Deposito noRefrigerados;

	public Cocina() {
		// TODO - Completar constructor
	}

	public void almacenarProducto(Producto producto, boolean esRefrigerado) {
		if (esRefrigerado) {
			refrigerados.almacenarProducto(producto);
		} else {
			noRefrigerados.almacenarProducto(producto);
		}
	}

	public int extraerProducto(String nombreProducto, boolean esRefrigerado, int cantidadRequerida) {
		int extraido;
		if (esRefrigerado)
			extraido = refrigerados.extraerProducto(nombreProducto, cantidadRequerida);
		else
			extraido = noRefrigerados.extraerProducto(nombreProducto, cantidadRequerida);
		return extraido;
	}

}