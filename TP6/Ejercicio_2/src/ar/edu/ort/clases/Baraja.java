package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ColaNodos;
import java.util.ArrayList;

import ar.edu.ort.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tdas.interfaces.Cola;
import ar.edu.ort.tdas.interfaces.Pila;

public abstract class Baraja {

	protected Pila<Naipe> naipes;

	public Baraja(boolean mezclado) {
		naipes = new PilaNodos<>();
		cargarNaipes();
		if (mezclado) {
			mezclar();
		}
	}

	public void agregar(ArrayList<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove(0));			
		}
	}

	public void agregar(Cola<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove());			
		}
	}

	public void agregar(Naipe naipe) {
		naipes.push(naipe);
	}

	public void agregar(Pila<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.pop());			
		}
	}

	protected abstract void cargarNaipes();

	public Naipe extraer() {
		return naipes.pop();
	}

	public Cola<Naipe> extraer(int cuantos) {
		Cola<Naipe> cola = new ColaNodos<>();

		for (int i = 0; i < cuantos; i++) {
			cola.add(extraer());
		}
		return cola;
	}

/*
	//TODO
	public int getCantidadNaipes() {
		return naipes.size();
	}
*/

	/**
	 * Explicar aca que hace y como funciona
	 */
	protected void mezclar() {
		Urna<Naipe> mezclador = new Urna<>();
		while (!naipes.isEmpty()) {
			mezclador.add(naipes.pop());
		}
		while (!mezclador.isEmpty()) {
			naipes.push(mezclador.remove());
		}
	}
}