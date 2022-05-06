package ar.edu.ort.main;

import ar.edu.ort.clases.Grupo;

public class Test {
    public static void main(String[] args) {
        Grupo tt = new Grupo("TT");

        tt.agregarIntegrante("Antonella");
        tt.agregarIntegrante("Facundo");
        tt.agregarIntegrante("Romulo");
        tt.agregarIntegrante("Remo");
        tt.agregarIntegrante("Kaio");
        /* ---------------- REMOVER INTEGRANTES --------------- */
        System.out.println("---------------- COMPROBAR INTEGRANTES ---------------");
        System.out.println(tt.comprobarIntegrante("Kaio"));
        System.out.println(tt.comprobarIntegrante("Pedro"));
        System.out.println("---------------- LISTAR INTEGRANTES ---------------");
        tt.mostrar();
        System.out.println("---------------- OBTENER INTEGRANTES ---------------");
        System.out.println(tt.obtenerIntegrante(1));
        System.out.println("---------------- REMOVER INTEGRANTES ---------------");
        System.out.println(tt.removerIntegrante("Remo"));
        System.out.println(tt.removerIntegrante("Romulo"));
        tt.mostrar();
        System.out.println("---------------- RE-REMOVER INTEGRANTES ---------------");
        System.out.println(tt.removerIntegrante("Romulo"));
        tt.mostrar();
        System.out.println("---------------- VACIAR LISTA ---------------");
        tt.vaciar();
        tt.mostrar();
    }

}
