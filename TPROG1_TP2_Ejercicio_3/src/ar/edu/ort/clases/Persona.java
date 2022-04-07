package ar.edu.ort.clases;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<NumeroTelefonico> telefonos;
    private ArrayList<Email> emails;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Hito> hitos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.emails = new ArrayList<>();
        this.telefonos = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.hitos = new ArrayList<>();
    }
    public boolean agregarTelefono(NumeroTelefonico t) {
        boolean retorno = false;
        if (t != null) {
            retorno = telefonos.add(t);
        }
        return retorno;
    }
    public boolean agregarEmail(Email e) {
        boolean retorno = false;
        if (e != null) {
            retorno = emails.add(e);
        }
        return retorno;
    }
    public boolean agregarMascota(Mascota m) {
        boolean retorno = false;
        if (m != null) {
            retorno = mascotas.add(m);
        }
        return retorno;
    }
    public boolean agregarHito(Hito h) {
        boolean retorno = false;
        if (h != null) {
            retorno = hitos.add(h);
        }
        return retorno;
    }

    public boolean removerTelefono(NumeroTelefonico t) {
        boolean retorno = false;
        if (t != null) {
            retorno = telefonos.remove(t);
        }
        return retorno;
    }
    public boolean removerEmail(Email e) {
        boolean retorno = false;
        if (e != null) {
            retorno = emails.remove(e);
        }
        return retorno;
    }
    public boolean removerMascota(Mascota m) {
        boolean retorno = false;
        if (m != null) {
            retorno = mascotas.remove(m);
        }
        return retorno;
    }
    public boolean removerHito(Hito h) {
        boolean retorno = false;
        if (h != null) {
            retorno = hitos.remove(h);
        }
        return retorno;
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
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        for (Hito hito : hitos) {
            hito.mostrar();
        }

    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", emails=" + emails + ", nombre=" + nombre + ", telefonos="
                + telefonos + "]";
    }

}
