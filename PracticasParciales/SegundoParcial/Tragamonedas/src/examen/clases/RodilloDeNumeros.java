package examen.clases;

import java.util.Arrays;
import java.util.Random;
import tp1.u5.tad.Cola;
import tp1.u5.tad.implementaciones.nodo.ColaNodos;

/**
 * Tragamonedas@author CKVillanueva el 6/9/2022 | 12:53 PM
 */
public class RodilloDeNumeros implements Rodillo<Integer>{
    private static final int CARAS_MINIMAS = 3;
    private Cola<Integer> valores;
    private int lados;

    public RodilloDeNumeros(int lados) {
        setLados(lados);
        inicializar();
    }

    private void setLados(int lados) {
        if (lados < CARAS_MINIMAS) {
            throw new IllegalArgumentException("Cantidad de Caras invalido");
        }
        this.lados = lados;
    }

    @Override
    public void inicializar() {
        valores = new ColaNodos<>();
        llenarCola();
    }

    private void llenarCola() {
        for (int i = 0; i < lados; i++) {
            valores.add(i + 1);
        }
    }

    @Override
    public void rodar() {
        int nroRand = new Random().nextInt(1, lados);
        for (int i = 0; i < nroRand; i++) {
            cambiarCara();
        }
    }

    private void cambiarCara() {
        valores.add(valores.remove());
    }

    @Override
    public Integer obtenerActual() {
        return valores.get();
    }

    public void mostrar() {
        valores.add(null);
        Integer valor = valores.remove();
        int[] resultado = new int[lados];
        int i = 0;

        while (valor != null) {
            resultado[i] = valor;
            i++;
            valores.add(valor);
            valor = valores.remove();
        }
        System.out.println(Arrays.toString(resultado));

    }
}
