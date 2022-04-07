package ar.edu.ort.clases;

public class Empleado {
    private String nombre;
    private int edad;


    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float calcularPago(){
        return 0.0f;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()  + " " + this.nombre + " gana: $" +  calcularPago();
    }
}
