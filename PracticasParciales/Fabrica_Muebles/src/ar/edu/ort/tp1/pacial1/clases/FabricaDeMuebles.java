package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	private ArrayList<Mueble> muebles;
	private int contMesas = 0, contSillas = 0, contSillones = 0;
	private float acum = 0;

	
	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.muebles = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {

		boolean retorno = false;
		if (m != null) {
			retorno = muebles.add(m);
			System.out.println("Fabricando el mueble:");
			m.mostrar();
			acum += m.calcularPrecioVenta();
			contadorMuebles(m);
		}
		return retorno;
	}

	private void contadorMuebles(Mueble m) {
		if (m instanceof Mesa) {
			contMesas++;
		} else if (m instanceof Silla) {
			contSillas++;
		} else if (m instanceof Sillon) {
			contSillones++;
		}
	}

	@Override
	public void mostrar() {
		System.out.printf("Fabrica de Muebles: %s\n", this.nombre);
		System.out.printf("Se han fabricado: %d Mesas, %d Sillas y %d Sillones\nLa venta total fue: $%.2f\n",contMesas, contSillas, contSillones, acum);
	}
	
	public Mueble buscarMuebles(String modelo) {
	    int i = 0, cantidadElementos = muebles.size();
	    Mueble elementoBuscado = null;
	
	    while (i < cantidadElementos && elementoBuscado == null) {
	        Mueble elemento = muebles.get(i);
	        if (elemento.modeloCorrecto(modelo)) {
	            elementoBuscado = elemento;
	        } else {
	            i++;
	        }
	    }
	    return elementoBuscado;
	}

	public boolean seHaFabricado(String modelo) {
		return buscarMuebles(modelo) != null;
	}
}
