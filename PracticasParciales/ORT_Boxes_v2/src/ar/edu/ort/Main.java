package ar.edu.ort;

import ar.edu.ort.clases.*;

/**
 * ORT_Boxes_v2 @author CKVillanueva el 4/30/2022 | 12:39 PM
 */
public class Main {
    public static void main(String[] args) {

        TallerMecanico miTaller = new TallerMecanico("Ort Boxes");
        agregarServicio(new CambioAceite("Cambio de aceite 1", 100, "AB404AC", 2), miTaller);
        agregarServicio(null, miTaller);
        agregarServicio(new CambioAceite("Cambio de aceite 2", 100, "AUA898", 3), miTaller);
        agregarServicio(new CambioAceite("Cambio de aceite 3", 80, "AC392BC", 1), miTaller);
        agregarServicio(null, miTaller);
        agregarServicio(new Alineacion("Alineacion 1", 20, "HBC343",1, false), miTaller);
        agregarServicio(new Alineacion("Alineacion 2", 20, "IJM444", 2, true), miTaller);
        agregarServicio(new Encendido("Encendido 1", 40, "302012"), miTaller);
        agregarServicio(new Encendido("Encendido 2", 40, "210203"), miTaller);
        miTaller.listarServicios();
    }

    public static void agregarServicio(Servicio servicio, TallerMecanico miTaller) {
        if (miTaller.agregarServicio(servicio)) {
            System.out.println("Se agrego el servicio: " + servicio.getDescripcion());
            servicio.detallarServicio();
        } else {
            System.out.println("No se agrego el servicio");
        }
    }
}
