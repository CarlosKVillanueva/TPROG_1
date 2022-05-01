package ar.edu.ort.clases;
import java.util.ArrayList;

public class TallerMecanico {

	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";
	private String nombre;
	private ArrayList<Servicio> servicios;
	
	private int contEncendidos = 0;
	private int contAlineaciones = 0;
	private int contCambios = 0;
	private double acumServiciosTotales;


	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.servicios = new ArrayList<>();
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean agregado = false;

		if (nuevoServicio != null) {
			agregado = servicios.add(nuevoServicio);

			if (nuevoServicio instanceof Alineacion) {
				contAlineaciones++;
			} else if (nuevoServicio instanceof CambioAceite) {
				contCambios++;
			} else if (nuevoServicio instanceof Encendido) {
				contEncendidos++;
			}
		acumServiciosTotales += nuevoServicio.calcularPrecioVenta();
		}

		return agregado;
	}
	
	public void listarServicios() {
		System.out.printf("Taller %s\n", this.nombre);
		System.out.printf(FORMATO_CANTIDADES, contCambios, contEncendidos, contAlineaciones);
		System.out.printf("El importe total de ventas es de $%.2f\n", acumServiciosTotales);

	}
	
}
