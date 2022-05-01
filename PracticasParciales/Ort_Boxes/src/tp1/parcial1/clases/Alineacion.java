package tp1.parcial1.clases;

public class Alineacion extends Servicio {

	private int horas;
	private boolean conBalanceo;
	private TipoManoDeObra tipoManoDeObra;
	
	
	public Alineacion(String descripcion, double costoMateriales, double porcentajeGanancia,
			int horas, String patente, boolean conBalanceo) {
		super(descripcion, costoMateriales, porcentajeGanancia, patente);
		this.horas = horas;
		this.conBalanceo = conBalanceo;
		this.tipoManoDeObra = TipoManoDeObra.GOMERIA;
	}


	@Override
	public double calcularPrecioCosto() {
		return (conBalanceo) ? (super.getCostoMateriales() + (this.tipoManoDeObra.getMultiplicadorHoras() * (this.horas + 1))) :
				(super.getCostoMateriales() + this.tipoManoDeObra.getMultiplicadorHoras() * this.horas);
	}

}
