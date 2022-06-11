package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

public class TrenPasajeros extends Tren {

	private static final String NO_SE_PUEDE_ABORDAR_TREN_EN_ARMADO = "No se puede abordar, tren en armado";
	private ListaOrdenada<ClaseVagon, VagonPasajeros> vagones;

	public TrenPasajeros(Locomotora locomotora, String codigo) {
		//TODO Completar 
	}


	//TODO Completar 

	/**
	 * Debe subir la cantidad de pasajeros indicados, en vagones apropiados al tipo de pasajero, los pasajeros deben entrara TODOS en el mismo vagón
	 * si no se pueden subir los pasajeros al tren se deberá arrojar un error (porque el tren está en armado o no hay lugar)
	 * @param cantidad
	 * @param tipoPasajero
	 */
	public void abordarPasajeros(int cantidad, TipoPasajero tipoPasajero) {
		//TODO Completar 
	}


}
