package ar.edu.ort;

import ar.edu.ort.clases.*;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main_Ejercicio_2 {
    public static void main(String[] args) {
        Anio anio = new Anio();

        System.out.println(anio.diasTranscurridos(4));
        System.out.println(anio.diasTranscurridos2(4));
        System.out.println(anio.getNombreDelMes(4));
    }
}