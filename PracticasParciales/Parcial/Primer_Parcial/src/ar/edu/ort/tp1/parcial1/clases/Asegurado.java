package ar.edu.ort.tp1.parcial1.clases;

/**
 * TP1-2022-C1-Parcial1-VillanuevaCarlos @author CKVillanueva el 5/10/2022 | 7:18 PM
 */
public class Asegurado{
    private String nombre;
    private String apellido;
    private int edad;
    private Genero genero;
    private String dni;

    public Asegurado(String nombre, String apellido, int edad, Genero genero, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
    }

    public boolean mismoDni(String dni) {
        return this.dni.equals(dni);
    }

    @Override
    public String toString() {
        return "Asegurado [" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", dni='" + dni + '\'' +
                ']';
    }

    public boolean esMasculino() {
        return this.genero == Genero.MASCULINO;
    }

    public int getEdad() {
        return this.edad;
    }
}
