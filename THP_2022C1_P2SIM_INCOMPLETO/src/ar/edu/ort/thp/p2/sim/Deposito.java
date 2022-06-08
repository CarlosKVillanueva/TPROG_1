package ar.edu.ort.thp.p2.sim;

import java.util.ArrayList;

public class Deposito {

	private ArrayList<Producto> productos;
	private TipoDeposito tipoDeposito;

	public Deposito(TipoDeposito tipo) {
		// TODO - Completar constructor
	}

	public void almacenarProducto(Producto producto) {
		Producto productoBuscado = buscarProducto(producto.getNombre());
		if (productoBuscado==null)
			this.productos.add(producto);
		else
			productoBuscado.actualizar(producto);
	}

	private Producto buscarProducto(String nombreProducto) {
		int i = 0;
		Producto producto;
		Producto productoEncontrado = null;

		while (i < productos.size() && productoEncontrado == null) {
			producto = productos.get(i);
			if (producto.getNombre().equals(nombreProducto)) {
				productoEncontrado = producto;
			} else {
				i++;
			}
		}
		return productoEncontrado;
	}

	public int extraerProducto(String nombreProducto, int cantidadRequerida) {
		int extraido = 0;
		Producto producto = buscarProducto(nombreProducto);
		if (producto == null)
			System.out.println("El producto " + nombreProducto + " no tiene stock en deposito");
		else
			extraido = producto.extraer(cantidadRequerida);
		return extraido;
	}

	public boolean isRefrigerado() {
		return tipoDeposito.equals(TipoDeposito.REFRIGERADO);
	}

	private void setTipoDeposito(TipoDeposito tipo) {
		this.tipoDeposito = tipo;
	}

}