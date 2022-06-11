package examen.clases;


public class Tragamonedas implements Juego, Mostrable {

	private static final int CANT_RODILLOS = 5;
	private static final int LADOS = 6;

	private RodilloDeNumeros[] rodillos;
	private EstadoJuego estado;

	public Tragamonedas() {
		this.rodillos = new RodilloDeNumeros[CANT_RODILLOS];
		crearRodillos();
	}

	private void crearRodillos() {
		for (int i = 0; i < CANT_RODILLOS; i++) {
			rodillos[i] = new RodilloDeNumeros(LADOS);
		}
	}

	@Override
	public void jugar() {
		for (RodilloDeNumeros rodillo : rodillos) {
			rodillo.rodar();
		}
		procesarEstado();
	}

	@Override
	public void mostrar() {
		for (RodilloDeNumeros rodillo : rodillos) {
			rodillo.mostrar();
		}
		System.out.println(" Resultado tirada - " + obtenerResultado());
	}

	@Override
	public boolean hayGanador() {
		return estado.ordinal() > EstadoJuego.SIN_SUERTE.ordinal();
	}

	private boolean generala() {
		boolean generala = true;
		int i = 1;
		while (i < rodillos.length && generala) {
			generala = rodillos[0].obtenerActual().equals(rodillos[i].obtenerActual());
			i++;
		}
		return generala;
	}

	private boolean capicua() {
		return (rodillos[0].obtenerActual().equals(rodillos[rodillos.length - 1].obtenerActual())) && (rodillos[1].obtenerActual().equals(rodillos[rodillos.length - 2].obtenerActual()));
	}

	protected String obtenerResultado() {
		return obtenerEstado().toString();
	}

	@Override
	public void procesarEstado() {
		estado = EstadoJuego.SIN_SUERTE;
		if (generala()) {
			estado = EstadoJuego.GENERALA;
		} else if (capicua()) {
			estado = EstadoJuego.CAPICUA;
		}
	}

	@Override
	public EstadoJuego obtenerEstado() {
		return estado;
		
	}

}