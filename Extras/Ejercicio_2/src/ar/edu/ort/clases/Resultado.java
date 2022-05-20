package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/18/2022 | 7:00 PM
 */
public class Resultado {
    public static final int TOTAL_NUMEROS = 4;
    private int buenos;
    private int regulares;

    public Resultado(int buenos, int regulares) {
        this.buenos = buenos;
        this.regulares = regulares;
    }

    public int getBuenos() {
        return buenos;
    }

    public int getRegulares() {
        return regulares;
    }

    public int getMalos() {
        return TOTAL_NUMEROS - this.buenos - this.regulares;
    }

    public void resetContadores() {
        this.buenos = 0;
        this.regulares = 0;
    }
}
