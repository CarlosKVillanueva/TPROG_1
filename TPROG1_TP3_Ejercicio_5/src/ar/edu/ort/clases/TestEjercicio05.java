//package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;
//
//public class TestEjercicio05 {
//
//	public static void main(String[] args) {
//		TorneoFutbol torneoFutbol = new TorneoFutbol8();
//
//		Equipo boca 			= new Equipo("Boca", 0);
//		Equipo river 			= new Equipo("River", 0);
//		Equipo velez 			= new Equipo("Velez", 0);
//		Equipo sanLorenzo 		= new Equipo("San Lorenzo", 0);
//		Equipo racing 			= new Equipo("Racing", 0);
//		Equipo independiente 	= new Equipo("Independiente", 0);
//
//		torneoFutbol.agregarEquipo(boca);
//		torneoFutbol.agregarEquipo(river);
//		torneoFutbol.agregarEquipo(velez);
//		torneoFutbol.agregarEquipo(boca);
//		torneoFutbol.agregarEquipo(sanLorenzo);
//		torneoFutbol.agregarEquipo(racing);
//		torneoFutbol.agregarEquipo(independiente);
//
//
//		Jornada fecha1	= new Jornada(1);
//		Jornada fecha2	= new Jornada(2);
//		Jornada fecha3	= new Jornada(3);
//		Jornada fecha4	= new Jornada(4);
//		Jornada fecha5	= new Jornada(5);
//
//
//		Partido	bocavssanLorenzo= new Partido(boca,sanLorenzo,5,4);
//		Partido	rivervsracing= new Partido(river,racing,1,2);
//		Partido	velezvsindependiente= new Partido(velez,independiente,2,6);
//		Partido	bocavsriver= new Partido(boca,river,4,3);
//		Partido	sanLorenzovsindependiente= new Partido(sanLorenzo,independiente,3,0);
//		Partido	racingvsvelez= new Partido(racing,velez,5,1);
//		Partido	bocavsvelez= new Partido(boca,velez,6,6);
//		Partido	sanLorenzovsriver= new Partido(sanLorenzo,river,3,1);
//		Partido	racingvsindependiente= new Partido(racing,independiente,2,4);
//		Partido	bocavsRacing= new Partido(boca,racing,0,0);
//		Partido	rivervsindependiente= new Partido(river,independiente,1,2);
//		Partido	sanLorenzovsvelez= new Partido(sanLorenzo,velez,4,4);
//		Partido	bocavsindependiente= new Partido(boca,independiente,2,1);
//		Partido	rivervsvelez= new Partido(river,velez,2,5);
//		Partido	sanLorenzovsracing= new Partido(sanLorenzo,racing,0,3);
//
//
//		fecha1.agregarPartido(bocavssanLorenzo);
//		fecha1.agregarPartido(rivervsracing);
//		fecha1.agregarPartido(velezvsindependiente);
//		fecha2.agregarPartido(bocavsriver);
//		fecha2.agregarPartido(sanLorenzovsindependiente);
//		fecha2.agregarPartido(racingvsvelez);
//		fecha3.agregarPartido(bocavsvelez);
//		fecha3.agregarPartido(sanLorenzovsriver);
//		fecha3.agregarPartido(racingvsindependiente);
//		fecha4.agregarPartido(bocavsRacing);
//		fecha4.agregarPartido(rivervsindependiente);
//		fecha4.agregarPartido(sanLorenzovsvelez);
//		fecha5.agregarPartido(bocavsindependiente);
//		fecha5.agregarPartido(rivervsvelez);
//		fecha5.agregarPartido(sanLorenzovsracing);
//
//
//
//
//		torneoFutbol.agregarJornada(fecha1);
//		torneoFutbol.agregarJornada(fecha2);
//		torneoFutbol.agregarJornada(fecha3);
//		torneoFutbol.agregarJornada(fecha4);
//		torneoFutbol.agregarJornada(fecha5);
//
//
//		torneoFutbol.finalizarJornada(fecha1);
//		torneoFutbol.finalizarJornada(fecha2);
//		torneoFutbol.finalizarJornada(fecha3);
//		torneoFutbol.finalizarJornada(fecha4);
//		torneoFutbol.finalizarJornada(fecha5);
//
//		torneoFutbol.mostrarTabla();
//	}
//}
