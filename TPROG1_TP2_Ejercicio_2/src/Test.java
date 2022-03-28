import clases.*;

public class Test {
    public static void main(String[] args) {
        NumeroTelefonico celular = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
        NumeroTelefonico celular1 = new NumeroTelefonico(549, 114111, 3333, TipoDeLinea.CELULAR);
        NumeroTelefonico fijo = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.FIJO);
        NumeroTelefonico fax = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FAX);
        Mascota hulk = new Mascota("Hulk", "Perro");
        Mascota thor = new Mascota("Thor", "Gato");
        Mascota caps = new Mascota("Caps", "Conejo");
        Email email = new Email("lio@messi.com");
        Persona messi = new Persona("Lionel", "Messi");

        messi.agregar(celular);
        messi.agregar(celular1);
        messi.agregar(fijo);
        messi.agregar(fax);
        messi.agregar(email);
        messi.agregar(hulk);
        messi.agregar(thor);
        messi.agregar(caps);

        messi.mostrarTodo();
    }
}
