package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;
import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

/**
 * Pizzeria@author CKVillanueva el 6/15/2022 | 9:58 PM
 */
public class PizzasPorPrecioVenta extends ListaOrdenadaNodos<Float, Pizza> {

    @Override
    public int compare(Pizza dato1, Pizza dato2) {
        return Float.compare(dato1.getPrecioDeVenta(), dato2.getPrecioDeVenta());
    }

    @Override
    public int compareByKey(Float clave, Pizza elemento) {
        return clave.compareTo(elemento.getPrecioDeVenta());
    }

}
