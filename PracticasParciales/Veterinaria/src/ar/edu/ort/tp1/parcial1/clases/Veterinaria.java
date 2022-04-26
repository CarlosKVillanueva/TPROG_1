package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> animalesIngresados;

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.animalesIngresados = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
		if (mascota != null) {
			animalesIngresados.add(mascota);
			System.out.printf(TXT_INGRESO, mascota.getNombre());
		}
	}

	public Mascota buscarMascota(String nombre) {
	    int i = 0, cantidadMascotas = animalesIngresados.size();
	    Mascota mascotaBuscada = null;
	
	    while (i < cantidadMascotas && mascotaBuscada == null) {
	        Mascota elemento = animalesIngresados.get(i);
	        if (elemento.mismoNombre(nombre)) {
	            mascotaBuscada = elemento;
	        } else {
	            i++;
	        }
	    }
	    return mascotaBuscada;
	}

	public void vacunar() {
		int contVacunas = 0;
		for (Mascota mascota : animalesIngresados) {
			if (!mascota.estaVacunada()) {
				mascota.vacunar();
				contVacunas++;
			}
		}
		System.out.printf("Vacuanas aplicadas: %d", contVacunas);
	}

	@Override
	public void mostrar() {
		int conejo = 0, perro = 0, gato = 0;
		System.out.printf("Veterinaria: %s\n", nombre);
		System.out.printf("Doctor de Turno: %s\n", doctor.getNombre());
		for (Mascota mascota : animalesIngresados) {
			if (mascota instanceof Conejo) {
				conejo ++;
			} else if (mascota instanceof Perro) {
				perro++;
			} else if (mascota instanceof Gato) {
				gato++;
			}
		}
		System.out.printf(TXT_CANTIDADES, conejo, gato, perro);
	}
}
