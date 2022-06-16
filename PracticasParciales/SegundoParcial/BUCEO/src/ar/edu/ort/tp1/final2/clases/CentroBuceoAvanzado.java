package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;


public class CentroBuceoAvanzado {

	private static final String BUCEO_INVALIDO = "Buceo no disponible.";
	private static final int CANTIDAD_BUCEOS = 10;
	public static final String BUZO_INVALIDO = "Buzo Invalido";
	public static final String BUZO_NO_HABILITADO = "Buzo no habilitado por profundidad.";


	private String nombre;
	private Pila<String> erroresDeReserva;
	private ListaDeBuceosPorId buceosDisponibles;
	private Cola<Buzo> buzosRegistrados;
	private int[][] cantidadBuceosPorMes;

	public CentroBuceoAvanzado(String nombre) {
		this.nombre = nombre;
		erroresDeReserva = new PilaNodos<>();
		buceosDisponibles = new ListaDeBuceosPorId();
		buzosRegistrados = new ColaNodos<>();
		cantidadBuceosPorMes = new int[CANTIDAD_BUCEOS][Mes.values().length];
	}

	/**
	 * Se registra un buceo para un determinado buzo. si ocurre un error se registra
	 * en el log de errores, pero no se aborta la ejecucion.
	 * 
	 * -El buzo no puede ser nulo.	OK
	 * 
	 * -El buceo cuyo id se indica, debe estar en la coleccion de buceos disponibles.	OK
	 * 
	 * -El buzo debe estar habilitado para realizar el buceo seleccionado.
	 * 
	 * -De poder registrar al buzo, se debe agregar el buceo a su bitacora y
	 * agregarlo a los buzos registrados, que deben estar almacenados de forma
	 * cronologica.
	 * 
	 * @param buzo    Que desea bucear.
	 * @param idBuceo Identificador del buceo que el buzo quiere hacer.
	 */
	public void registrarBuceo(Buzo buzo, Integer idBuceo) {
		if (buzo == null) {
			erroresDeReserva.push("Buzo nulo");
		} else {
			Buceo buceo = buscarBuceoPorID(idBuceo);
			if (buceo == null) {
				erroresDeReserva.push("Buceo no disponible.");
			} else if (!buzo.habilitado(buceo.getProfundidad())) {
				erroresDeReserva.push("Buzo no habilitado por profundidad.");
			} else {
				buzo.agregarABitacora(buceo);
				this.buzosRegistrados.add(buzo);
			}
		}


	}

	public void agregarBuceo(Buceo buceo, Mes mes) {
		buceosDisponibles.add(buceo);
		cantidadBuceosPorMes[buceo.getId()-1][mes.ordinal()]++;
	}

	private Buceo buscarBuceoPorID(Integer idBuceo) {
		return buceosDisponibles.search(idBuceo);
	}

	public void listarErroresCronologico() {
		System.out.println("Mostrando errores en forma cronologica");
		Pila<String> aux = new PilaNodos<>();
		while (!this.erroresDeReserva.isEmpty()) {
			aux.push(this.erroresDeReserva.pop());
		}
		while (!aux.isEmpty()) {
			String error = aux.pop();
			System.out.println(error);
			this.erroresDeReserva.push(error);
		}
		System.out.println("------------------");
	}


	public void mostrarCantidadDeBuceosPorBuzoRegistrado() {
		System.out.println("Cantidad de buceos realizados por los buzos registrados en " + this.nombre);
		Buzo c = null;
		this.buzosRegistrados.add(c);
		Buzo aux = this.buzosRegistrados.remove();
		while (aux != c) {
			System.out.printf("-- El buzo %s realizo %3d buceos segun su bitacora.\n", aux.toString(),
					aux.cantidadDeEventos());
			this.buzosRegistrados.add(aux);
			aux = this.buzosRegistrados.remove();
		}
	}

	public void mostrarCantidadDeReservasPorMes() {
		System.out.println("------------------");
		System.out.println("Cantidad de buceos por Mes");
		for (int idxMes = 0; idxMes < Mes.values().length; idxMes++) {
			int cantBuceos = 0;
			for (int idxBuceo = 0; idxBuceo < buceosDisponibles.size() - 1; idxBuceo++) {
				cantBuceos += this.cantidadBuceosPorMes[idxBuceo][idxMes];
			}
			System.out.printf("El mes de %s tiene una cantidad de reservas de: %d\n", Mes.values()[idxMes].getNombre(),
					cantBuceos);
		}

	}
}
