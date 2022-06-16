package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

/**
 * BUCEO@author CKVillanueva el 6/12/2022 | 12:04 AM
 */
public class ListaDeBuceosPorId extends ListaOrdenadaNodos<Integer, Buceo> {
    @Override
    public int compare(Buceo dato1, Buceo dato2) {
        return dato1.getId() - dato2.getId();
    }

    @Override
    public int compareByKey(Integer clave, Buceo elemento) {
        return clave - elemento.getId();
    }
}
