import java.util.Arrays;

/**
 * Busqueda @author CKVillanueva el 5/20/2022 | 9:16 AM
 */
public class MainBusqueda {

    public static void main(String[] args) {

        int[][] numeros = {
                {0, 1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35}

        };

        int[][] numeros2 = new int[8][7];
        int inicio = 1;
        for (int fila = 0; fila < numeros2.length; fila++) {
            for (int col = 0; col < numeros2[0].length; col++) {
                numeros2[fila][col] = inicio;
                inicio++;
            }
        }


        for (int col = 0; col < numeros2.length; col++) {
            System.out.println(Arrays.toString(numeros2[col]));
        }


        double ingreso = 49;

        double posFila = (ingreso - 1) / numeros2.length ;
        double posCol = (ingreso - 1) % numeros2.length > 0 ? ingreso % numeros.length  : (ingreso % numeros2.length) - 1;
        System.out.println("Posicion en la Fila: " + posFila);
        System.out.println("Posicion en la Columna: " + posCol);

    }


}
