package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_3@author CKVillanueva el 29/05/2022 | 19:43
 */
public class ListaDeIdiomas extends ListaOrdenadaNodos<String, Idioma> {


    @Override
    public int compare(Idioma idioma1, Idioma idioma2) {
        return idioma1.getClave().compareTo(idioma2.getClave());
    }

    @Override
    public int compareByKey(String clave, Idioma elemento) {
        return clave.compareTo(elemento.getClave());
    }
}
