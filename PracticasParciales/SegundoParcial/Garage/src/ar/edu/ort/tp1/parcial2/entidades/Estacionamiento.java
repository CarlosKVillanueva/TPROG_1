/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.tdas.implementaciones.ListaOrdenadaNodos;
import ar.edu.ort.tp1.parcial2.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.parcial2.tdas.interfaces.ListaOrdenada;
import ar.edu.ort.tp1.parcial2.tdas.interfaces.Pila;
import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;


/**
 * Entidad que engloba el funcionamiento de un estacionamiento de autos y
 * motocicletas. cada tipo de vehículo será estacionado de la forma determinada
 * y en base a su capacidad asignada al momento de la creación del
 * estacionamiento.
 * <p>
 * Se debe tene en cuenta que el funcionamiento del estacionamiento para cada
 * tipo de vehículo es del tipo LIFO Utilizar la implementación de TAD que
 * corresponda
 */
public class Estacionamiento {

	public static final int AUTO = 0;
	public static final int MOTO = 1;
	private int capacidadAutos;
	private int capacidadMotocicletas;
	private float precioAutosPorHora;
	private float precioMotocicletasPorHora;
	private PisosEstacionamiento[] estacionamiento;
	private AutosOrdenadosPorPatente listaAutos;
	private MotosOrdenadasPorPatente listaMotos;


	/**
	 * Constructor del estacionamiento, recibe las capacidades de autos y motos y
	 * los precios por hora completas.
	 *
	 * @param capacidadAutos            CapacidadAutos
	 * @param capacidadMotocicletas     CapacidadMotos
	 * @param precioAutosPorHora        PrecioAutosHora
	 * @param precioMotocicletasPorHora PrecioMotocicletasPorHora
	 */
	public Estacionamiento(int capacidadAutos, int capacidadMotocicletas, float precioAutosPorHora, float precioMotocicletasPorHora) {
		this.capacidadAutos = capacidadAutos;
		this.capacidadMotocicletas = capacidadMotocicletas;
		setPrecioAutosPorHora(precioAutosPorHora);
		setPrecioMotocicletasPorHora(precioMotocicletasPorHora);
		this.listaAutos = new AutosOrdenadosPorPatente();
		this.listaMotos = new MotosOrdenadasPorPatente();
		inicializarEstacionamiento();
	}

	private void inicializarEstacionamiento() {
		estacionamiento = new PisosEstacionamiento[2];
		estacionamiento[AUTO] = new PisosEstacionamiento(capacidadAutos);
		estacionamiento[MOTO] = new PisosEstacionamiento(capacidadMotocicletas);
	}

	/**
	 * Setea el precio de la hora de auto, debe ser mayor a 0
	 *
	 * @param precioAutosPorHora Precio
	 */
	private void setPrecioAutosPorHora(float precioAutosPorHora) throws EstacionamientoException {
		if (precioAutosPorHora < 0) {
			throw new EstacionamientoException("Precio Invalido");
		}
		this.precioAutosPorHora = precioAutosPorHora;
	}

	/**
	 * Setea el precio de la hora de la motocicleta , debe ser mayor a 0
	 *
	 * @param precioMotocicletasPorHora the precioMotocicletas to set
	 */
	private void setPrecioMotocicletasPorHora(float precioMotocicletasPorHora) throws EstacionamientoException {
		if (precioAutosPorHora < 0) {
			throw new EstacionamientoException("Precio Invalido");
		}
		this.precioMotocicletasPorHora = precioMotocicletasPorHora;
	}

	/**
	 * Permite estacionar un vehículo en el estacionamiento. La patente debe ser
	 * válida segun el tipo de vehículo el horario de ingreso debe ser válido
	 *
	 * @param tipo    de vehículo
	 * @param patente del vehículo
	 * @param hora    de ingreso
	 */
	public void estacionar(TipoVehiculo tipo, String patente, Hora hora) throws EstacionamientoException {
		switch (tipo) {
			case AUTO -> estacionarAuto(patente, hora);
			case MOTOCICLETA -> estacionarMoto(patente, hora);
		}
	}

	/**
	 * Permite estacionar una motocicleta.
	 *
	 * @param patente de la moto
	 * @param hora    del ingreso
	 */
	private void estacionarMoto(String patente, Hora hora) throws EstacionamientoException {
		Motocicleta moto = new Motocicleta(patente, hora, precioMotocicletasPorHora);
		estacionamiento[MOTO].push(moto);
		System.out.println("Se estaciono correctamente la moto patente: " + patente);
		listaMotos.add(moto);
	}

