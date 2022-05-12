package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/12/2022 | 11:16 AM
 */
public enum Mes {
    ENERO(31,0),
    FEBRERO(28,31),
    MARZO(31,59),
    ABRIL(30,90),
    MAYO(31,120),
    JUNIO(30,151),
    JULIO(31,181),
    AGOSTO(31,212),
    SEPTIEMBRE(30,243),
    OCTUBRE(30,273),
    NOVIEMBRE(30,304),
    DICIEMBRE(31,334);

    private int dias;
    private int diasAcum;

    Mes(int dias,int diasAcum) {
        this.dias = dias;
        this.diasAcum = diasAcum;
    }

    public int getDias() {
        return dias;
    }

    public int getDiasAcum() {
        return diasAcum;
    }
}
