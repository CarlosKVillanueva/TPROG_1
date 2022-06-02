package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usara una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);
		
		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);
	}

	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		TuboPelotasDeTenis aux = new TuboPelotasDeTenis();
		PelotaDeTenis pelota;
		while (!tuboDePelotas.estaVacio()) {
			pelota = tuboDePelotas.extraer();
			System.out.println(pelota);
			aux.guardar(pelota);
		}
		while (!aux.estaVacio()) {
			tuboDePelotas.guardar(aux.extraer());
		}
	}

}
