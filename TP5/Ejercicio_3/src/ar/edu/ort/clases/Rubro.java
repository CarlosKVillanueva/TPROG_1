package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/12/2022 | 11:36 AM
 */
public class Rubro {
    private final int TOTAL_MESES = Mes.values().length;
    private String nombre;
    private double gastosPorMes[];

    public Rubro(String nombre) {
        this.nombre = nombre;
        inicializarGastos();
    }

    private void inicializarGastos() {
        gastosPorMes = new double[TOTAL_MESES];
    }

    public void agregarGastos(Mes mes, double importe) {
        gastosPorMes[mes.ordinal()] += importe;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotalGastos(Mes mes) {
        return gastosPorMes[mes.ordinal()];
    }

    public boolean mismoRubro(String nombreRubro) {
        return this.nombre.equals(nombreRubro);
    }

    public double getGastoAcumulado() {
        double acum = 0;
        for (int i = 0; i < gastosPorMes.length; i++) {
            acum += getTotalGastos(Mes.values()[i]);
        }
        return acum;
    }


}
