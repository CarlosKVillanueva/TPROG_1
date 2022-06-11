package ar.edu.ort.tp1.parcial2.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Expedendora@author CKVillanueva el 6/8/2022 | 5:16 PM
 */
public class ProductosPorNombre extends ListaOrdenadaNodos<String, Producto> {


    @Override
    public int compare(Producto dato1, Producto dato2) {
        return dato1.getNombre().compareTo(dato2.getNombre());
    }

    @Override
    public int compareByKey(String clave, Producto elemento) {
        return clave.compareTo(elemento.getNombre());
    }
}
