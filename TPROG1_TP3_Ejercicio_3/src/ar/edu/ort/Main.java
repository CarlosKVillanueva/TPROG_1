package ar.edu.ort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = input.nextLine();

        System.out.println("Tu nombre es " +nombre);
    }
}
