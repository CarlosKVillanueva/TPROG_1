package ar.edu.ort.clases;

import java.util.ArrayList;

public class Vivienda {
    private Direccion direccion;
    private ArrayList<Persona> personas;
    private ArrayList<Mueble> muebles;

    public Vivienda(Direccion direccion) {
        this.direccion = direccion;
        personas = new ArrayList<>();
        muebles = new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        if (persona != null) {
            personas.add(persona);
        }
    }public void agregarMueble(Mueble mueble){
        if (mueble != null) {
            muebles.add(mueble);
        }
    }


    public void mostrarDatos() {
        System.out.printf("Vivienda: %s\n", direccion);
        System.out.println("Personas:");
        for (Persona persona : personas) {
            System.out.print(persona);
        }
        System.out.println("Muebles:");
        for (Mueble mueble : muebles) {
            System.out.print(mueble);
        }

    }

    public String mostrarDpto(){
        return direccion.mostrarDpto();
    }
    public boolean mismaVivienda(String pisoOrigen, String deptOrigen) {
        return direccion.mismaVivienda(pisoOrigen, deptOrigen);
    }

    public void mudar(ArrayList<Persona> personasMudanza) {
        personas.addAll(personasMudanza);
    }

    public ArrayList<Persona> getPersonas() {
        return this.personas;
    }

    public void desalojar() {
        personas.clear();
    }

    public ArrayList<Mueble> getMuebles() {
        return this.muebles;
    }

    public void mudarMuebles(ArrayList<Mueble> mueblesMudanza) {
        muebles.addAll(mueblesMudanza);
    }

    public void desequipar() {
        muebles.clear();
    }
}
