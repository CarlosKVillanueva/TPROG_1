package ar.edu.ort.clases;

import ar.edu.ort.clases.CotizablePorManoObra;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	private static final double EXTRA_BALANCEO = 500;
	private int horas;
	private boolean incluyeBalanceo;

	public Alineacion(String descripcion, double porcentajeGanancia, String patente,int horas, boolean incluyeBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
		this.incluyeBalanceo = incluyeBalanceo;
	}

	@Override
	public double calcularCostoHoras() {
		return this.horas * COSTO_HORA;
	}

	@Override
	public double calcularPrecioCosto() {
		double costoHoras = calcularCostoHoras();
		return (incluyeBalanceo) ? (costoHoras + EXTRA_BALANCEO) : costoHoras;
	}
}
