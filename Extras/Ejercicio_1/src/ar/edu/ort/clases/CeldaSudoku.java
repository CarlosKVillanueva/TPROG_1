package ar.edu.ort.clases;

/**
 * Ejercicio_1 @author CKVillanueva el 5/18/2022 | 9:49 AM
 */
public class CeldaSudoku {
    public static final int TAMANIO_CELDA = 3;
    private int[][] celdas;

    public CeldaSudoku() {
        celdas = new int[TAMANIO_CELDA][TAMANIO_CELDA];
    }

    public boolean agregarValor(int fila, int col, int valor) {
        int numeroBuscado = buscarNumero(valor);
        boolean agregado = false;

        if (indiceValido(fila) && indiceValido(col)) {
            if (esValido(valor ) && numeroBuscado == -1) {
                celdas[fila][col] = valor;
                agregado = true;
            }
        }
        return agregado;
    }

    private boolean indiceValido(int fila) {
        return fila >= 0 && fila < TAMANIO_CELDA;
    }

    private boolean esValido(int valor) {
        return valor > 0 && valor < 10;
    }

    public void mostrar() {
        for (int fila = 0; fila < celdas.length ; fila++) {
            for (int col = 0; col < celdas[0].length; col++) {
                System.out.println(celdas[fila][col]);
            }
        }
    }


    private int buscarNumero(int valor) {
        int fila = 0, col = 0, lengthFila = celdas.length, lengthCol = celdas[0].length;
        int elementoBuscado = -1;

        while (fila < lengthFila && elementoBuscado == -1) {
            while (col < lengthCol && elementoBuscado == -1) {
                int elemento = celdas[fila][col];
                if (elemento == valor) {
                    elementoBuscado = elemento;
                } else {
                    fila++;
                    col++;
                }
            }
        }
        return elementoBuscado;
    }
}
