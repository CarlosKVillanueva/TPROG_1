
package ar.edu.ort.entidades;



public interface Mostrable {

    String FORMATO_ENCABEZADO_CONSOLA = "%9s %20s %17s %18s %25s\n";
    String FORMATO_PRECIO_RENGLON_CONSOLA = "%9s ";
    String FORMATO_RENGLON_CONSOLA = "%20s %17s %18.2f %25s\n";

    void mostrar();
}
