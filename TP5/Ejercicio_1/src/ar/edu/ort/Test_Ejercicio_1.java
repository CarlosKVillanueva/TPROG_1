package ar.edu.ort;

import ar.edu.ort.clases.Anio;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Test_Ejercicio_1 {
    public static void main(String[] args) {
        Anio anio = new Anio();
        System.out.println(anio.getNombreDelMes(4));
        System.out.println(anio.diasTranscurridos(3));
        System.out.println(anio.diasTranscurridos2(3));
    }
}