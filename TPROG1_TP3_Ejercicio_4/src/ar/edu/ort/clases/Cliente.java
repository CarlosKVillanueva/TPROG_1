package ar.edu.ort.clases;

public class Cliente {
    private String cuil;
    private String apenom;

    public Cliente(String cuil, String apenom) {
        this.cuil = cuil;
        this.apenom = apenom;
    }

    public String getCuil() {
        return cuil;
    }

    public String getApenom() {
        return apenom;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cuil='" + cuil + '\'' +
                ", apenom='" + apenom + '\'' +
                '}';
    }
}
