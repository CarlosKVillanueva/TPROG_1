package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_3@author CKVillanueva el 29/05/2022 | 23:12
 */
public class ListaDeTerminos extends ListaOrdenadaNodos<String,Termino> {

    @Override
    public int compare(Termino termino1, Termino termino2) {
        return termino1.getClave().compareTo(termino2.getClave());
    }

    @Override
    public int compareByKey(String clave, Termino elemento) {
        return clave.compareTo(elemento.getClave());
    }


}
