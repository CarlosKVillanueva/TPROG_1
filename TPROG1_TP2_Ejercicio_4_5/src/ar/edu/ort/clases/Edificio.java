package ar.edu.ort.clases;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Vivienda> viviendas;

    public Edificio() {
        this.viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda vivienda){
        if (vivienda != null) {
            viviendas.add(vivienda);
        }
    }

    public void realizarMudanza(String pisoOrigen, String deptOrigen, String pisoDest, String deptDest){
        Vivienda original = buscarVivienda(pisoOrigen, deptOrigen);
        if (original != null) {
            original.mostrarDatos();
            Vivienda nueva = buscarVivienda(pisoDest, deptDest);
            System.out.printf("SE HA REALIZADO LA MUDANZA DE %s A %s\n", original.mostrarDpto(), nueva.mostrarDpto());
            mudanzaPersonas(original, nueva);
            mudanzaMuebles(original, nueva);
            nueva.mostrarDatos();
        }
    }

    private void mudanzaPersonas(Vivienda original, Vivienda nueva) {
        ArrayList<Persona> personasMudanza = new ArrayList<>();
        personasMudanza = original.getPersonas();
        nueva.mudar(personasMudanza);
        original.desalojar();
        personasMudanza.clear();
    }

    private void mudanzaMuebles(Vivienda original, Vivienda nueva) {
        ArrayList<Mueble> mueblesMudanza = new ArrayList<>();
        mueblesMudanza = original.getMuebles();
        nueva.mudarMuebles(mueblesMudanza);
        original.desequipar();
        mueblesMudanza.clear();
    }

    private Vivienda buscarVivienda(String pisoOrigen,String deptOrigen) {
        Vivienda elementoBuscado = null;
        int i = 0, cantElementos = viviendas.size();

        while (i < cantElementos && elementoBuscado == null) {
            if (viviendas.get(i).mismaVivienda(pisoOrigen,deptOrigen)) {
                elementoBuscado = viviendas.get(i);
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }
}
