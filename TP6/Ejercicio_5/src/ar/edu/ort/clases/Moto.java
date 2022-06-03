package ar.edu.ort.clases;

public class Moto extends Vehiculo {
	private static final int CILINDRADA_MINIMA = 125;
	private int cilindrada;
	private boolean limitador;

	public Moto(String patente, String marca, int cilindrada, boolean limitador) {
		// TODO - Completar
	}

	public boolean tieneLimitador() {
		return limitador;
	}

	@Override
	public boolean autoDiagnostico() {
		return limitador;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) throws IllegalArgumentException {
		this.cilindrada = cilindrada;
	}

}