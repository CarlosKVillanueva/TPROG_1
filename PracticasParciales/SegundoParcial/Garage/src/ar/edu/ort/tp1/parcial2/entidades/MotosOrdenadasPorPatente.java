package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Garage@author CKVillanueva el 6/15/2022 | 4:22 PM
 */
public class MotosOrdenadasPorPatente extends ListaOrdenadaNodos<String, Motocicleta> {
    @Override
    public int compare(Motocicleta dato1, Motocicleta dato2) {
        return dato1.getPatente().compareTo(dato2.getPatente());
    }

    @Override
    public int compareByKey(String clave, Motocicleta elemento) {
        return clave.compareTo(elemento.getPatente());
    }
}
