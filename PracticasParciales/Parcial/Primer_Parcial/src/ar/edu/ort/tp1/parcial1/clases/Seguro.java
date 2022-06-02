package ar.edu.ort.tp1.parcial1.clases;

public abstract class Seguro implements Mostrable {

	private static final String MOSTRAR_PATTERN = "Seguro de %s, cuya descripción es %s - detalle: %s, pagará mensualmente $ %.2f.\n";

	private String descripcion;
	private Asegurado tomadorDelSeguro;
	private double valorAsegurado;
	private String modelo;

	public Seguro(String descripcion, double valorAsegurado, String modelo) {
		this.descripcion = descripcion;
		this.valorAsegurado = valorAsegurado;
		this.modelo = modelo;
	}

	public void asegurar(Asegurado asegurado) {
		this.tomadorDelSeguro = asegurado;
	}

	public double calcularPremio(){
		return this.valorAsegurado * calculoEspecifico();
	}

	protected abstract double calculoEspecifico();

	public double getValorAsegurado() {
		return valorAsegurado;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public void mostrar() {
		System.out.printf(MOSTRAR_PATTERN, getClass().getSimpleName(), this.descripcion,this.texto(), this.valorAsegurado);
	}

	@Override
	public String toString() {
		return "Seguro{" +
				"descripcion='" + descripcion + '\'' +
				", tomadorDelSeguro=" + tomadorDelSeguro +
				", valorAsegurado=" + valorAsegurado +
				", modelo='" + modelo + '\'' +
				'}';
	}



}
