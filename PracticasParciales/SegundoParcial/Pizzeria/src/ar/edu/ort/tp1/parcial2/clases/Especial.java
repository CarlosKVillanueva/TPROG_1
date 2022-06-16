package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.parcial2.clases.Pizza;
import ar.edu.ort.tp1.parcial2.clases.TamanioDePizza;

/**
 * Pizzeria@author CKVillanueva el 6/15/2022 | 8:16 PM
 */
public class Especial extends Pizza {
    public static final String FAINA_NO_PUEDE_SER_MENOR_A_0 = "La cantidad de faina no puede ser menor a 0";
    private static final int COSTO_FAINA = 70;
    private TamanioDePizza tamanioDePizza;
    private int cantFainas;

    public Especial(String nombre, float costoDeProduccion, float porcentajeGanancia, int  cantFainas, TamanioDePizza tamanioDePizza) {
        super(nombre, costoDeProduccion, porcentajeGanancia);
        setFainas(cantFainas);
        this.tamanioDePizza = tamanioDePizza;
    }

    private void setFainas(int cantFainas) {
        if (cantFainas < 0) {
            throw new IllegalArgumentException(FAINA_NO_PUEDE_SER_MENOR_A_0);
        }
        this.cantFainas = cantFainas;
    }


    @Override
    public float getPrecioCosto(float costo) {
        return (costo * this.tamanioDePizza.getPorcentaje()) + (this.cantFainas * COSTO_FAINA);
    }

    @Override
    protected String mostrarHijos() {
        return String.format("%d Fainas - %s", cantFainas, tamanioDePizza.getDescripcion());
    }

    @Override
    public TipoPizza getTipoPizza() {
        return TipoPizza.ESPECIAL;
    }

}
