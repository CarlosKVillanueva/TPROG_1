package ar.org.edu.Ejercicio_3;

import com.sun.nio.sctp.IllegalReceiveException;
import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}

	public LectorEnteros(Scanner scanner) {
		setScanner(scanner);
	}

	private void setScanner(Scanner scanner) throws IllegalArgumentException {
		if (scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje) throws NumberFormatException {
		int num = 0;
		num = cargar(MENSAJE_CARGA_ENTERO);
		return num;
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		RangoDeEnteros rangoValido = new RangoDeEnteros(limiteA, limiteB);

		System.out.printf("%s entre %d y %d", mensaje, limiteA, limiteB);
		int num = 0;
		num = Integer.parseInt(scanner.nextLine());
		if (!rangoValido.incluye(num)) {
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
		}
		System.out.println("La nota " + num + "es Valida");
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		int num = 0;
		if (mensaje == null) {
			num = cargar(MENSAJE_CARGA_ENTERO);
		} else {
			num = cargar(mensaje);
		}
		if (rangoValido.incluye(num)) {
//			num = 0;
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
		}
		return num;
	}
}
