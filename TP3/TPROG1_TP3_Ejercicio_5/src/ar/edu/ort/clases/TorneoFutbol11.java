package ar.edu.ort.clases;

public class TorneoFutbol11 extends TorneoFutbol {

	private static final int EMPATE = 1;
	private static final int GANADO = 3; 
	private static final int PERDIDO = 0; 
	private static final int VALLA_INVICTA = 0; 
	private static final int GANADOR4GOLES = 0; 
	private static final int EMPATE_MAS3GOLES = 0; 


	
	

	public TorneoFutbol11() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 11";
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
