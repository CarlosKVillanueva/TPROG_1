package ar.edu.ort.tp1.pacial1.clases;

import java.util.Objects;

public abstract class Mueble implements Mostrable {

	public static final int CIEN = 100;
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	@Override
	public void mostrar() {
		System.out.printf("Mueble tipo: %s - Modelo: %s - %.1f\n", getClass().getSimpleName(),this.modelo, calcularPrecioVenta());
	}

	public float calcularPrecioVenta(){
		return calcularPrecioCosto() + (calcularPrecioCosto() * (porcentajeGanancia / CIEN));
	}

	public abstract float calcularPrecioCosto();

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return Objects.equals(modelo, this.modelo);
	}

}
