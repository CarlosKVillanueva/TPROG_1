package ar.edu.ort.tp1.parcial2.clases;

public abstract class Pizza implements Mostrable{

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia invalida";
	private static final String MSG_COSTO_INVALIDO = "Costo invalido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre invalido";

	private String nombre;
	private float costoDeProduccion;
	private float porcentajeGanancia;

	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {
		setNombre(nombre);
		setCostoDeProduccion(costoDeProduccion);
		setPorcentajeGanancia(porcentajeGanancia);
	}

	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	private void setCostoDeProduccion(float costoDeProduccion) {
		if (costoDeProduccion <= 0) {
			throw new IllegalArgumentException(MSG_COSTO_INVALIDO);
		}
		this.costoDeProduccion = costoDeProduccion;
	}

	private void setPorcentajeGanancia(float porcentajeGanancia) {
		if (porcentajeGanancia < 0) {
			throw new IllegalArgumentException(MSG_GANANCIA_INVALIDA);
		}
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public float getPrecioDeVenta() {
		return getPrecioCosto(costoDeProduccion) + (1 + (porcentajeGanancia/100));
	}

	public abstract float getPrecioCosto(float costoDeProduccion);

	public String getNombre() {
		return nombre;
	}

	@Override
	public void mostrar() {
		System.out.printf("%s\t- %18s\t - Precio de Venta: $%10.2f - %s\n", getClass().getSimpleName(), this.nombre, this.getPrecioDeVenta(), mostrarHijos());
	}

	protected abstract String mostrarHijos();

	public abstract TipoPizza getTipoPizza();
}
