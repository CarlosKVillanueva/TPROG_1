
package ar.edu.ort;

import ar.edu.ort.entidades.*;


public class Main {

	public static void main(String[] args) {
		Pedido p = new Pedido(TipoPedido.POR_MENOR);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales Kelox", 10, "Una Certificadora"), 3);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.LACTEO, "Pan Lactalinda", 22, "Otra Certificadora"), 7);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.PANIFICADO, "Cereales Kelox", 105, "Mi Certificadora"), 2);

		p.agregarProducto(new ProductoConTacc(FamiliaProducto.REPOSTERO, "Budin de Limon", 123), 2);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales AllBrain", 98, "La Certificadora"), 1);

		p.mostrar();

		System.out.print("\n\n\n----------------------------------------------------------------------------------\n\n\n\n");

		p = new Pedido(TipoPedido.POR_MAYOR);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales Kelox", 10, "Una Certificadora"), 8);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.LACTEO, "Pan Lactalinda", 22, "Otra Certificadora"), 22);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.PANIFICADO, "Cereales Kelox", 105, "Mi Certificadora"),
				1);

		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales AllBrain", 98, "La Certificadora"), 21);

		p.mostrar();
	}

}
