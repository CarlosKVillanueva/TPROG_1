package ar.edu.ort.tp1.clase1.repaso;

import java.util.ArrayList;

public class Funcion {

	private String dia;
	private String hora;
	private ArrayList<Asiento> asientos;
	private static ArrayList<Asiento> asientosValidos;

	public Funcion(String dia, String hora) {
		this.dia = dia;
		this.hora = hora;
		asientosValidos = new ArrayList<Asiento>();
	}

	public boolean asientoValido(char letra, int nro) {
		Asiento a = buscarAsiento(letra, nro);
		boolean validas = (a != null && a.estaReservado());

		if (validas) {
			asientosValidos.add(a);
		} else {
			asientosValidos.clear();
		}
		return validas;
	}

	public static void marcarAsiento() {
		for (Asiento asiento : asientosValidos) {
			asiento.marcarAsiento();
		}
	}

	public boolean mismaFuncion(String dia, String hora) {
		return this.dia.equals(dia) && this.hora.equals(hora);
	}

	private Asiento buscarAsiento(char letra, int nro) {
		Asiento elementoBuscado = null;
		int i = 0, cantElementos = asientos.size();

		while (i < cantElementos && elementoBuscado == null) {
			if (asientos.get(i).mismoAsiento(letra, nro)) {
				elementoBuscado = asientos.get(i);
			} else {
				i++;
			}
		}
		return elementoBuscado;
	}

}
