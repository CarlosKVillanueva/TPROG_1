package ar.edu.ort.clases;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private static final int VALLA_INVICTA = 0;
	private static final int EXTRA_GOLEADA = 4;
	private static final int EXTRA_EMPATE = 3;
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		jornadas = new ArrayList<>();
		equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		jornadas.add(jornada);
	}
	
	public void eliminarJornada(Jornada jornada) {
	jornadas.remove(jornada); 
	}
	
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			for (Partido partido : jornada.getPartidos()) {
				calcularPuntos(partido);
			}
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		for (Equipo equipo : equipos) {
			System.out.println(equipo.getNombre() + ": " + equipo.getPuntos() + " puntos");
		}
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if(golesEquipoLocal > golesEquipoVisitante){
			puntosLocal = puntajePartidoGanado();
			puntosVisitante = puntajePartidoPerdido();
			puntosLocal = calcularExtras(puntosLocal, golesEquipoLocal, golesEquipoVisitante);
		}else if (golesEquipoLocal < golesEquipoVisitante) {
			puntosLocal = puntajePartidoPerdido();
			puntosVisitante = puntajePartidoGanado();
			puntosVisitante = calcularExtras(puntosVisitante, golesEquipoVisitante, golesEquipoLocal);
		} else {
			puntosLocal = puntajePartidoEmpatado();
			puntosVisitante = puntajePartidoEmpatado();
			if (partido.getGolesEquipoLocal() >= EXTRA_EMPATE) {
				puntosLocal += puntajeEmpateMas3Goles();
				puntosVisitante += puntajeEmpateMas3Goles();
			}
			}
		asignarPuntos(partido.getEquipoLocal(), puntosLocal, partido.getEquipoVisitante(), puntosVisitante);
		}

	private int calcularExtras(int puntos, int golesEquipoA, int golesEquipoB) {
		if ((golesEquipoA - golesEquipoB) > EXTRA_GOLEADA) {
			puntos += puntajeGanador4Goles();
		}
		if (golesEquipoB == VALLA_INVICTA) {
			puntos += puntajeVallaInvicta();
		}
		return puntos;
	}


	// Completar
	
	

	private void asignarPuntos(Equipo equipoLocal, int puntosLocal, Equipo equipoVisitante, int puntosVisitante) {
		equipoLocal.setPuntos(puntosLocal);
		equipoVisitante.setPuntos(puntosVisitante);
		
	}

	public abstract int puntajePartidoEmpatado(); 	
	
	public abstract int puntajePartidoGanado();
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
}