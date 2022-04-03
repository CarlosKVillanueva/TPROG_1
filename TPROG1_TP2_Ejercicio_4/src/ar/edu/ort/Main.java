package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Arturo", "Roman", 53);
        Persona persona1 = new Persona("Monica", "Gaztambide", 10);
        Mueble mueble1 = new Mueble("Mesa", "Madera", "Marron");
        Mueble mueble2 = new Mueble("Mesa", "Marmol", "Rojo");
        Mueble mueble3 = new Mueble("Perchero", "Metal", "Negro");
        Mueble mueble4 = new Mueble("Sillon", "Cuero", "Azul");
        Vivienda original = new Vivienda(new Direccion("Montañeses","1234","4", "C"));
        Vivienda nueva = new Vivienda(new Direccion("Montañeses","1234","2", "B"));

        original.agregarPersona(persona);
        original.agregarPersona(persona1);
        original.agregarMueble(mueble1);
        original.agregarMueble(mueble2);
        original.agregarMueble(mueble3);
        original.agregarMueble(mueble4);
//        original.mostrarDatos();

        Edificio edificio = new Edificio();

        edificio.agregarVivienda(original);
        edificio.agregarVivienda(nueva);

        edificio.realizarMudanza("4", "C", "2", "B");
    }
}
