package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/12/2022 | 9:25 AM
 */
public class Anio {
    public String getNombreDelMes(int nroMes) {
        return (esMesValido(nroMes)) ? Meses.values()[nroMes - 1].toString() : "No existe ese numero de mes";
    }

    private boolean esMesValido(int mes) {
        return mes > 0 && mes < 13;
    }

    public int diasTranscurridos(int nroMes) {
        int diasTranscurridos = 0;
        if (esMesValido(nroMes)) {
            for (int i = 0; i < nroMes - 1; i++) {
                diasTranscurridos += Meses.values()[i].getDias();
            }
        }
        return diasTranscurridos;
    }

    public int diasTranscurridos2(int nroMes) {
        int diasTranscurridos = 0;
        if (esMesValido(nroMes)) {
            diasTranscurridos = Meses.values()[nroMes-1].getDiasAcum();
        }
        return diasTranscurridos;
    }

    public enum Meses {
        ENERO(31,0), FEBRERO(28,31),
        MARZO(31,59), ABRIL(30,90),
        MAYO(31,120), JUNIO(30,151),
        JULIO(31,181),AGOSTO(31,212),
        SEPTIEMBRE(30,243), OCTUBRE(30,273),
        NOVIEMBRE(30,304),DICIEMBRE(31,334);

        private int dias;
        private int diasAcum;

        Meses(int dias,int diasAcum) {
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
}
