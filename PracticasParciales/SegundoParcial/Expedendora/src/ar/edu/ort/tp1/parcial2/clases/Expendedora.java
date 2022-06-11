package ar.edu.ort.tp1.parcial2.clases;

import ort.tp1.tdas.implementaciones.ColaNodos;
import ort.tp1.tdas.interfaces.Cola;

public class Expendedora {

	private final static String MSJ_NOMBRE_INVALIDO = "Nombre Invalido";
	private final static String MSJ_ID_INVALIDO = "ID de producto Invalido";
	private static final String MSJ_ACTUALIZACION_NULA = "La actualizacion no puede ser nula";
	private static final String MSJ_PRODUCTO_NULO = "El producto no puede ser nulo";
	private static final String MSJ_PRODUCTO_REPETIDO = "ID de producto ya existente";

	private ProductosPorNombre productosPorNombre;
	private ProductosPorId productosPorId;
	private Cola<String> erroresDeActualizacion;
	private String nombre;

	public Expendedora(String nombre) {
		setNombre(nombre);
		productosPorNombre = new ProductosPorNombre();
		productosPorId = new ProductosPorId();
		erroresDeActualizacion = new ColaNodos<>();
	}

	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new RuntimeException(MSJ_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	public void agregarProducto(Producto p) {
		if (p == null) {
			throw new RuntimeException(MSJ_PRODUCTO_NULO);
		}

		if (productosPorId.search(p.getId()) == null) {
			productosPorId.add(p);
			productosPorNombre.add(p);
		} else {
			throw new RuntimeException(MSJ_PRODUCTO_REPETIDO);
		}
	}

	public void ajustarPrecio(int idProducto, Actualizacion actualizacion) {
		Producto producto = obtenerProductoPorId(idProducto);
		if (producto == null) {
			agregarError(MSJ_ID_INVALIDO, idProducto, actualizacion);
		} else if (actualizacion == null) {
			agregarError(MSJ_ACTUALIZACION_NULA, idProducto, actualizacion);
		} else {
			try {
				producto.aplicarActualizacion(actualizacion);
			} catch (RuntimeException re) {
				agregarError(re.getMessage(), idProducto, actualizacion);
			}
		}
	}
	
	private Producto obtenerProductoPorId(int idProducto) {
		return productosPorId.search(idProducto);
	}

	private void agregarError(String mensaje, int idProducto, Actualizacion actualizacion) {
		erroresDeActualizacion.add(String.format("%s - %s - %s", mensaje, idProducto, actualizacion));
	}

	public void mostrarHistoricoActualizaciones() {
		for (Producto producto : productosPorId) {
			System.out.println(producto);
			producto.listarActualizacionesDePrecio();
		}
	}

	public void mostrarErrores() {
		// TODO Si te toco este tema
	}

	// Solo si te toco la lista por nombre
//	public void listarProductosPorNombre() {
//		productosPorNombre.listar();
//	}

	// Solo si te toco la lista por ID
//	public void listarProductosPorId() {
//		productosPorID.listar();
//	}

}
