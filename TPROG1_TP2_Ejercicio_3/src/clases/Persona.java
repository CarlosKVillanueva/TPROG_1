package clases;

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

    public boolean agregar(Object o) {
        boolean agregado = false;
        if (o != null) {
            if (o instanceof NumeroTelefonico) {
                agregado = telefonos.add((NumeroTelefonico) o);
            } else if (o instanceof Email) {
                agregado = emails.add((Email) o);
            } else if (o instanceof Mascota) {
                agregado = mascotas.add((Mascota) o);
            } else if (o instanceof Hito) {
                agregado = hitos.add((Hito) o);
            }
        }
        return agregado;
    }

    public boolean eliminar(Object o) {
        boolean eliminado = false;
        if (o instanceof NumeroTelefonico) {
            eliminado = telefonos.remove(o);
        } else if (o instanceof Email) {
            eliminado = emails.remove(o);
        } else if (o instanceof Mascota) {
            eliminado = mascotas.remove(o);
        } else if (o instanceof Hito) {
            eliminado = hitos.remove(o);
        }
        return eliminado;
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
