package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Pizzeria implements Mostrable{

	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de parametros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";

	private String nombre;
	private Cola<String> errores;
	private int[][] cantToppingsXPizza;
	private PizzasPorPrecioVenta pizzasVendidas;
	private int[] cantPizzasFabricadas;
	private float acumVentas;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		errores = new ColaNodos<>();
		cantToppingsXPizza = new int[TipoPizza.values().length][Topping.values().length];
		pizzasVendidas = new PizzasPorPrecioVenta();
		cantPizzasFabricadas = new int[TipoPizza.values().length];
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {
		if (tipoPizza == null || topping == null || cantidad < 1) {
			errores.add(MSG_TOPPINGS);
			throw new IllegalArgumentException(MSG_TOPPINGS);
		}
		cantToppingsXPizza[tipoPizza.ordinal()][topping.ordinal()] += cantidad;
	}

	public void ingresarPedido(Pizza p, Topping topping) {
		if (p == null || topping == null) {
			errores.add(MSG_PIZZA_TOPPINGS_NULO);
			throw new RuntimeException(MSG_PIZZA_TOPPINGS_NULO);
		}
		if (!hayTopping(p, topping)) {
			String error = String.format("No se pudo fabricar %s por falta de topping %s", p.getNombre(), topping.getNombre());
			errores.add(error);
			throw new RuntimeException(error);
		} else {
			this.pizzasVendidas.add(p);
			cantToppingsXPizza[p.getTipoPizza().ordinal()][topping.ordinal()]--;
			cantPizzasFabricadas[p.getTipoPizza().ordinal()]++;
			acumVentas += p.getPrecioDeVenta();
		}
	}

	private boolean hayTopping(Pizza p, Topping topping) {
		return cantToppingsXPizza[p.getTipoPizza().ordinal()][topping.ordinal()] > 0;
	}

	@Override
	public void mostrar() {
		System.out.printf("Pizzeria: %s\n", this.nombre);
		System.out.printf(MSG_CANTIDADES,cantPizzasFabricadas[TipoPizza.TRADICIONAL.ordinal()],
				cantPizzasFabricadas[TipoPizza.ESPECIAL.ordinal()],cantPizzasFabricadas[TipoPizza.RECTANGULAR.ordinal()]);
		System.out.printf(MSG_TOTALES,acumVentas);
		System.out.println("-------------------------------");
		System.out.println("Pizzas fabricadas por precio:");
		mostrarVentas();
		System.out.println("-------------------------------");
		System.out.println("Pedidos con error");
		mostrarErrores();

	}

	private void mostrarErrores() {
		String error = errores.remove();
		errores.add(null);
		while (error != null) {
			System.out.println(error);
			errores.add(error);
			error = errores.remove();
		}
	}

	private void mostrarVentas() {
		for (Pizza pizza : pizzasVendidas) {
			pizza.mostrar();
		}
	}

	public int vendidasConPrecioEntre(float min, float max) {
		int i = 0;
		int cont = 0;
		while (i < pizzasVendidas.size() && pizzasVendidas.get(i).getPrecioDeVenta() <= max) {
			if (pizzasVendidas.get(i).getPrecioDeVenta() >= min) {
				cont ++;
			}
			i++;
		}
		return cont;
	}
}
