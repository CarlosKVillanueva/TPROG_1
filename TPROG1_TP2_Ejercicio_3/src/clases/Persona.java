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
        this.emails = new ArrayList<Email>();
        this.telefonos = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.hitos = new ArrayList<>();
    }

    public boolean agregar(Object o) {
    	boolean eliminado = false;
    	if(o != null) {	
	        if (o instanceof NumeroTelefonico) {
	            eliminado = telefonos.add((NumeroTelefonico) o);
	        } else if (o instanceof Email) {
	            eliminado = emails.add((Email) o);
	        } else if (o instanceof Mascota) {
	            eliminado = mascotas.add((Mascota) o);
	        } else if (o instanceof Hito) {
	            eliminado = hitos.add((Hito) o);
	        }
    	}
        return eliminado;
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
