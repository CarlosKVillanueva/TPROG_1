package ar.edu.ort.clases;

public class Equipo {
	
	private String  nombre;
	private int		puntos;
	
	
	public Equipo(String nombre, int puntos) {
		this.nombre = nombre;
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return nombre + ": " + puntos + " puntos";
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void adicionarPuntos(int puntos) {
		this.puntos += puntos;
	}
}
