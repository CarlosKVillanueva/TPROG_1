import java.util.Arrays;

/**
 * Busqueda @author AMicovillovich implemented by CKVillanueva BetaTested by FAliverti el 5/20/2022 | 9:16 AM
 */
public class MainBusqueda {

    public static void main(String[] args) {

        int[][] numeros2 = new int[17][15];
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

        int  ingreso = 224;

        int posCol = ((ingreso % numeros2[0].length) == 0) ? (numeros2[0].length -1) : ((ingreso % numeros2[0].length) - 1);
        int posFila = ((ingreso % numeros2[0].length) == 0) ? (ingreso / numeros2[0].length) - 1 : ingreso / numeros2[0].length;

        System.out.println(posCol);
        System.out.println(posFila);

    }


}
