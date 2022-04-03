package ar.edu.ort.clases;

import java.util.ArrayList;

public class Direccion {
    private String calle;
    private String altura;
    private String piso;
    private String departamento;


    public Direccion(String calle, String altura, String piso, String departamento) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.departamento = departamento;
    }

    public String getPiso() {
        return piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String mostrarDpto() {
        return String.format("%s \"%s\"",piso, departamento);
    }
    @Override
    public String toString() {
        return String.format("Direccion: %s %s %s° \"%s\"", calle, altura, piso, departamento);
    }

    public boolean mismaVivienda(String pisoOrigen, String deptOrigen) {
        return this.piso.equals(pisoOrigen) && this.departamento.equals(deptOrigen);
    }
}


