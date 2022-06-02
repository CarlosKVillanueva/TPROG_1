package ar.edu.ort.clases;

import java.util.Scanner;

/**
 * Esta clase debe:
 * - Cargar uno o mas diccionarios (uno en cada idioma, al menos dos) para que pueda:
 *    -- Mostrar errores
 *    -- Dar la bienvenida
 *    -- Solicitar un nombre (para que el Saludador lo pida por teclado).
 *    -- Decirle que tiene un lindo nombre
 *    -- Mostrar un saludo de despedida usando el nombre pedido por teclado.
 * - Elegir un idioma
 * - Ejecutar una rutima que:
 *   -- Salude
 *   -- Pida el nombre
 *   -- Lo cargue por teclado
 *   -- Diga que es un lindo nombre
 *   -- Despedir usando el nombre
 */
public class Saludador {

	private Diccionario diccionario;
	private String idioma;
	private Scanner input;
	
	public Saludador(String idioma) {
		this.idioma = idioma;
		this.diccionario = new Diccionario();
		cargarDiccionario(diccionario);
	}

	private void cargarDiccionario(Diccionario diccionario) {
		diccionario.agregarIdioma("ES", "Espaniol");
		diccionario.agregarIdioma("EN", "Ingles");
		diccionario.agregarIdioma("FR", "Frances");

		diccionario.agregarTermino("ES","BIENVENIDA","Hola!");
		diccionario.agregarTermino("ES","INGRESO","Ingresa tu nombre por favor:\n");
		diccionario.agregarTermino("ES","LINDO","Que lindo nombre!");
		diccionario.agregarTermino("ES","DESPEDIDA","Adios %s! Que tengas un lindo dia!\n");
		diccionario.agregarTermino("ES","AFIRMATIVO","Si!");
		diccionario.agregarTermino("ES","NEGATIVO","No!");

		diccionario.agregarTermino("EN","BIENVENIDA","Hello!");
		diccionario.agregarTermino("EN","INGRESO","Enter your name, please:\n");
		diccionario.agregarTermino("EN","LINDO","What a nice name!");
		diccionario.agregarTermino("EN","DESPEDIDA","Good bye %s! Have a nice day!\n");
		diccionario.agregarTermino("EN","AFIRMATIVO","Yes!");
		diccionario.agregarTermino("EN","NEGATIVO","No!");

		diccionario.agregarTermino("FR","BIENVENIDA","Bonjour!");
		diccionario.agregarTermino("FR","INGRESO","Saisissez votre nom, s'il vous plaît:\n");
		diccionario.agregarTermino("FR","LINDO", "C'est un très joli nom!");
		diccionario.agregarTermino("FR","DESPEDIDA","Au revoir, %s! Bonne journée !\n");
		diccionario.agregarTermino("FR","AFIRMATIVO","Oui!");
		diccionario.agregarTermino("FR","NEGATIVO","Non!");
	}

	public void elegirIdioma(String idioma) throws RuntimeException {
		if (diccionario.idiomaValido(idioma)) {
			this.idioma = idioma;
		} else {
			throw new RuntimeException(diccionario.obtenerTermino(this.idioma, "IDIOMA_INVALIDO"));
		}
	}

	public void run() {
		String nombre;
		input = new Scanner(System.in);
		System.out.printf("*** %s ***\n", this.idioma);
		System.out.printf("%s\n",diccionario.obtenerTermino(idioma,"BIENVENIDA"));
		System.out.printf("%s",diccionario.obtenerTermino(idioma,"INGRESO"));
		nombre = this.input.nextLine();
		System.out.printf("%s\n", diccionario.obtenerTermino(idioma,"LINDO"));
		System.out.printf(diccionario.obtenerTermino(idioma,"DESPEDIDA"),nombre);
	}

}
