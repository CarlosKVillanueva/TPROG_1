package ar.org.edu.Ejercicio_2;

import ar.org.edu.Ejercicio_3.RangoDeEnteros;
import java.util.Calendar;

/**
 * TPROG1_TP4 @author CKVillanueva el 4/28/2022 | 10:35 AM
 */
public class Persona {
    private static final int VALOR_AUN_VIVE = -9999;
    private String nombreCompleto;
    private int anioNacimiento;
    private int anioFallecimiento;
    private int anioActual;

    /**
     * Personas Vivas
     * @param nombreCompleto Nombre Persona
     * @param anioNacimiento Anio Nacimiento
     */
    public Persona(String nombreCompleto, int anioNacimiento) {
        this(nombreCompleto, anioNacimiento, VALOR_AUN_VIVE);
    }

    /**
     * Personas muertas
     * @param nombreCompleto
     * @param anioNacimiento
     * @param anioFallecimiento
     */
    public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
        setAnioActual();
        setNombreCompleto(nombreCompleto);
        setAniNacimiento(anioNacimiento);
        setAnioFallecimiento(anioFallecimiento);
    }

    private void setNombreCompleto(String nombreCompleto) throws IllegalArgumentException {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
        }
        this.nombreCompleto = nombreCompleto;
    }

    private void setAniNacimiento(int anioNacimiento) throws IllegalArgumentException{
        if (anioNacimiento > anioActual) {
            throw new IllegalArgumentException("El anio de nacimiento no puede estar en el futuro");
        }
        this.anioNacimiento = anioNacimiento;
    }

    private void setAnioFallecimiento(int anioFallecimiento) throws IllegalArgumentException{
        if (anioFallecimiento != VALOR_AUN_VIVE) {
            if (anioFallecimiento > anioActual) {
                throw new IllegalArgumentException("El anio de fallecimiento no puede estar en el futuro");
            } else if (anioFallecimiento < anioNacimiento) {
                throw new IllegalArgumentException("No puede fallecer antes de Nacer");
            }
        }
        this.anioFallecimiento = anioFallecimiento;
    }

    private void setAnioActual() {
        this.anioActual = Calendar.getInstance().get(Calendar.YEAR);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getAnioFallecimiento() {
        return anioFallecimiento;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public boolean vive() {
        return (anioFallecimiento - anioNacimiento) > VALOR_AUN_VIVE;
    }

    @Override
    public String toString() {
        return String.format("%s %d ", nombreCompleto, anioNacimiento);
    }
}
