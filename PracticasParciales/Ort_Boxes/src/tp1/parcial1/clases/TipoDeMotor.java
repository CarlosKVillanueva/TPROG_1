package tp1.parcial1.clases;

public enum TipoDeMotor {
	NAFTERO(1000.0d),DIESEL(1500.0d);
	
	private double precio;
	
	private TipoDeMotor(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
}
