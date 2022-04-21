package ar.edu.ort.tp1.pacial1.clases;

public enum TipoMesa {

	MODERNA(1), ANTIGUA(1.5f), CRISTAL(2.3f);

	private float multiplicadorValor;

	TipoMesa(float multiplicadorValor) {
		this.multiplicadorValor = multiplicadorValor;
	}

	public float getMultiplicadorValor() {
		return multiplicadorValor;
	}

}
