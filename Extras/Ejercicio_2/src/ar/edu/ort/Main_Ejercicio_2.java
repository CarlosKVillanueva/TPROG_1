package ar.edu.ort;

import ar.edu.ort.clases.Clave4;
import java.util.Objects;
import java.util.Scanner;

/**
 * Ejercicio_2 @author CKVillanueva el 5/18/2022 | 6:29 PM
 */
public class Main_Ejercicio_2 {
    public static final String CORTE = "*";
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Clave4 clave4 = new Clave4();

        boolean acerto = false;
        String ingresoUser;
        System.out.println("Por favor, ingrese un numero de 0 a 9, Presion * para finalizar");
        System.out.println("Valor Ingresado\tResultado");
        System.out.println("-------------------------");
        do {
            ingresoUser = input.nextLine();

            if (Objects.equals(ingresoUser, CORTE)) {
                System.out.println("Gracias por Jugar a Clave 4");
            } else {
                acerto = clave4.procesar(ingresoUser);
            }
        } while (!Objects.equals(ingresoUser, CORTE) && !acerto);
    }
}
