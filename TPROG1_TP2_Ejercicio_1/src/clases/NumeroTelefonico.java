package clases;

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
        return "(+" + codigoDePais + ")" + caracteristica + "-" + numeroDeAbonado;
    }

    public void mostrarTodo() {
        System.out.println(this.tipoDeLinea + ": " + getValor());
    }

    @Override
    public String toString() {
        return "NumeroTelefonico [caracteristica=" + caracteristica + ", codigoDePais=" + codigoDePais
                + ", numeroDeAbonado=" + numeroDeAbonado + ", tipoDeLinea=" + tipoDeLinea + "]";
    }

}
