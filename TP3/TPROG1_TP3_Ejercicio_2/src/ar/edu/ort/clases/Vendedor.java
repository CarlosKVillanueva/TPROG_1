package ar.edu.ort.clases;

public class Vendedor extends SubContratado{
    private float porcentaje;
    private int id = 0;
    private static int contadorID = 0;

    public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
        super(nombre, edad, cantHoras, precioHora);
        this.porcentaje = porcentaje;
        this.id = ++Vendedor.contadorID;
    }


    @Override
    public float calcularPago() {
        return super.calcularPago() * porcentaje;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()  + " " + this.id + " " + super.getNombre() + " gana: $" +  calcularPago();
    }
}
