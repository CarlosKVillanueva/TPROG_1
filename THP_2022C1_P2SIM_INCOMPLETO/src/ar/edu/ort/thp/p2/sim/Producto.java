package ar.edu.ort.thp.p2.sim;

public class Producto {

	private String nombre;
	private int cantidad;
	private int puntoReposicion;

	public Producto(String nombre, int cantidad, int puntoReposicion) {
		// TODO - Completar constructor
	}

	public void actualizar(Producto producto) {
		cantidad += producto.cantidad;
		setPuntoReposicion(producto.puntoReposicion);		
	}

	public int extraer(int cantidadRequerida) {
		int aExtraer = Math.min(cantidadRequerida, cantidad);
		cantidad -= aExtraer;
		if (necesitaReposicion())
			if (cantidad==0)
				System.out.println("El producto " + nombre + " se queda sin stock");
			else
				System.out.println("El producto " + nombre + " queda con stock insuficiente. Faltante: " + getFaltante());
		return aExtraer;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getFaltante() {
		return Math.max(0, puntoReposicion - cantidad);
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntoReposicion() {
		return puntoReposicion;
	}

	public boolean necesitaReposicion() {
		return cantidad < puntoReposicion;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPuntoReposicion(int puntoReposicion) {
		if (puntoReposicion > 0)
			this.puntoReposicion = puntoReposicion;
		else
			this.puntoReposicion = 0;
	}

}