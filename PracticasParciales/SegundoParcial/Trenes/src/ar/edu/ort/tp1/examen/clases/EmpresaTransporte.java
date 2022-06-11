package ar.edu.ort.tp1.examen.clases;

import java.util.ArrayList;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class EmpresaTransporte {

	//TODO Completar Atributos / Constantes
	
	public EmpresaTransporte(String nombre) {
		//TODO Completar
	}

	public void mostrarTrenes() {
		System.out.println("Trenes de la empresa " + nombre);
		//TODO Completar
	}
	
	public static Tren crearTrenPasajeros(Locomotora locomotora, String codigo, ArrayList<Vagon> vagones) {
		TrenPasajeros tren = new TrenPasajeros(locomotora, codigo);
		engancharVagones(vagones, tren);
		return tren;
	}

	//TODO Completar métodos faltantes
}
