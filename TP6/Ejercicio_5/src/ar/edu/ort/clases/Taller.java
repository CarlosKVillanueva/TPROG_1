package ar.edu.ort.clases;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.ort.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tdas.interfaces.Cola;

public class Taller {
	private Servicio[] servicios;
	private static final int MAX_TRABAJOS_DIARIOS = 50;
	private static float PRECIO_HORA = 3000;
	private static Scanner input = new Scanner(System.in);
	private Cola<Vehiculo> vehiculosEnPuerta;
	private ArrayList<Trabajo> trabajosRealizados;
	int[] cantidadPorServicios;
	private ListaTrabajosPendientes trabajosPendientes;

	public Taller() {
		vehiculosEnPuerta = new ColaNodos<>(MAX_TRABAJOS_DIARIOS);
		trabajosRealizados = new ArrayList<>();
		trabajosPendientes = new ListaTrabajosPendientes();
		cargarServicios();
		cantidadPorServicios = new int[servicios.length];
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param patente
	 * @param marca
	 * @param airbag
	 */
	public void agregarVehiculoEnEspera(String patente, String marca, EstadoAirbag airbag) {
		agregarVehiculoEnEspera(new Auto(patente, marca, airbag));
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param tieneLimitador
	 */
	public void agregarVehiculoEnEspera(String patente, String marca, int cilindrada, boolean tieneLimitador) {
		agregarVehiculoEnEspera(new Moto(patente,marca,cilindrada,tieneLimitador));
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param vehiculo
	 */
	private void agregarVehiculoEnEspera(Vehiculo vehiculo) {
		vehiculosEnPuerta.add(vehiculo);
	}

	/**
	 * Crea una estructura a nivel de la clase que guarda todos los servicios
	 * posibles, los que luego seran asignados a los vehiculos que ingresen al taller.
	 */
	public void cargarServicios() {
		String[] nombresServicios = { "Cambio de Bateria", "Cambio Aceite y Filtro", "Alineacion y Balanceo",
				"Cambio amortiguadores", "Servicio completo" };
		float[] duracionEstimadaServicio = { 0.5f, 1, 1.5f, 2, 3 };

		servicios = new Servicio[nombresServicios.length];
		for (int i = 0; i < nombresServicios.length; i++) {
			servicios[i] = new Servicio(i+1, nombresServicios[i], duracionEstimadaServicio[i]);
		}
	}

	private Trabajo crearTrabajo(Vehiculo vehiculo) {
		int numero = 0;
		numero = pedirServicio();
		Servicio servicio = servicios[numero - 1];
		return new Trabajo(vehiculo, servicio);
	}

	public void informarImporteServicios() {
		float total = 0;
		for (Trabajo trabajo : trabajosRealizados) {
			System.out.println(trabajo);
			total += trabajo.getImporte();
		}
		System.out.println("La recaudacion del dia fue: $" + total);
	}

	/**
	 * Genera e informa la cantidad de servicios realizados para cada tipo de servicio.
	 */
	public void informarResumenServicios() {
		for (int i = 0; i < cantidadPorServicios.length; i++) {
			System.out.printf("%s: %d\n",servicios[i].getDesc(),cantidadPorServicios[i]);
		}
	}

	private void mostrarMenuServicios() {
		for (int i = 0; i < servicios.length; i++) {
			System.out.println(servicios[i]);
		}
	}

	private int pedirServicio() {
		int numero = 0;
		boolean ok = false;
		while (!ok) {
			try {
				mostrarMenuServicios();
				System.out.println("Solicite un servicio 1-5:");
				numero = input.nextInt();
				if (numero > 0 && numero <= servicios.length) {
					ok = true;
					cantidadPorServicios[numero - 1]++;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error. Ingrese un numero correcto");
			} finally {
				input.nextLine();
			}
		}
		return numero;
	}

	/**
	 * Asumiendo que ya todos los vehiculos en espera son validos agrega
	 * a cada uno a los trabajos pendientes. Al agregarlos pide tambien
	 * el servicio a realizar. (Para crear un Trabajo hacen falta un Vehiculo y un Servicio.
	 */
	public void procesarIngresoVehiculos() {
		Trabajo trabajo;
		Vehiculo vehiculo;
		while (!vehiculosEnPuerta.isEmpty()) {
			vehiculo = vehiculosEnPuerta.remove();
			System.out.printf("Igresa el Vehiculo %s\n", vehiculo.getPatente());
			trabajo = crearTrabajo(vehiculo);
			trabajosPendientes.add(trabajo);
		}
	}

	public void procesarServicios() {
		Trabajo trabajo;
		while (!trabajosPendientes.isEmpty()) {
			trabajo = trabajosPendientes.removeAt(0);
			trabajo.aplicarPrecioHora(PRECIO_HORA);
			trabajosRealizados.add(trabajo);
		}
	}

	public void reportarTrabajosPendientes() {
		for (Trabajo trabajo : trabajosPendientes) {
			trabajo.reportar();
		}
	}

	/**
	 * Para evitar contratiempos chequea que los vehiculos que esperan
	 * en la puerta cumplan con las nuevas condiciones de atencion.
	 * Como puede procesarse mas de una vez debe asegurarse de mantener
	 * el orden de los vehiculos en puerta.
	 */
	public void revisarVehiculosEnPuerta() {
		Cola<Vehiculo> aceptados = new ColaNodos<>();
		System.out.println("Vehiclos que no pueden ingresaral taller");
		Vehiculo vehiculo;
		while (!vehiculosEnPuerta.isEmpty()) {
			vehiculo = vehiculosEnPuerta.remove();
			if (vehiculo.autoDiagnostico()) {
				aceptados.add(vehiculo);
			} else {
				System.out.printf("El vehiculo patente %s no cumple con los requisitos y es rechazado\n", vehiculo.getPatente());
			}
		}
		reordenarCola(aceptados);
	}

	private void reordenarCola(Cola<Vehiculo> aceptados) {
		while (!aceptados.isEmpty()) {
			vehiculosEnPuerta.add(aceptados.remove());
		}
	}

}