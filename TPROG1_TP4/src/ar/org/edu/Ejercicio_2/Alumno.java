package ar.org.edu.Ejercicio_2;

import ar.org.edu.Ejercicio_3.RangoDeEnteros;

/**
 * TPROG1_TP4 @author CKVillanueva el 4/28/2022 | 10:55 AM
 */
public class Alumno extends Persona{
    final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
    private int numeroLegajo;

    public Alumno(String nombreCompleto, int anioNacimiento, int numeroLegajo) {
        super(nombreCompleto, anioNacimiento);
        setNumeroLegajo(numeroLegajo);
    }

    private void setNumeroLegajo(int numeroLegajo) throws IllegalArgumentException{
        if (numeroLegajo <= RANGO_NRO_DOCUMENTO.getLimiteInferior() || numeroLegajo >= RANGO_NRO_DOCUMENTO.getLimiteSuperior()) {
            throw new IllegalArgumentException("El numero de legajo es Invalido");
        }
        this.numeroLegajo = numeroLegajo;
    }

    @Override
    public String toString() {
        return String.format("Alumno: %s Legajo: %d", super.toString(), numeroLegajo);
    }
}
