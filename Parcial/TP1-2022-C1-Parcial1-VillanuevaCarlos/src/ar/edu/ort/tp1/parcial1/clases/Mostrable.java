package ar.edu.ort.tp1.parcial1.clases;

public interface Mostrable {

	public static final String PATRON_TEXTO_AUTO = "Marca: %s - Modelo: %s - Valor Asegurado: %.2f";
	public static final String PATRON_TEXTO_CEL = "Marca: %s - Modelo: %Ss - Valor Asegurado: %.2f";
	
	/**
	 * Muestra por consola los datos de la clase.
	 */
	public void mostrar();
	
	/**
	 * Devuelve un texto que puede utilizarse al mostrar la clase.
	 * @return El texto a mostrar.
	 */
	public String texto();
}
