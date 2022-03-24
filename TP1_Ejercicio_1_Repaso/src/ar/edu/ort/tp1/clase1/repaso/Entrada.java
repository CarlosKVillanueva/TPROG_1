package ar.edu.ort.tp1.clase1.repaso;

public class Entrada {

	private char letra;
	private int nro;
	private String dia;
	private String hora;

	public Entrada(char letra, int nro, String dia, String hora) {
		this.letra = letra;
		this.nro = nro;
		this.dia = dia;
		this.hora = hora;
	}

	public char getLetra() {
		return letra;
	}

	public int getNro() {
		return nro;
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

}
