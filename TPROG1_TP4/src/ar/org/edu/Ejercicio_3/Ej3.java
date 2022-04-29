package ar.org.edu.Ejercicio_3;

import java.util.Calendar;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		Scanner input = new Scanner(System.in);
		LectorEnteros le = new LectorEnteros(input);
		try {
			int anioActual;
			int edad = 0;
			le.pedir("Hola Alumnos!");
			nacimiento = le.pedir("Ingrese anio de nacimiento", new RangoDeEnteros(1900, 2018));
			fallecimiento = le.pedir("Ingrese anio de Fallecimiento", new RangoDeEnteros(-1, 2018));
			anioActual = Calendar.getInstance().get(Calendar.YEAR);
			if (fallecimiento == -1 || fallecimiento == 0 || fallecimiento < nacimiento) {
				edad = anioActual - nacimiento;
				System.out.println("Usted tiene " + edad + " anios.");
			} else {
				edad = fallecimiento - nacimiento;
				System.out.println("Usted tuvo " + edad + " anios.");
			}
			input.close();
		} catch (NullPointerException npe) {
			System.out.println("El rango no debe ser null." + npe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
