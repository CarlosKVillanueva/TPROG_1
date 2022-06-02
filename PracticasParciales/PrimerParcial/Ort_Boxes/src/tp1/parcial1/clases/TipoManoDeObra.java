package tp1.parcial1.clases;

/*	lubricacion se refiere a cambio de aceite
 * 	gomeria se refiere a alineacion
 * 	
 * */
public enum TipoManoDeObra {
	LUBRICACION(0.3d),GOMERIA(0.1d);
	
	private double multiplicadorHoras;
	
	private TipoManoDeObra(double multiplicadorHoras) {
		this.multiplicadorHoras = multiplicadorHoras;
	}

	public double getMultiplicadorHoras() {
		return multiplicadorHoras;
	}

}
