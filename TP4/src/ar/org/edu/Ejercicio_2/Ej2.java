package ar.org.edu.Ejercicio_2;

import java.util.Scanner;

import ar.org.edu.Ejercicio_3.LectorEnteros;
import ar.org.edu.Ejercicio_3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2022);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto = "";


		while (alu == null) {
			try {
				alu = crearAlumno(nombreCompleto, anioNacimiento, dni, input);
			} catch (IllegalArgumentException e) {
				System.out.println("Error al instanciar al Alumno, error: " + e.getMessage());
			}
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}

	private static Alumno crearAlumno(String nombreCompleto,int anioNacimiento, int dni, Scanner input) throws IllegalArgumentException{
		System.out.println("Por favor, ingrese el Nombre Completo:");
		nombreCompleto = input.nextLine();
		System.out.println("Por favor, ingrese el Anio de Nacimiento:");
		anioNacimiento = Integer.parseInt(input.nextLine());
		System.out.println("Por favor ingrese el numero de Legajo");
		dni = Integer.parseInt(input.nextLine());
		return new Alumno(nombreCompleto, anioNacimiento, dni);
	}
}