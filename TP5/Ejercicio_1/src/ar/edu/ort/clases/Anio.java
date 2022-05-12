package ar.edu.ort.clases;

/**
 * Ejercicio_1 @author CKVillanueva el 5/11/2022 | 8:42 PM
 */
public class Anio {
    private int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private int[] diasAcumulados = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public String getNombreDelMes(int nroMes) {
        return (esMesValido(nroMes)) ? nombreMeses[nroMes - 1] : "No existe ese numero de mes";
    }

    private boolean esMesValido(int mes) {
        return mes > 0 && mes < 13;
    }

    public int diasTranscurridos(int nroMes) {
        int diasTranscurridos = 0;
        if (esMesValido(nroMes)) {
            for (int i = 0; i < nroMes - 1; i++) {
                diasTranscurridos += diasPorMes[i];
            }
        }
        return diasTranscurridos;
    }

    public int diasTranscurridos2(int nroMes) {
        int diasTranscurridos = 0;
        if (esMesValido(nroMes)) {
            diasTranscurridos = diasAcumulados[nroMes-1];
        }
        return diasTranscurridos;
    }
}
