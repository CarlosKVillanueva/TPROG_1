package ar.edu.ort;

import ar.edu.ort.clases.*;
import java.util.Arrays;

/**
 * Ejercicio_3 @author CKVillanueva el 5/12/2022 | 11:12 AM
 */
public class Main_Ejercicio_3 {
    public static void main(String[] args) {
        GastosAnuales ga = new GastosAnuales();

        agregarGastosAMeses(ga);

        System.out.println(Arrays.deepToString(ga.consolidadoDeGastos()));
        System.out.println(ga.gastoAcumulado(Mes.ABRIL));
        System.out.println(ga.gastoAcumulado("Comida"));
        System.out.println();
        System.out.println("*** Consumos Mensuales ***");
        ga.informarConsumosPorMes();
        ga.informarPromedioMensualPorRubro();
        ga.informarMesMayorConsumo();


    }

    private static void agregarGastosAMeses(GastosAnuales ga) {
        ga.agregarGasto(Mes.ENERO, "Comida", 10000);
        ga.agregarGasto(Mes.ENERO, "Comida", 18000);
        ga.agregarGasto(Mes.ENERO, "Bedida", 4000);
        ga.agregarGasto(Mes.ENERO, "Servicios", 8000);

        ga.agregarGasto(Mes.FEBRERO, "Comida", 10000);
        ga.agregarGasto(Mes.FEBRERO, "Comida", 18000);
        ga.agregarGasto(Mes.FEBRERO, "Bedida", 4000);
        ga.agregarGasto(Mes.FEBRERO, "Servicios", 8000);

        ga.agregarGasto(Mes.MARZO, "Comida", 10000);
        ga.agregarGasto(Mes.MARZO, "Bedida", 4000);
        ga.agregarGasto(Mes.MARZO, "Servicios", 8000);

        ga.agregarGasto(Mes.ABRIL, "Comida", 10000);
        ga.agregarGasto(Mes.ABRIL, "Bedida", 4000);
        ga.agregarGasto(Mes.ABRIL, "Servicios", 8000);
        ga.agregarGasto(Mes.ABRIL, "Cumple", 10180);

        ga.agregarGasto(Mes.MAYO, "Comida", 10000);
        ga.agregarGasto(Mes.MAYO, "Bedida", 4000);
        ga.agregarGasto(Mes.MAYO, "Servicios", 8000);

        ga.agregarGasto(Mes.JUNIO, "Comida", 10000);
        ga.agregarGasto(Mes.JUNIO, "Bedida", 4000);
        ga.agregarGasto(Mes.JUNIO, "Servicios", 8000);

        ga.agregarGasto(Mes.JULIO, "Comida", 10000);
        ga.agregarGasto(Mes.JULIO, "Bedida", 4000);
        ga.agregarGasto(Mes.JULIO, "Servicios", 8000);

        ga.agregarGasto(Mes.AGOSTO, "Comida", 10000);
        ga.agregarGasto(Mes.AGOSTO, "Bedida", 40000);
        ga.agregarGasto(Mes.AGOSTO, "Servicios", 8000);

        ga.agregarGasto(Mes.SEPTIEMBRE, "Comida", 10000);
        ga.agregarGasto(Mes.SEPTIEMBRE, "Bedida", 4000);
        ga.agregarGasto(Mes.SEPTIEMBRE, "Servicios", 8000);

        ga.agregarGasto(Mes.OCTUBRE, "Comida", 20000);
        ga.agregarGasto(Mes.OCTUBRE, "Bedida", 24000);
        ga.agregarGasto(Mes.OCTUBRE, "Servicios", 8000);

        ga.agregarGasto(Mes.NOVIEMBRE, "Comida", 20000);
        ga.agregarGasto(Mes.NOVIEMBRE, "Bedida", 24000);
        ga.agregarGasto(Mes.NOVIEMBRE, "Servicios", 8000);

        ga.agregarGasto(Mes.DICIEMBRE, "Comida", 10000);
        ga.agregarGasto(Mes.DICIEMBRE, "Bedida", 4000);
        ga.agregarGasto(Mes.DICIEMBRE, "Servicios", 8000);

    }
}