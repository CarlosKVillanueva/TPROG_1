package ar.edu.ort;

import ar.edu.ort.clases.EstadoAirbag;
import ar.edu.ort.clases.Taller;

public class Main_Ejercicio_5 {
	static Taller quickAuto;

	public static void main(String[] args) {
		quickAuto = new Taller();

		System.out.println("*** AgregadoVehiculos ***");


			quickAuto.agregarVehiculoEnEspera("AAA", "Ford", EstadoAirbag.DEFECTUOSO);
			quickAuto.agregarVehiculoEnEspera("BBB", "Fiat", EstadoAirbag.OK);
			quickAuto.agregarVehiculoEnEspera("CCC", "Citroen", EstadoAirbag.NO_POSEE);
			quickAuto.agregarVehiculoEnEspera("HHH", "Honda", 500, true);
			quickAuto.agregarVehiculoEnEspera("MMM", "Motomel", 125, false);
			quickAuto.agregarVehiculoEnEspera("SSS", "Suzuki", 250, true);
			quickAuto.agregarVehiculoEnEspera("KKK", "Chevrolet", EstadoAirbag.OK);

			try {
				quickAuto.agregarVehiculoEnEspera("", "Ford", EstadoAirbag.OK);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				quickAuto.agregarVehiculoEnEspera(null, "Suzuki", 500, true);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				quickAuto.agregarVehiculoEnEspera("", "Suzuki", 250, true);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


		System.out.println("RevisarVehiculosEnPuerta");
		quickAuto.revisarVehiculosEnPuerta();
		System.out.println("------------------- PROCESAR INGRESO VEHICULOS ---------------------");
		quickAuto.procesarIngresoVehiculos();
		System.out.println("------------------- reportarTrabajosPendientes ---------------------");
		quickAuto.reportarTrabajosPendientes();
		System.out.println("------------------- procesarServicios ---------------------");
		quickAuto.procesarServicios();
		quickAuto.informarImporteServicios();
		quickAuto.informarResumenServicios();
	}

}