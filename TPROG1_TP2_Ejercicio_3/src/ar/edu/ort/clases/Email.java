package ar.edu.ort.clases;

public class Email {
    private String cuenta;
    private String dominio;
    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getValor() {
        String[] mail;
        mail = email.split("@");

        this.cuenta = mail[0];
        this.dominio = mail[1];

        return cuenta + "@" + dominio;
    }

    public void mostrarTodo() {
        System.out.println("Email: " + getValor());
    }
}
