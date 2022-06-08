package ar.edu.ort.clases;

public class Trabajo implements Reportable {
	private Servicio servicio;
	private Vehiculo vehiculo;
	private float importe;


	public Trabajo(Vehiculo vehiculo, Servicio trabajo) {
		setTrabajoVehiculo(vehiculo, trabajo);
		importe = 0;
		this.vehiculo = vehiculo;
		this.servicio = trabajo;
	}

	private void setTrabajoVehiculo(Vehiculo vehiculo, Servicio trabajo) {
		if (vehiculo == null || trabajo == null) {
			throw new IllegalArgumentException("El trabajo debe crearse con vehiculo y servicio asignados.");
		}
	}

	public int getCodigo() {
		return servicio.getCodigo();
	}

	public Servicio getService() {
		return servicio;
	}

	@Override
	public void reportar() {
		System.out.println("[" + vehiculo.getClass().getSimpleName() + " patente " + vehiculo.getPatente()
				+ " servicio a realizar " + servicio.getDesc() + "]");
	}

	public void aplicarPrecioHora(float precioHora) {
		importe = servicio.getHoras() * precioHora;
	}

	public float getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "Trabajo [servicio=" + servicio + ", vehiculo=" + vehiculo + ", importe=" + importe + "]";
	}
}
