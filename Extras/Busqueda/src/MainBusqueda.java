import java.util.Arrays;

/**
 * Busqueda @author AMicovillovich implemented by CKVillanueva BetaTested by FAliverti el 5/20/2022 | 9:16 AM
 */
public class MainBusqueda {

    public static void main(String[] args) {

        int[][] numeros2 = new int[17][15];
        int inicio = 1;
        int tamanioMatriz = numeros2[0].length;
        for (int fila = 0; fila < numeros2.length; fila++) {
            for (int col = 0; col < tamanioMatriz; col++) {
                numeros2[fila][col] = inicio;
                inicio++;
            }
        }

        for (int col = 0; col < numeros2.length; col++) {
            System.out.println(Arrays.toString(numeros2[col]));
        }

        int  ingreso = 224;

        int posCol = ((ingreso % tamanioMatriz) == 0) ? (tamanioMatriz -1) : ((ingreso % tamanioMatriz) - 1);
        int posFila = ((ingreso % tamanioMatriz) == 0) ? (ingreso / tamanioMatriz) - 1 : ingreso / tamanioMatriz;

        System.out.println(posCol);
        System.out.println(posFila);

    }


}
