package ar.edu.ort.clases;

public abstract class Empleado {
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

    public abstract float calcularPago();

    @Override
    public String toString(){
        return getClass().getSimpleName()  + " " + this.nombre + " gana: $" +  calcularPago();
    }
}
