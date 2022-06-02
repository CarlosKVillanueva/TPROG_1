package ar.edu.ort;

/**
 * Ejercicio_2@author CKVillanueva el 5/29/2022 | 10:23 AM
 */


import ar.edu.ort.tdas.interfaces.*;
import ar.edu.ort.clases.*;

public class Main_Ejercicio_2 {

    public static void main(String[] args) {
        BarajaEspaniola mazo = new BarajaEspaniola(false);
        Cola<Naipe> monton = mazo.extraer(10);


        boolean hayComodines = revisar(monton);

        if (hayComodines) {
            System.out.println("Se encontraron comodines");
        } else {
            System.out.println("No se encontraron comodines");
        }
    }

    private static boolean revisar(Cola<Naipe> monton) {
        boolean hay = false;
        // creamos un naipe inexistente (con numero 0)
        Naipe cartaControl = null;
        monton.add(null);
        cartaControl = monton.remove();

        while (cartaControl != null) {
            if (cartaControl.getDescripcion().equals("Comodin")) {
                hay = true;
            }
            monton.add(cartaControl);
            cartaControl = monton.remove();
        }
        return hay;
    }
}