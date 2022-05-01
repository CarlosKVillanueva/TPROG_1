package tp1.parcial1.clases;

public class Encendido extends Servicio{
	private int horas;
	private TipoDeMotor tipoMotor;

	public Encendido(String descripcion, double costoMateriales, double porcentajeGanancia, int horas, String patente, TipoDeMotor tipoMotor) {
		super(descripcion, costoMateriales, porcentajeGanancia, patente);
		this.horas = horas;
		this.tipoMotor = tipoMotor;
	}

	@Override
	public double calcularPrecioCosto() {
		return super.getCostoMateriales() + this.tipoMotor.getPrecio();
	}
}
