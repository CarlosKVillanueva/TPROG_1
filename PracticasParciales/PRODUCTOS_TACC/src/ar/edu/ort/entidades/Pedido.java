/**
 * 
 */
package ar.edu.ort.entidades;


import java.util.ArrayList;

/**
 * Clase que contiene un pedido generado.
 */
public class Pedido implements Certificable, Mostrable {
	public static final int NO_ESTA = -1;
	/*
	 * Completar atributos
	 */
	private TipoPedido tipo;
	private ArrayList<Integer> cantidadList;
	private ArrayList<Producto> productosList;


	public Pedido(TipoPedido tipo) {
		this.tipo = tipo;
		this.cantidadList = new ArrayList<>();
		this.productosList = new ArrayList<>();
	}

	/**
	 * Permite agregar un producto al pedido
	 * 
	 * @param producto El {@link Producto} a agregar.
	 * @param cantidad La cantidadd del {@link Producto} a agregar
	 */
	public void agregarProducto(Producto producto, Integer cantidad) {
		int idx = buscarProducto(producto);
		if (idx == NO_ESTA) {
			this.productosList.add(producto);
			this.cantidadList.add(cantidad);
		} else {
			int cantidadOriginal = cantidadList.get(idx);
			this.cantidadList.set(idx, cantidadOriginal + cantidad);
		}
	}

	/**
	 * Saca un producto del pedido.
	 * 
	 * @param producto El {@link Producto} a sacar del pedido
	 * @param cantidad Cantidad del {@link Producto} a sacar del pedido
	 */
	public void sacarProducto(Producto producto, int cantidadASacar) {
		int idx = buscarProducto(producto);
		if (idx > NO_ESTA) {
			int resto = cantidadList.get(idx) - cantidadASacar;
			if (resto > 0){
				this.cantidadList.set(idx, resto);
			} else {
				this.cantidadList.remove(idx);
				this.productosList.remove(idx);
			}
 		}
	}

	/**
	 * Devuelve el indice del producto buscado en la lista.
	 * 
	 * @param p {@link Producto}
	 * @return El indice >= 0 si encuentra el producto y -1 si no lo encuentra
	 */
	private int buscarProducto(Producto p) {
		int i = 0;
		int idx = -1;

		while(i != -1 && i < this.productosList.size()){
			Producto productoBuscado = this.productosList.get(i);

			if (productoBuscado.mismoNombre(p.getNombre())) {
				idx = i;
			} else {
				i++;
			}
		}
		return idx;
	}

	/**
	 * Indica la cantidad del producto dado.
	 * 
	 * @param producto {@link Producto} cuya cantidad se desea averiguar
	 * @return {@link Integer} conteniendo la cantidad del producto en el pedido -1
	 *         si no est� el producto
	 */
	private int cantidadProducto(Producto producto) {
		int idx = buscarProducto(producto);
		return idx != NO_ESTA ? cantidadList.get(idx) : NO_ESTA;
	}

	/**
	 * Devuelve una estructura conteniendo las lineas del pedido
	 * 
	 * @return un la estructura conteniendo {@link LineaPedido}s
	 */
	private ArrayList<LineaPedido> getTablaProductosPedidos() {
		ArrayList<LineaPedido> retorno = new ArrayList<>();
		for (int i = 0; i < productosList.size(); i++) {
			retorno.add(new LineaPedido(productosList.get(i), cantidadList.get(i)));
		}
		return retorno;
	}

	/**
	 * // * Calcula el importe del pedido
	 * 
	 * @return {@link Float} conteniendo el importe del pedido
	 */
	private float calcularImportePedido() {

		// Completar
		float importe = 0;
		ArrayList<LineaPedido> lineaPedidos = getTablaProductosPedidos();
		for (LineaPedido lineaPedido : lineaPedidos) {
			importe += lineaPedido.getPrecioLineaPedido(tipo);
		}
		return importe;
	}

	@Override
	public boolean isCertificadoSinTACC() {
		int i = 0;
		boolean retorno = true;
		while (retorno && i < productosList.size()) {
			retorno = !(productosList.get(i) instanceof ProductoSinTacc);
			i++;
		}
		return retorno;
	}

	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_ENCABEZADO_CONSOLA, "Cantidad", "Nombre", "Tipo de Producto", "Precio Unitatio", "TACC");
		for (LineaPedido lp : getTablaProductosPedidos()) {
			lp.mostrar();
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println(isCertificadoSinTACC() ? "El pedido es certificado sin TACC" : "El pedido no es certificado sin TACC");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("El precio total del pedido es : $" + calcularImportePedido());
	}
}
