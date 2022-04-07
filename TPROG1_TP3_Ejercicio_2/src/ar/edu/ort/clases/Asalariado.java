package ar.edu.ort.clases;

public class Asalariado extends Empleado {
    private float sueldo;

    public Asalariado(String nombre, int edad, float sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    @Override
    public float calcularPago() {
        return sueldo;
    }

}
