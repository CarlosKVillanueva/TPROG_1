package ar.edu.ort;

import ar.edu.ort.clases.CeldaSudoku;

/**
 * Ejercicio_1 @author CKVillanueva el 5/18/2022 | 9:49 AM
 */
public class Main_Ejercicio_1 {
    public static void main(String[] args) {
        CeldaSudoku celdaSudoku = new CeldaSudoku();

        System.out.println(celdaSudoku.agregarValor(0, 0, 8));
        System.out.println(celdaSudoku.agregarValor(1, 0, 7));
        System.out.println(celdaSudoku.agregarValor(0, 1, 6));
        System.out.println(celdaSudoku.agregarValor(0, 0, 10));
        celdaSudoku.mostrar();
    }
}
