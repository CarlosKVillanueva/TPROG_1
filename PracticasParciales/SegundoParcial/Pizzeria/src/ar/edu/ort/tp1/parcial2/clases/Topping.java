package ar.edu.ort.tp1.parcial2.clases;

public enum Topping {

	TOMATE("Tomate"), JAMON("Jam�n"), MORRON("Morr�n"), CEBOLLA("Cebolla"), SALAMIN("Salam�n");
	
	private String nombre;
	
	private Topping(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
}
