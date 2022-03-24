package ar.edu.ort.tp1.clases;

import java.util.ArrayList;

public class Carrera {
    private Especialidad especialidad;
    private ArrayList<Atleta> atletas;

    public Carrera(Especialidad especialidad) {
        this.especialidad = especialidad;
        this.atletas = new ArrayList<Atleta>();
    }

    public ArrayList<Atleta> resultado(ArrayList<Atleta> atletas) {
        ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
        double minTiempo = Double.MAX_VALUE;

        for (Atleta atleta : atletas) {
        	double tiempoAtleta = atleta.getTiempo();
            if (tiempoAtleta < minTiempo) {
                ganadores.clear();
                minTiempo = tiempoAtleta;
                ganadores.add(atleta);
            } else if (tiempoAtleta == minTiempo) {
                ganadores.add(atleta);
            }
        }

        return ganadores;
    }

    @Override
    public String toString() {
        return "Carrera [atletas=" + atletas + ", especialidad=" + especialidad + "]";
    }

}
