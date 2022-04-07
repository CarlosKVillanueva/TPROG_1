package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Main {
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

        messi.agregarTelefono(celular);
        messi.agregarTelefono(celular1);
        messi.agregarTelefono(fijo);
        messi.agregarTelefono(fax);
        messi.agregarEmail(email);

        messi.agregarMascota(hulk);
        messi.agregarMascota(thor);
        messi.agregarMascota(caps);

        messi.agregarHito(finalMundial);
        messi.agregarHito(finalAmerica);

        messi.mostrarTodo();
    }
}
