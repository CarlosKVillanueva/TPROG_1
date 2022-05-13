package ar.edu.ort.clases;

import java.util.ArrayList;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;
	ArrayList<Jugador> jugadoresList;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = new String[]{"Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis"};
		this.torneos = new String[] {"Australia", "US Open", "Roland Garros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
	}

	public void procesarInfo() {
		jugadoresList = new ArrayList<>();
		for (String jugador : jugadores) {
			Jugador jugadorActual = new Jugador(jugador);
			jugadoresList.add(jugadorActual);
			procesaResultados(jugadorActual);
		}
	}

	private void procesaResultados(Jugador jugadorActual) {
		int fila = buscoJugador(jugadorActual.getNombre());
			for (int col = 0; col < resultados[fila].length; col++) {
				jugadorActual.procesarResultado(resultados[fila][col]);
			}
	}

	public String procesarTorneosJugador(String jugador) {
		StringBuilder competencias = new StringBuilder(jugador + ": ");
		int posJugador = buscoJugador(jugador);

		for (int fila = posJugador; fila <= posJugador ; fila++) {
			for (int col = 0; col < resultados[posJugador].length; col++) {
				competencias.append(String.format("%s: %d ", torneos[col], resultados[fila][col]));
			}
		}
		return competencias.toString();
	}

	public String obtenerResultadoJugador(String jugador, String torneo) {
		int posJugador = buscoJugador(jugador);
		int posTorneo = buscoTorneo(torneo);
		String resultado = "Datos ingresados invalidos";
		if (posJugador != -1 && posTorneo != -1) {
			resultado = String.format("Resultado de %s en %s: %d", jugador, torneo, resultados[posJugador][posTorneo]);
		}
		return resultado;
	}

	private int buscoJugador(String jugador) {
		return buscar(jugador, jugadores);
	}

	private int buscoTorneo(String torneo) {
		return buscar(torneo, torneos);
	}

	private int buscar(String elementoBuscado, String[] arr) {
		int posTorneo = -1;
		int i = 0;
		while (i < arr.length && posTorneo == - 1) {
			if (arr[i].equals(elementoBuscado)) {
				posTorneo = i;
			}
			i++;
		}
		return posTorneo;
	}

	public void procesarPeorPosTorneoJugador(String jugador) {
		int posJugador = buscoJugador(jugador);
		int posPeor = Integer.MIN_VALUE;
		for (int i = 0; i < resultados[posJugador].length; i++) {
			int posicionTorneo = resultados[posJugador][i];
			if (posicionTorneo > posPeor) {
				posPeor = posicionTorneo;
			}
		}
		System.out.println("Peor Resultado de " + jugador + " en el anio: " + posPeor);
	}

	public void mostrarResultados() {
		for (Jugador jugador : jugadoresList) {
			System.out.println(jugador);
		}
	}
}
