package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Ejercicio_3 @author CKVillanueva el 5/12/2022 | 11:12 AM
 */
public class GastosAnuales {
    public static final int CANT_MESES = Mes.values().length;
    private ArrayList<Rubro> rubros;
    double[] acumAnual = new double[CANT_MESES];

    public GastosAnuales() {
        rubros = new ArrayList<>();
    }

    public void agregarGasto(Mes mes, String nombreRubro, double importe) {
        if (importe > 0) {
            Rubro rubro = obtenerRubro(nombreRubro);
            rubro.agregarGastos(mes,importe);
        }
    }

    private Rubro obtenerRubro(String nombreRubro) {
        Rubro r = buscarRubro(nombreRubro);
        if (r == null) {
            r = new Rubro(nombreRubro);
            rubros.add(r);
        }
        return r;
    }

    private Rubro buscarRubro(String nombreRubro) {
        int i = 0, cantidadRubros = rubros.size();
        Rubro rubroBuscado = null;

        while (i < cantidadRubros && rubroBuscado == null) {
            Rubro elemento = rubros.get(i);
            if (elemento.mismoRubro(nombreRubro)) {
                rubroBuscado = elemento;
            } else {
                i++;
            }
        }
        return rubroBuscado;
    }

    public double[][] consolidadoDeGastos() {
        double[][] gastos = new double[CANT_MESES][rubros.size()];
        for (int mes = 0; mes < Mes.values().length; mes++) {
            for (int rubro = 0; rubro < rubros.size(); rubro++) {
                gastos[mes][rubro] = rubros.get(rubro).getTotalGastos(Mes.values()[mes]);
            }
        }
        return gastos;
    }

    public double gastoAcumulado(Mes mes) {
        //TODO FIX
        double gasto = 0;
        for (Rubro rubro : rubros) {
            gasto += rubro.getTotalGastos(mes);
        }
        return gasto;
    }

    public double gastoAcumulado(String nombreRubro) {
        double importe = -1;
        Rubro rubro = buscarRubro(nombreRubro);

        if (rubro != null) {
            importe = rubro.getGastoAcumulado();
        }
        return importe;
    }

    public void informarConsumosPorMes() {

        for (int mes = 0; mes < Mes.values().length; mes++) {
        double acumMensual = 0;
            for (int rubro = 0; rubro < rubros.size(); rubro++) {
                double gastoDiscriminado = rubros.get(rubro).getTotalGastos(Mes.values()[mes]);
                System.out.printf("%s $%.2f\n", rubros.get(rubro).getNombre(), gastoDiscriminado);
                acumMensual += gastoDiscriminado;

            }
            acumAnual[mes] = acumMensual;
            System.out.printf("Acumulado %s $%.2f\n", Mes.values()[mes],acumMensual);
            System.out.println("-------------------------");
        }
    }

    public void informarPromedioMensualPorRubro() {
        for (int rubro = 0; rubro < rubros.size(); rubro++) {
        double promedioGastoXRubro = 0;
            String nombre = rubros.get(rubro).getNombre();
            for (int mes = 0; mes < Mes.values().length; mes++) {
                promedioGastoXRubro += rubros.get(rubro).getTotalGastos(Mes.values()[mes]);
            }
            System.out.printf("%s $%.2f\n", nombre, promedioGastoXRubro / CANT_MESES);
        }
    }

    public void informarMesMayorConsumo() {
        double mayor = Double.MIN_VALUE;
        ArrayList<Informe> mesesMayorConsumo = new ArrayList<>();

        for (int i = 0; i < acumAnual.length; i++) {
                if (acumAnual[i] > mayor) {
                    mesesMayorConsumo.clear();
                    mayor = acumAnual[i];
                    mesesMayorConsumo.add(new Informe(Mes.values()[i].toString(),mayor));
                } else if (acumAnual[i] == mayor) {
                    mesesMayorConsumo.add(new Informe(Mes.values()[i].toString(),mayor));
                }
            }
        System.out.printf("%s",mesesMayorConsumo);
        }

}
