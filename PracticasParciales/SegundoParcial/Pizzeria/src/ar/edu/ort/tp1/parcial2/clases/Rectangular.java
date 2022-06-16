package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.parcial2.clases.AdicionalQueso;
import ar.edu.ort.tp1.parcial2.clases.Pizza;

/**
 * Pizzeria@author CKVillanueva el 6/15/2022 | 8:19 PM
 */
public class Rectangular extends Pizza {

    private static final int PRECIO_PORCION = 45;
    private long largo;
    private long ancho;
    private AdicionalQueso adicionalQueso;

    public Rectangular(String nombre, float costoDeProduccion, float porcentajeGanancia, long largo, long ancho, AdicionalQueso adicionalQueso) {
        super(nombre, costoDeProduccion, porcentajeGanancia);
        setLargo(largo);
        setAncho(ancho);
        this.adicionalQueso = adicionalQueso;
    }

    private void setAncho(long ancho) {
        if (ancho < 0) {
            throw new IllegalArgumentException("ArgumentoInvalido");
        }
        this.ancho = ancho;
    }

    private void setLargo(long largo) {
        if (largo < 0) {
            throw new IllegalArgumentException("ArgumentoInvalido");
        }
        this.largo = largo;
    }

    @Override
    public float getPrecioCosto(float costo) {
        return (costo + (this.largo * this.ancho * PRECIO_PORCION)) * this.adicionalQueso.getMultiplicadorQueso();
    }

    @Override
    protected String mostrarHijos() {
        return String.format("%d - %s", (ancho*largo),adicionalQueso.getDescripcion());
    }

    @Override
    public TipoPizza getTipoPizza() {
        return TipoPizza.RECTANGULAR;
    }
}
