package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Garage@author CKVillanueva el 6/15/2022 | 4:20 PM
 */
public class AutosOrdenadosPorPatente extends ListaOrdenadaNodos<String, Auto> {
    @Override
    public int compare(Auto dato1, Auto dato2) {
        return dato1.getPatente().compareTo(dato2.getPatente());
    }

    @Override
    public int compareByKey(String clave, Auto elemento) {
        return clave.compareTo(elemento.getPatente());
    }
}
