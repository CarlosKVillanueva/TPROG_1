package ar.edu.ort.tp1.clase1.repaso;

public class Asiento {

	private char letra;
	private int nro;
	private EstadoAsiento estado;

	public Asiento(char letra, int nro) {
		this.letra = letra;
		this.nro = nro;
		this.estado = EstadoAsiento.LIBRE;
	}

	public boolean mismoAsiento(char letra, int nro) {
		return this.letra == letra && this.nro == nro;
	}

	public boolean estaReservado() {
		return estado == EstadoAsiento.RESERVADO;
	}

	public void marcarAsiento() {
		this.estado = EstadoAsiento.CUMPLIDO;
	}
}
