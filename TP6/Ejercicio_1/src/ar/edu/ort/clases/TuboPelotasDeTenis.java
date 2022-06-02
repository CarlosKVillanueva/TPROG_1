package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.*;
import ar.edu.ort.tdas.interfaces.*;

public class TuboPelotasDeTenis {
	private Pila<PelotaDeTenis> pelotas;

	public TuboPelotasDeTenis() {
		pelotas = new PilaNodos<>();
	}
	
	public TuboPelotasDeTenis(int cantidadDeElementos) {
		pelotas = new PilaNodos<>(cantidadDeElementos);
	}

	public boolean estaLleno() {
		return pelotas.isFull();
	}

	public boolean estaVacio() {
		return pelotas.isEmpty();
	}

	public PelotaDeTenis extraer() {
		return pelotas.pop();
	}

	public void guardar(PelotaDeTenis pelota) {
		pelotas.push(pelota);
	}
}
