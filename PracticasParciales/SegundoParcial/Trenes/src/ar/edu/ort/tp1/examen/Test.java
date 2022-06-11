package ar.edu.ort.tp1.examen;

import java.util.ArrayList;

import ar.edu.ort.tp1.examen.clases.*;

public class Test {

	public static void main(String[] args) {

		EmpresaTransporte empresa = new EmpresaTransporte("Tranviaria ORT");

		agregarLocomotoras(empresa);

		agregarTrenesPasajeros(empresa);

		empresa.mostrarTrenes();
	}

	private static void agregarLocomotoras(EmpresaTransporte empresa) {
		int id = 1;
		empresa.agregarLocomotora(new Locomotora(id++, "GE", "Gran Caiman"));
		empresa.agregarLocomotora(new Locomotora(id++, "Alco", "Legend One"));
		empresa.agregarLocomotora(new Locomotora(id++, "ASEA", "Trans Oceanic"));
		empresa.agregarLocomotora(new Locomotora(id++, "FAL", "Argentina 2"));
		empresa.agregarLocomotora(new Locomotora(id++, "Balwin", "Federal Express"));
		empresa.agregarLocomotora(new Locomotora(id++, "Westinghouse Electric", "Bio Train"));
		empresa.agregarLocomotora(new Locomotora(id++, "GE", "USA For All"));
		empresa.agregarLocomotora(new Locomotora(id, "Hyundai Rotem", "Supervia"));

	}

	private static void agregarTrenesPasajeros(EmpresaTransporte empresa) {

		System.out.println("Creando Trenes de pasajeros");
		System.out.println("----------------------------------");
		Locomotora locomotora = empresa.locomotoraPorId(2);
		ArrayList<Vagon> vagones = new ArrayList<Vagon>();
		vagones.add(new VagonPasajeros(30, ClaseVagon.TURISTA));
		vagones.add(new VagonPasajeros(20, ClaseVagon.PRIMERA));
		vagones.add(new VagonPasajeros(30, ClaseVagon.TURISTA));
		vagones.add(new VagonPasajeros(20, ClaseVagon.PRIMERA));
		vagones.add(new VagonPasajeros(30, ClaseVagon.TURISTA));
		Tren tren = EmpresaTransporte.crearTrenPasajeros(locomotora, "PAX1", vagones);
		cargarTrenPasajeros(tren, 1000, TipoPasajero.VIP);
		tren.finalizarArmado();
		cargarTrenPasajeros(tren, 15, TipoPasajero.VIP);
		cargarTrenPasajeros(tren, 30, TipoPasajero.VIP);
		cargarTrenPasajeros(tren, 30, TipoPasajero.COMUN);
		cargarTrenPasajeros(tren, 25, TipoPasajero.COMUN);
		empresa.agregarTren(tren);

		System.out.println("----------------------------------");

		locomotora = empresa.locomotoraPorId(4);
		vagones = new ArrayList<Vagon>();
		vagones.add(new VagonPasajeros(30, ClaseVagon.TURISTA));
		vagones.add(new VagonPasajeros(20, ClaseVagon.PRIMERA));
		vagones.add(new VagonPasajeros(30, ClaseVagon.TURISTA));
		tren = EmpresaTransporte.crearTrenPasajeros(locomotora, "PAX2", vagones);
		tren.finalizarArmado();
		cargarTrenPasajeros(tren, 15, TipoPasajero.VIP);
		cargarTrenPasajeros(tren, 7, TipoPasajero.VIP);
		cargarTrenPasajeros(tren, 30, TipoPasajero.COMUN);
		cargarTrenPasajeros(tren, 25, TipoPasajero.COMUN);
		empresa.agregarTren(tren);
		System.out.println("----------------------------------");

	}

	private static void cargarTrenPasajeros(Tren tren, int cantPasajeros, TipoPasajero tipoPasajero) {
		//TODO A completar
	}

}
