package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/23/2022 | 4:45 PM
 */
public class MaquinaExpendedora {
    private static final int MAXIMO_GOLOSINA = 5;
    String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
            };
    double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
    };
    int[][] cantidad;
    int fila;
    int col;

    public MaquinaExpendedora() {
        this.cantidad = new int[4][4];
        llenarMaquina();
    }

    private void llenarMaquina() {
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad[0].length; j++) {
                cantidad[i][j] = MAXIMO_GOLOSINA;
            }
        }
    }

    public void pedirGolosina(String ingresoUser) {
        if (ingresoTeclado(ingresoUser)) {
            if (cantidad[fila][col] > 0) {
                entregarGolosina(fila, col);
            } else
                System.out.printf("%s fuera de Stock\n", nombresGolosinas[fila][col]);
        } else
            System.out.println("Los datos ingresados son invalidos\n");
    }

    private boolean ingresoTeclado(String ingresoUser) {
        int ingreso = Integer.parseInt(ingresoUser);
        return ingresoValido(ingreso / 10, ingreso % 10);
    }

    private void entregarGolosina(int fila, int col) {
        System.out.printf("Recoja su %s de la bandeja\n", nombresGolosinas[fila][col]);
        cantidad[fila][col]--;
    }

    private boolean ingresoValido(int f, int c) {
        boolean valido = f >= 0 && f < 4 && c >= 0 && c < 4;
        if (valido) {
            this.fila = f;
            this.col = c;
        }
        return valido;
    }

    public void mostrarGolosinas() {
        for (int fila = 0; fila < nombresGolosinas.length; fila++) {
            for (int col = 0; col < nombresGolosinas[fila].length; col++) {
                System.out.printf("Posicion: %d%d \t Nombre: %s \t Precio: $%.2f\n", fila, col, nombresGolosinas[fila][col], precio[fila][col]);
            }
        }
    }

    public boolean verificarTecnico(String password) {
        return password.equals("MaquinaExpendedora2017");
    }

    public void rellenarMaquina(String ingresoTecnico, int cantAIngresar) {
        ingresoTeclado(ingresoTecnico);
        if (cantAIngresar <= (MAXIMO_GOLOSINA - cantidad[fila][col])) {
            cantidad[fila][col] += cantAIngresar;
            System.out.println("Recarga Exitosa");
        } else
            System.out.println("Recarga Fallida");
    }

    public void apagarMaquina() {
        double acumVentas = 0;

        for (int fila = 0; fila < cantidad.length; fila++) {
            for (int col = 0; col < cantidad[fila].length; col++) {
                int vendidas = 0;
                vendidas = MAXIMO_GOLOSINA - cantidad[fila][col];
                acumVentas += (vendidas * precio[fila][col]);
            }
        }
        System.out.printf("El total acumulado es de $%.2f", acumVentas);
    }
}
