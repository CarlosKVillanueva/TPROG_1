package tp1.parcial1.clases;
import java.util.ArrayList;

public class TallerMecanico {

	private String nombre;
	private ArrayList<Servicio> servicios;
	private int contAlineaciones;
	private int contCambiosAceite;
	private int contEncendidos;
	private double acumPrecioVenta;


	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";


	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.servicios = new ArrayList<>();
	}

	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean seAgrego = false;
		if (nuevoServicio != null) {
			seAgrego = servicios.add(nuevoServicio);

			if (nuevoServicio instanceof Alineacion) {
				contAlineaciones++;
			} else if (nuevoServicio instanceof Encendido) {
				contEncendidos++;
			} else if (nuevoServicio instanceof CambioAceite) {
				contCambiosAceite++;
			}

			acumPrecioVenta += nuevoServicio.calcularPrecioVenta();
			System.out.println("Se agrego el servicio: " + nuevoServicio.getDescripcion());
			System.out.println("Servicio de: " + nuevoServicio.getClass().getSimpleName());
			nuevoServicio.detallarServicio();
		} else {
			System.out.println("No se agrego el servicio");
		}
		return seAgrego;
	}
	


	public void listarServicios() {
		System.out.printf("Taller %s\n", this.nombre);
		System.out.printf(FORMATO_CANTIDADES, contCambiosAceite, contEncendidos, contAlineaciones);
		System.out.printf("El importe total de ventas es de $%.2f \n", + this.acumPrecioVenta);
	}

}
