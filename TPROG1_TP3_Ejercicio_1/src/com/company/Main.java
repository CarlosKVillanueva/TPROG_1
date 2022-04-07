package com.company;

import com.company.clases.Asalariado;
import com.company.clases.SubContratado;

public class Main {

    public static void main(String[] args) {

        Asalariado jose = new Asalariado("Jose", 30, 10000);
        SubContratado carlos = new SubContratado("Carlos", 23, 50, 100);

        System.out.println(jose);
        System.out.println(carlos);
    }
}
