package tp1.parcial1;
import tp1.parcial1.clases.*;

public class Parcial1 {
	
	public static void main(String[] args) {

		TallerMecanico miTaller = new TallerMecanico("Ort Boxes");

		miTaller.agregarServicio(new CambioAceite("Cambio de aceite 1", 100, 40, 6, "000111"));
		miTaller.agregarServicio(null);
		miTaller.agregarServicio(new CambioAceite("Cambio de aceite 2", 200, 90, 3, "222333"));
		miTaller.agregarServicio(new CambioAceite("Cambio de aceite 3", 350, 80, 1, "444555"));
		miTaller.agregarServicio(null);
		miTaller.agregarServicio(new Alineacion("Alineacion 1", 900, 20, 6, "222111", false));
		miTaller.agregarServicio(new Alineacion("Alineacion 1", 1900, 40, 12, "929111", true));
		miTaller.agregarServicio(new Encendido("Encendido 1", 200, 10, 3, "302012", TipoDeMotor.DIESEL));
		miTaller.agregarServicio(new Encendido("Encendido 2", 240, 14, 4, "210203", TipoDeMotor.NAFTERO));
		miTaller.listarServicios();

		//listarServicios dice la cantidad de cada tipo de servicio y el total de las ventas (Precio)

		
		//
		
		
	}

}