	/**
	 * permite estacionar un auto
	 *
	 * @param patente del auto
	 * @param hora    del Ingreso
	 */
	private void estacionarAuto(String patente, Hora hora) throws EstacionamientoException {
		Auto auto = new Auto(patente, hora, precioAutosPorHora);
		estacionamiento[AUTO].push(auto);
		System.out.println("Se estaciono correctamente el auto patente: " + patente);
		listaAutos.add(auto);
	}

	/**
	 * Retira un vehículo del estacionamiento. debe detectar el tipo de vehículo en
	 * base a su patente (ver diferencias entre la patente de los autos y las motos)
	 * el horario de egreso debe ser válido si el vehículo no está estacionado debe
	 * lanzar una excepción.
	 *
//	 * @param patente
//	 * @param horaEgreso
//	 * @param minutosEgreso
//	 * @return
	 */
	public float retirar(String patente, Hora hora) throws EstacionamientoException {
		TipoVehiculo tipo = patente.matches(TipoVehiculo.MOTOCICLETA.getRegex()) ? TipoVehiculo.MOTOCICLETA : TipoVehiculo.AUTO;
		float importe = 0;
		if (tipo == TipoVehiculo.AUTO && listaAutos.exists(patente)) {
			Auto auto = (Auto) retirar(patente, estacionamiento[AUTO]);
			importe = auto.calcularImporte(hora);
		} else if (tipo == TipoVehiculo.MOTOCICLETA && listaMotos.exists(patente)) {
			Motocicleta moto = (Motocicleta) retirar(patente, estacionamiento[MOTO]);
			importe = moto.calcularImporte(hora);
		}

		return importe;
	}

	/**
	 * Retira el vehículo de la TAD especificada
	 *
	 * //@param patente a retirar
	 * //@param tad     REEMPLAZAR EL TIPO DE ESTE PARAMETRO POR LA TAD QUE CORRESPONDA
	 * //@throws EstacionamientoException Cuando no se encuentra el vehículo
	 */
	private Vehiculo retirar(String patente, Pila<Vehiculo> pila) throws EstacionamientoException {

		Pila<Vehiculo> aux = new PilaNodos<>();
		Vehiculo vehiculo;
		Vehiculo vehiculoARetirar = null;
		while (!pila.isEmpty()) {
			vehiculo = pila.pop();
			if (vehiculo.mismaPatente(patente)) {
				vehiculoARetirar = vehiculo;
			} else {
				aux.push(vehiculo);
			}
		}
		while (!aux.isEmpty()) {
			pila.push(aux.pop());
		}

		return vehiculoARetirar;
	}

	/**
	 * Muestra por pantalla el resumen del final del día (cantidad de autos y motos
	 * estacionados, total recaudado para autos y para motos y los listados de los
	 * autos y motos estacionados durante el día con el importe abonado por cada
	 * uno)
	 */
	public void finalizarDia() {
		//TODO DESCOMENTAR Y COMPLETAR
		/*System.out.println("\r\n--------- Resumen final del día --------------\r\n");
		System.out.printf("Se han estacionado %d autos\n", );
		System.out.printf("Se han estacionado %d motocicletas\n", );
		System.out.println("\r\n----------------------------------------------");
		System.out.printf("Por estacionamiento de autos se ha recaudado $ %4.2f\n",);
		System.out.printf("Por estacionamiento de motocicletas se ha recaudado $ %4.2f\n",);
		System.out.println("\r\n----------------------------------------------");
		System.out.println("Listado de autos estacionados");
		this.mostrarListadoFinalDia();
		System.out.println("\r\n----------------------------------------------");
		System.out.println("Listado de motocicletas estacionados");
		this.mostrarListadoFinalDia();
		System.out.println("\r\n--------- Fin del reporte resumen final del día --------------\r\n");*/
	}

	/**
	 * @param listado a mostrar
	 */
	private void mostrarListadoFinalDia(ListaOrdenada<String, Vehiculo> listado) {
		for (Vehiculo vehiculo : listado) {
			System.out.println(vehiculo);
		}
	}

	/**
	 * Inner class que posee los datos de un auto que fue estacionado durante el día
	 */
	private class RegistroVehiculoEstacionado {

		private String patente;
		private float importe;

		/**
		 * @param patente
		 * @param importe
		 */
		public RegistroVehiculoEstacionado(String patente, float importe) {
			this.patente = patente;
			this.importe = importe;
		}

		/**
		 * @return the patente
		 */
		public String getPatente() {
			return patente;
		}

		/**
		 * @return the importe
		 */
		public float getImporte() {
			return importe;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RegistroVehiculoEstacionado [patente=" + patente + ", importe=" + importe + "]";
		}

	}
}
