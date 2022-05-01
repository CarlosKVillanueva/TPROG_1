package ar.edu.ort.clases;

public class TorneoFutbol5 extends TorneoFutbol{

	private static final int EMPATE = 1;
	private static final int GANADO = 2; 
	private static final int PERDIDO = 0; 
	private static final int VALLA_INVICTA = 0; 
	private static final int GANADOR4GOLES = 1; 
	private static final int EMPATE_MAS3GOLES = 2; 


	
	public TorneoFutbol5() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 5";
	}

	@Override
	public int puntajePartidoEmpatado(){
		return EMPATE; 
			
	}
	@Override
	public int puntajePartidoGanado() {
		return GANADO;
	}

	@Override
	public int puntajePartidoPerdido() {
		return PERDIDO;
	}

	@Override	
	public int puntajeVallaInvicta() {
		return VALLA_INVICTA;
	}

	@Override
	public int puntajeGanador4Goles() {
		return GANADOR4GOLES;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return EMPATE_MAS3GOLES;
	}
	
	}