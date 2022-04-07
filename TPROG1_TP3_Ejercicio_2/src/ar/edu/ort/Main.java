package ar.edu.ort;

import ar.edu.ort.clases.Asalariado;
import ar.edu.ort.clases.SubContratado;
import ar.edu.ort.clases.Vendedor;

public class Main {

    public static void main(String[] args) {

        Asalariado jose = new Asalariado("Jose", 30, 10000);
        SubContratado carlos = new SubContratado("Carlos", 23, 50, 100);


        Vendedor pedro = new Vendedor("Pedro", 25, 100, 200, 1.05f);
        Vendedor maria = new Vendedor("Maria", 30, 100, 200, 1.1f);

        System.out.println(jose);
        System.out.println(carlos);
        System.out.println(pedro);
        System.out.println(maria);
    }


}
