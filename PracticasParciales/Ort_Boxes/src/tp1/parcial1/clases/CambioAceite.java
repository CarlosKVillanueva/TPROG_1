package tp1.parcial1.clases;

public class CambioAceite extends Servicio{

	private int horas;
	private TipoManoDeObra tipoManoDeObra;
		
	public CambioAceite(String descripcion, double costoMateriales, double porcentajeGanancia, int horas, String patente) {
		super(descripcion, costoMateriales, porcentajeGanancia, patente);
		this.horas = horas;
		this.tipoManoDeObra = TipoManoDeObra.LUBRICACION;
	}

	@Override
	public double calcularPrecioCosto() {
		return super.getCostoMateriales() + tipoManoDeObra.getMultiplicadorHoras() * horas;
	}

}
