package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/18/2022 | 6:33 PM
 */
public class Clave4 {
    public static final int CUATRO_ACIERTOS = 4;
    private String acertijo;
    private int contBuenos = 0;
    private int contRegulares = 0;

    public Clave4() {
        this.acertijo = "5241";
    }

    public boolean procesar(String ingresoUser) {
        boolean acerto = false;
        resetContadores();
        Resultado resultado = ingresoValido(ingresoUser);
        if (resultado != null && resultado.getBuenos() == CUATRO_ACIERTOS) {
            System.out.printf("%s\t\t\t%d Buenos,%d Regulares,%d Malos, Gano!!\n", ingresoUser, resultado.getBuenos(), resultado.getRegulares(), resultado.getMalos());
            acerto = true;
        } else if (resultado != null && resultado.getBuenos() != CUATRO_ACIERTOS) {
            System.out.printf("%s\t\t\t%d buenos,%d regulares,%d malos\n", ingresoUser, resultado.getBuenos(), resultado.getRegulares(), resultado.getMalos());
        } else {
            System.out.println("El valor ingresado es invalido");
        }
        return acerto;
    }

    private void resetContadores() {
        this.contBuenos = 0;
        this.contRegulares = 0;
    }

    private Resultado ingresoValido(String ingresoUser) {
        Resultado resultado = null;
        boolean valido = true;
        int i = 0;
        if (ingresoUser.length() == acertijo.length()) {
            while (i < acertijo.length() && valido) {
                if (!Character.isDigit(ingresoUser.charAt(i))) {
                    valido = false;
                }
                i++;
            }
            if (valido) {
                resultado = new Resultado(coincidenciaTotal(ingresoUser), coincidenciaParcial(ingresoUser));
            }
        }
        return resultado;
    }

    private int coincidenciaParcial(String ingresoUser) {
        for (int i = 0; i < acertijo.length(); i++) {
            if (ingresoUser.charAt(i) != acertijo.charAt(i)) {
                if (buscarNumero(ingresoUser.charAt(i))) {
                    contRegulares++;
                }
            }
        }
        return contRegulares;
    }

    private boolean buscarNumero(char caracter) {
        int i = 0, cantidadElementos = acertijo.length();
        boolean elementoBuscado = false;

        while (i < cantidadElementos && !elementoBuscado) {
            if (caracter == acertijo.charAt(i)) {
                elementoBuscado = true;
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    private int coincidenciaTotal(String ingresoUser) {
        for (int i = 0; i < acertijo.length(); i++) {
            if (ingresoUser.charAt(i) == acertijo.charAt(i)) {
                contBuenos++;
            }
        }
        return contBuenos;
    }


}
