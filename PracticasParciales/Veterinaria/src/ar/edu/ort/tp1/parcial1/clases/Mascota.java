package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal, Mostrable{

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenia hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenia mucha hambre, pero gracias";
	private static final String MSG_ESTADO = "El estado de %s es: %s\n";
	private static final int CIEN = 100;

	private String nombre;
	private double peso;
	private boolean vacunado;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacunado, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacunado = vacunado;
		setEstado(estado);
	}

	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estar� feliz y dara las gracias ya que ten�a hambre
	 * Si su estado es feliz, se enfermar� e indicar� que comio demasiado.
	 * si estaba enfermo, dara las gracias, pero seguir� enfermo.
	 * adem�s actualizar� el peso sumando al actual la multiplicaci�n entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicar� su estado
	 *
	 * //@param comida
	 * //@param multiplicador
	 */
	public void comer(double comida, double multiplicador) {
		Estado estado = this.estado;

		if (estado == Estado.HAMBRIENTO) {
			System.out.printf("%s %s\n", nombre, MSG_COM_HAMBRIENTO);
			estado = Estado.FELIZ;
		} else if (estado == Estado.FELIZ) {
			System.out.printf("%s %s\n",nombre, MSG_COM_FELIZ);
			estado = Estado.ENFERMO;
		} else if (estado == Estado.ENFERMO) {
			System.out.printf("%s %s\n", nombre, MSG_COM_ENFERMO);
		}
		setEstado(estado);
		this.peso += comida * multiplicador;
		System.out.printf(MSG_ESTADO,this.nombre, this.estado.getDescripcion());
	}


	private void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void mostrar() {
		System.out.println(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}


	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public boolean estaVacunada() {
		return this.vacunado;
	}

	public void vacunar() {
		this.vacunado = true;
	}
}
