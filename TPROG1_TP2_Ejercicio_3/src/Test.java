import clases.*;

public class Test {
    public static void main(String[] args) {
        NumeroTelefonico celular = new NumeroTelefonico(54, 4111, 2222, TipoDeLinea.CELULAR);
        NumeroTelefonico celular1 = new NumeroTelefonico(54, 4111, 333311111, TipoDeLinea.CELULAR);
        NumeroTelefonico fijo = new NumeroTelefonico(168, 122444, 78, TipoDeLinea.FIJO);
        NumeroTelefonico fax = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FAX);

        Email email = new Email("lio@messi.com");
        Persona messi = new Persona("Lionel", "Messi");

        Mascota hulk = new Mascota("Hulk", "Perro");
        Mascota thor = new Mascota("Thor", "Gato");
        Mascota caps = new Mascota("Caps", "Conejo");

        Hito finalMundial = new Hito("2014-07-13", "Subcampeon Mundial - Brasil 2014", 75575);
        Hito finalAmerica = new Hito("2021-07-10", "Campeon America - Brasil 2021", 5500);

        messi.agregar(celular);
        messi.agregar(celular1);
        messi.agregar(fijo);
        messi.agregar(fax);
        messi.agregar(email);

        messi.agregar(hulk);
        messi.agregar(thor);
        messi.agregar(caps);

        messi.agregar(finalMundial);
        messi.agregar(finalAmerica);

        messi.mostrarTodo();
    }
}
