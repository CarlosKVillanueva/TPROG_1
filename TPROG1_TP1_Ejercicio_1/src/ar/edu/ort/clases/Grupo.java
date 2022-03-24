package ar.edu.ort.clases;

import java.util.ArrayList;

public class Grupo {
    private String nombreGrupo;
    private ArrayList<String> integrantes;

    public Grupo(String nombreGrupo) {
        setNombre(nombreGrupo);
        integrantes = new ArrayList<String>();
    }

    public String getNombre() {
        return nombreGrupo;
    }

    private void setNombre(String nombreGrupo) {
        if (!nombreGrupo.isEmpty() && nombreGrupo != null) {
            this.nombreGrupo = nombreGrupo;
        }
    }

    public int getCantidadIntegrantes() {
        return integrantes.size();
    }

    public void agregarIntegrante(String nombreIntegrante) {
        String integranteBuscado = buscarIntegrante(nombreIntegrante);

        if (integranteBuscado == null) {
            integrantes.add(nombreIntegrante);
            System.out.println(nombreIntegrante + " fue agregado al Grupo " + nombreGrupo);
        }
    }

    public String comprobarIntegrante(String nombre) {
        String integranteBuscado = buscarIntegrante(nombre);
        String resultado = "";

        if (integranteBuscado != null) {
            resultado = integranteBuscado + " ya existia en el Grupo " + nombreGrupo;
        } else {
            resultado = nombre + " no existe en el Grupo " + nombreGrupo;
        }

        return resultado;
    }

    private int obtenerPosicionIntegrante(String nombreIntegrante) {
        int resultado = -1;
        int i = 0;

        while (i < integrantes.size() && resultado == -1) {
            if (integrantes.get(i).equals(nombreIntegrante)) {
                resultado = i;
            } else {
                i++;
            }
        }

        return resultado;
    }

    public String obtenerIntegrante(int posicion) {
        return (posicion >= 1) ? integrantes.get(posicion - 1) : null;
    }

    public String buscarIntegrante(String nombre) {
        String elementoBuscado = null;
        int i = 0, cantElementos = integrantes.size();

        while (i < cantElementos && elementoBuscado == null) {
            if (integrantes.get(i).equals(nombre)) {
                elementoBuscado = integrantes.get(i);
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    public String removerIntegrante(String nombreIntegrante) {
        String integranteEliminado = null;
        int integranteBuscado = obtenerPosicionIntegrante(nombreIntegrante);

        if (integranteBuscado != -1) {
            integranteEliminado = integrantes.remove(integranteBuscado);
        }

        return integranteEliminado;
    }

    private void mostrarIntegrante() {
        System.out.println("*** Cantidad de integrantes del grupo: " + integrantes.size() + " ***");
        for (String integrante : integrantes) {
            System.out.println(integrante);
        }
    }

    public void mostrar() {
        System.out.println("*** Nombre del Grupo: " + nombreGrupo + " ***");
        mostrarIntegrante();
    }

    public void vaciar() {
        integrantes.clear();
    }

}
