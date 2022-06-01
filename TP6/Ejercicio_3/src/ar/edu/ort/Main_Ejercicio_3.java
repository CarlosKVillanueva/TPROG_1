package ar.edu.ort;

/**
 * Ejercicio_3@author CKVillanueva el 29/05/2022 | 18:01
 */
public class Main_Ejercicio_3 {
    private static ar.edu.ort.tp1.tp6Ej3.clases.Saludador saludador;

    public static void main(String[] args) {
        saludador = new ar.edu.ort.tp1.tp6Ej3.clases.Saludador("ES");
        saludador.run();

        cambiarIdiomaYEjecutar("EN");
        cambiarIdiomaYEjecutar("FR");
    }

    private static void cambiarIdiomaYEjecutar(String idioma) {
        try {
            saludador.elegirIdioma(idioma);
            saludador.run();
        } catch (RuntimeException re) {
            System.out.println("Upss... hubo un error:");
            System.out.println(re.getMessage());
        }
    }
}
