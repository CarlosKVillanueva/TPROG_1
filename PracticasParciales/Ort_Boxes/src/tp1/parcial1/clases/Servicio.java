package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {

	private String descripcion;
	private double costoMateriales;
	private double porcentajeGanacia;
	private String patente;

	public Servicio(String descripcion, double costoMateriales, double porcentajeGanacia, String patente) {
		this.descripcion = descripcion;
		this.costoMateriales = costoMateriales;
		this.porcentajeGanacia = porcentajeGanacia;
		this.patente = patente;
	}

	public double getCostoMateriales() {
		return costoMateriales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void detallarServicio() {
		System.out.printf("Patente %s Precio: $%.2f \n", this.patente, calcularPrecioVenta());
	}

	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double precioCosto = calcularPrecioCosto();
		return precioCosto + (porcentajeGanacia * precioCosto / 100);
	}

	
}
