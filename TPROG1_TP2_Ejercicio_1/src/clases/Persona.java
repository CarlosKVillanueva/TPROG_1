package clases;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<NumeroTelefonico> telefonos;
    private ArrayList<Email> emails;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.emails = new ArrayList<>();
        this.telefonos = new ArrayList<>();
    }

    public void agregarTelefono(NumeroTelefonico numero) {
        telefonos.add(numero);
    }

    public void agregarEmail(Email mail) {
        emails.add(mail);
    }

    public void mostrarTodo() {
        System.out.println(apellido + ", " + nombre);
        System.out.println("Telefonos");
        for (NumeroTelefonico numero : telefonos) {
            numero.mostrarTodo();
        }
        for (Email email : emails) {
            email.mostrarTodo();
        }
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", emails=" + emails + ", nombre=" + nombre + ", telefonos="
                + telefonos + "]";
    }

}
