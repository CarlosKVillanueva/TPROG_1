package ar.edu.ort.tp1.parcial2.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Expedendora@author CKVillanueva el 6/8/2022 | 5:17 PM
 */
public class ProductosPorId extends ListaOrdenadaNodos<Integer, Producto> {

    @Override
    public int compare(Producto dato1, Producto dato2) {
        return dato1.getId()- dato2.getId();
    }

    @Override
    public int compareByKey(Integer clave, Producto elemento) {
        return clave - elemento.getId();
    }
}
