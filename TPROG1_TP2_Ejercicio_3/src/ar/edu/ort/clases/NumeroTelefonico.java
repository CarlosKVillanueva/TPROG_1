package ar.edu.ort.clases;

public class NumeroTelefonico {
    private int codigoDePais;
    private int caracteristica;
    private int numeroDeAbonado;
    private TipoDeLinea tipoDeLinea;

    public NumeroTelefonico() {
    }

    public NumeroTelefonico(int codigoDePais, int caracteristica, int numeroDeAbonado, TipoDeLinea tipoDeLinea) {
        this.caracteristica = caracteristica;
        this.numeroDeAbonado = numeroDeAbonado;
        this.codigoDePais = codigoDePais;
        this.tipoDeLinea = tipoDeLinea;
    }

    public String getValor() {
        String cod = String.format("%03d", codigoDePais);
        String car = String.format("%04d", caracteristica);
        String num = String.format("%04d", numeroDeAbonado);

        return String.format("(+%3.3s)%4.4s-%4.4s\n", cod, car, num);

    }

    public void mostrarTodo() {

        System.out.printf(this.tipoDeLinea + ": " + getValor());
    }

    @Override
    public String toString() {
        return "NumeroTelefonico [caracteristica=" + caracteristica + ", codigoDePais=" + codigoDePais
                + ", numeroDeAbonado=" + numeroDeAbonado + ", tipoDeLinea=" + tipoDeLinea + "]";
    }

}
