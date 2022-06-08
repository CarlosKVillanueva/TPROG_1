package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_5@author CKVillanueva el 6/8/2022 | 11:26 AM
 */
public class ListaTrabajosPendientes extends ListaOrdenadaNodos<Integer,Trabajo>{
    @Override
    public int compare(Trabajo dato1, Trabajo dato2) {
        return dato1.getCodigo() - dato2.getCodigo();
    }

    @Override
    public int compareByKey(Integer clave, Trabajo elemento) {
        return clave - elemento.getCodigo();
    }

}
