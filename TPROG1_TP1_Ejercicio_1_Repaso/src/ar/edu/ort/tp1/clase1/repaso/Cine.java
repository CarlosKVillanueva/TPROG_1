package ar.edu.ort.tp1.clase1.repaso;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private String peli;
	private ArrayList<Funcion> funciones;
	// OP 1: Misma Funcion
	// private Funcion funcionABuscar;

	public Cine(String nombre, String peli) {
		this.nombre = nombre;
		this.peli = peli;
	}

	public boolean procesarEntradas(ArrayList<Entrada> entradas) {
		boolean todasOk = true;
		int idx = 0;

		while (idx < entradas.size() && todasOk) {
			// Validar la entrada en sub idx
			Entrada e = entradas.get(idx);
			todasOk = validarEntrada(e);
			idx++;
		}

		if (todasOk) {
			// OP 1 Misma Funcion
			// funcionABuscar.marcarAsientos(entradas);

			// OP2 Buscando la entrada nuevamente en caso de que sean diferentes funciones
			// marcarAsiento(entradas);

			// OP3 Con Metodo Estatico
			Funcion.marcarAsiento();
		}

		return todasOk;
	}

	// private void marcarAsiento(ArrayList<Entrada> entradas) {
	// for (Entrada entrada : entradas) {
	// Funcion funcion = buscarFuncion(entrada.getDia(), entrada.getHora());
	// funcion.marcarAsientos();
	// }
	// }

	private boolean validarEntrada(Entrada e) {
		Funcion funcion = buscarFuncion(e.getDia(), e.getHora());

		boolean entradaValida = esValida(e) && (funcion != null) && (funcion.asientoValido(e.getLetra(), e.getNro()));

		return entradaValida;
	}

	public boolean esValida(Entrada e) {
		return numeracionValida(e) && filaValida(e);
	}

	public boolean numeracionValida(Entrada e) {
		return e.getNro() >= 1 && e.getNro() <= 20;
	}

	public boolean filaValida(Entrada e) {
		String letras = "ABCDEFGHIJK";
		ArrayList<Character> chars = new ArrayList<Character>();

		for (int i = 0; i < letras.length(); i++) {
			chars.add(letras.charAt(i));
		}

		return chars.contains(e.getLetra());
	}

	private Funcion buscarFuncion(String dia, String hora) {
		Funcion elementoBuscado = null;
		int i = 0, cantElementos = funciones.size();

		while (i < cantElementos && elementoBuscado == null) {
			if (funciones.get(i).mismaFuncion(dia, hora)) {
				elementoBuscado = funciones.get(i);
			} else {
				i++;
			}
		}
		return elementoBuscado;
	}

	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", peli=" + peli + "]";
	}
	
	

}
