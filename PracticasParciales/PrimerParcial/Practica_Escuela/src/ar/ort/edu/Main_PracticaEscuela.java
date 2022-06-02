package ar.ort.edu;

import ar.ort.edu.clases.*;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main_PracticaEscuela {
    public static void main(String[] args) {
        Escuela escuela = new Escuela("12");

        escuela.agregarPersonas(new Alumno("Kaio", "123", 7f, 5));
        escuela.agregarPersonas(new Docente("Anto", "456",5,5 ));
        escuela.agregarPersonas(new Docente("Jose", "87563876",5,5 ));
        escuela.agregarPersonas(new Preceptor("Facu", "789",5));

//        Persona persona = new Persona("jose", "7865");
//        persona.agregarFamiliares();
//        persona.mostrarFamiliares();

//        escuela.mostrarAlumnosPorDocente("12378615876135");
//        escuela.mostrarAlumnos();
        escuela.mostrarTodo();
        System.out.println(escuela.contarAlumnos());

    }
}