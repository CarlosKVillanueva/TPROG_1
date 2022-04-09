package ar.edu.ort;


import ar.edu.ort.clases.*;

import java.util.Scanner;

public class Main {

    private static final int FINALIZAR_COMPRA = 0;
    private static final int MAXIMA_OPCION = 4;

    public static void main(String[] args) {
        CasaElec casa = new CasaElec("OrtNaldo");

        Heladera heladera = new Heladera("Whirpool","H2745", "W123", 220, false, 79999.99, 110, true);
        Televisor televisor =new Televisor("Phillips", "49PGFS", "49FSPG", 220, false, 74999.99, 49, true );
        Lavarropas lavarropas = new Lavarropas("Drean", "Concept", "Concept505", 220, false, 49999.99, 5, Tipo.SEMIAUTOMATICO );
        Licuadora licuadora = new Licuadora("Peabody", "Ultra", "ultrape", 220, false, 8999.99, 4000, 4);

        Scanner input = new Scanner(System.in);

        System.out.print("*** Articulos ***\n");
        System.out.printf("\tOpcion 1: %s\n", heladera.detalleParcial());
        System.out.printf("\tOpcion 2: %s\n", televisor.detalleParcial());
        System.out.printf("\tOpcion 3: %s\n", lavarropas.detalleParcial());
        System.out.printf("\tOpcion 4: %s\n", licuadora.detalleParcial());


        System.out.print("Por favor, seleccione uno de los siguientes productos:\n");
        int opcionCliente = Integer.parseInt(input.next());

        while (validarIngreso(opcionCliente)){
            System.out.print("Opcion Invalida! Por favor, seleccione uno de los siguientes productos:\n");
            opcionCliente = Integer.parseInt(input.next());
        }


        do {
            System.out.print("*** Articulos ***\n");
            System.out.printf("\tOpcion 1: %s\n", heladera.detalleParcial());
            System.out.printf("\tOpcion 2: %s\n", televisor.detalleParcial());
            System.out.printf("\tOpcion 3: %s\n", lavarropas.detalleParcial());
            System.out.printf("\tOpcion 4: %s\n", licuadora.detalleParcial());

            switch (opcionCliente) {
                case 1 -> casa.agregarElectro(heladera);
                case 2 -> casa.agregarElectro(televisor);
                case 3 -> casa.agregarElectro(lavarropas);
                case 4 -> casa.agregarElectro(licuadora);
            }

            System.out.print("Por favor, seleccione uno de los siguientes productos:\n");
            opcionCliente = Integer.parseInt(input.next());

            while (validarIngreso(opcionCliente)){
                System.out.print("Opcion Invalida! Por favor, seleccione uno de los siguientes productos:\n");
                opcionCliente = Integer.parseInt(input.next());
            }
        } while (opcionCliente != FINALIZAR_COMPRA);


        casa.mostrarCompra();


    }

    private static boolean validarIngreso(int opcionCliente) {
        return opcionCliente < FINALIZAR_COMPRA || opcionCliente > MAXIMA_OPCION;
    }
}
