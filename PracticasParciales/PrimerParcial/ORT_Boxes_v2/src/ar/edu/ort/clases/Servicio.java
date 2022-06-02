package ar.edu.ort.clases;

public abstract class Servicio implements Detallable {
	private String descripcion;
	private double porcentajeGanancia;
	private String patente;

	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.descripcion = descripcion;
		this.porcentajeGanancia = porcentajeGanancia;
		this.patente = patente;
	}

	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double costo = calcularPrecioCosto();
		return costo + (costo * porcentajeGanancia / 100);
	}

	@Override
	public void detallarServicio() {
		System.out.printf("Servicio de %s\n", this.getClass().getSimpleName());
		System.out.printf("Patente %s Precio: $%.2f\n", this.patente, calcularPrecioVenta() );
	}

	public String getDescripcion() {
		return descripcion;
	}
}
