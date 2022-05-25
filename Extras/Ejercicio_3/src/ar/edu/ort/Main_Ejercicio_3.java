package ar.edu.ort;

import ar.edu.ort.clases.MaquinaExpendedora;
import java.util.Scanner;

/**
 * Ejercicio_3 @author CKVillanueva el 5/23/2022 | 6:10 PM
 */
public class Main_Ejercicio_3 {
    public static void main(String[] args) {
        MaquinaExpendedora expendedora = new MaquinaExpendedora();

        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("20");
        expendedora.pedirGolosina("33");
        expendedora.pedirGolosina("33");
        expendedora.pedirGolosina("33");
        expendedora.mostrarGolosinas();
        expendedora.rellenarMaquina("33",2);
        expendedora.apagarMaquina();

    }
}
