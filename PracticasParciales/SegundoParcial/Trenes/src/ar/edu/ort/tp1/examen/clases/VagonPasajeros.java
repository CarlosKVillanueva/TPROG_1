package ar.edu.ort.tp1.examen.clases;

public class VagonPasajeros extends Vagon {

	private int capacidadMaxima;
	private int cantidadPasajeros;
	private ClaseVagon clase;

	public VagonPasajeros(int capacidadMaxima, ClaseVagon claseVagon) {
		this.capacidadMaxima = capacidadMaxima;
		this.clase = claseVagon;
		cantidadPasajeros = 0;
	}

	public int capacidadDisponible() {
		return capacidadMaxima - cantidadPasajeros;
	}

	public void subirPasajeros(int cantidad) {
		cantidadPasajeros += cantidad;
	}

	public ClaseVagon getClase() {
		return this.clase;
	}
	
	//TODO Completar 
}
