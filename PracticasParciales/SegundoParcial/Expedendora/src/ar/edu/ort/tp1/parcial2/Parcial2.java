package ar.edu.ort.tp1.parcial2;

import ar.edu.ort.tp1.parcial2.clases.*;

public class Parcial2 {

    public static void main(String[] args) {

        Expendedora maquina = null;
        try {
            maquina = new Expendedora("Super Hiper Vendedora");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--- Agregado de productos... ---");
        agregarProductos(maquina);

        System.out.println("--- Aplicando actualizaciones de precio... ---");
        actualizarPrecio(maquina);

        System.out.println("--- Listados ---");
        maquina.mostrarHistoricoActualizaciones();
        maquina.mostrarErrores();

        // Descomentar segun la lista que te haya tocado implementar.
        // maquina.listarProductosPorNombre();
        // maquina.listarProductosPorId();
    }

    private static void agregarProductos(Expendedora maquina) {
        // TODO - Agregar los siguientes productos usando el metodo agregar que
        agregar(maquina, new Producto(1, 100.0, "Bidu-Cola"));
        agregar(maquina, new Producto(2, 200.0, "Dos Gambas Light"));
        agregar(maquina, new Producto(3, 500.0, "Milki 1Kg"));
        agregar(maquina, new Producto(3, 500.0, "Miko-Moko"));
    }

    private static void actualizarPrecio(Expendedora maquina) {
        maquina.ajustarPrecio(1, null);
        maquina.ajustarPrecio(1, new ActualizacionPorcentual(10));
        maquina.ajustarPrecio(1, new ActualizacionPorMonto(20));
        maquina.ajustarPrecio(1, new ActualizacionPorMonto(-2500));
        maquina.ajustarPrecio(1, new ActualizacionDirecta(-1));
    }

    private static void agregar(Expendedora maquina, Producto producto) {
        try {
            maquina.agregarProducto(producto);
        } catch (Exception e) {
            System.out.println("Error agregando un producto: " + e.getMessage());
        }
    }

}
