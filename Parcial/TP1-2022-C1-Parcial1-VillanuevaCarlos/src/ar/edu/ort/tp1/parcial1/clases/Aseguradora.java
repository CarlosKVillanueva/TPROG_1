package ar.edu.ort.tp1.parcial1.clases;


import java.util.ArrayList;


public class Aseguradora implements Mostrable{

	private static final String TXT_ASEGURANDO = "Asegurando a %s por con un premio mensual de: $%.2f\n";
	private static final String TXT_ENCABEZADO = "Sistema de estadisticas de la compañia aseguradora %s\n";
	private static final String MSG_ESTADISTICA_EDAD_CEL = "El promedio de edad de asegurados con tenencia de Celular es: %.2f\n";
	private static final String MSG_ESTADISTICA_AUTOS_MASC = "La cantidad de seguros de autos con asegurados de genero masculino es: %d\n";
	private static final String MSG_ESTADISTICA_PREMIO_AUTO = "El premio menor de los seguros de auto es: $%.2f\n";
	public static final int ZERO = 0;

	private String nombre;
	private ArrayList<Asegurado> asegurados;
	private ArrayList<Seguro> seguros;
	private int contadorSegurosMasc;
	private int contCelulares;
	private double acumEdad = ZERO;
	private double minimo = Double.MAX_VALUE;

	public Aseguradora(String nombre) {
		this.nombre = nombre;
		this.asegurados = new ArrayList<>();
		this.seguros = new ArrayList<>();
	}

	public void agregarCliente(Asegurado asegurado) {
		if (asegurado != null) {
			asegurados.add(asegurado);
		}
	}


	public Seguro generarSeguroAuto(float valorAsegurado, MarcaAuto marca, String modelo) {
		Seguro seguro = new SeguroAuto("Seguro de automotor todo riesgo", valorAsegurado, marca, modelo);
		seguros.add(seguro);
		return seguro;
	}

	public Seguro generarSeguroCelular(float valorAsegurado, String marca, String modelo) {
		Seguro seguro = new SeguroCelular("Seguro de robo de celular", valorAsegurado, marca, modelo);
		seguros.add(seguro);
		return seguro;
	}

	public void asegurar(String dni, Seguro s) {
		Asegurado asegurado = buscarAsegurado(dni);
		if (asegurado != null) {
			s.asegurar(asegurado);
			double premio = s.calcularPremio();
			System.out.printf(TXT_ASEGURANDO, asegurado.toString(), premio);

			if (s instanceof SeguroAuto && asegurado.esMasculino()) {
				contadorSegurosMasc++;
			}

			if (s instanceof SeguroCelular) {
				contCelulares++;
				acumEdad += asegurado.getEdad();
			}

			if (s instanceof SeguroAuto && premio < minimo) {
				minimo = premio;
			}

		}
	}


	private Asegurado buscarAsegurado(String dni) {
	    int i = ZERO, cantAsegurados = asegurados.size();
	    Asegurado aseguradoBuscado = null;

	    while (i < cantAsegurados && aseguradoBuscado == null) {
	        Asegurado elemento = asegurados.get(i);
	        if (elemento.mismoDni(dni)) {
	            aseguradoBuscado = elemento;
	        } else {
	            i++;
	        }
	    }
	    return aseguradoBuscado;
	}

	@Override
	public void mostrar() {
		System.out.printf(TXT_ENCABEZADO, this.nombre);
		System.out.printf(MSG_ESTADISTICA_AUTOS_MASC, contadorSegurosMasc);
		System.out.printf(MSG_ESTADISTICA_EDAD_CEL, (contCelulares > ZERO) ? acumEdad / contCelulares : ZERO);
		System.out.printf(MSG_ESTADISTICA_PREMIO_AUTO, minimo);
	}

	@Override
	public String texto() {
		return null;
	}
}
