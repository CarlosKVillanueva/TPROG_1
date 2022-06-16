package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.parcial2.clases.Pizza;
import ar.edu.ort.tp1.parcial2.clases.TipoDeMasa;

/**
 * Pizzeria@author CKVillanueva el 6/15/2022 | 8:04 PM
 */
public class Tradicional extends Pizza {

    private TipoDeMasa tipoDeMasa;
    public Tradicional(String nombre, float costoBase, float porcentajeGanancia, TipoDeMasa tipoDeMasa) {
        super(nombre, costoBase, porcentajeGanancia);
        this.tipoDeMasa = tipoDeMasa;
    }



    @Override
    public float getPrecioCosto(float costo) {
        return costo * this.tipoDeMasa.getPorcentaje();
    }

    @Override
    protected String mostrarHijos() {
        return this.tipoDeMasa.getDescripcion();
    }

    @Override
    public TipoPizza getTipoPizza() {
        return TipoPizza.TRADICIONAL;
    }
}
