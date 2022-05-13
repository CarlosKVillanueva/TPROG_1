package ar.edu.ort;

import ar.edu.ort.clases.CircuitoATP;

public class Main_Ejercicio_4 {

	public static void main(String[] args) {
		CircuitoATP catp = new CircuitoATP();
		catp.procesarInfo();
		catp.mostrarResultados();
		System.out.println(catp.procesarTorneosJugador("Delbonis"));
		System.out.println(catp.obtenerResultadoJugador("Schwartzman", "Roland Garros"));
		catp.procesarPeorPosTorneoJugador("Pella");

	}

}
