package Cafeteria;

import java.util.ArrayList;

public class Cafeteria {
    String nombreCafeteria;
    ArrayList<Pedido> pedidos;

    public Cafeteria() {
        this.pedidos = new ArrayList<>();
    }

    public Cafeteria(String nombreCafeteria) {
        this.nombreCafeteria = nombreCafeteria;
        this.pedidos = new ArrayList<>();
    }

    void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido " + pedido.id + " agregado");
    }

    void mostrarPedidos() {
        System.out.println("\nPedidos registrados en " + nombreCafeteria);

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        for (Pedido pedido : pedidos) {
            pedido.mostrarDetalles();
        }
    }

    void mostrarVentasTotales() {
        double totalVentas = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.entregado) {
                totalVentas += pedido.calcularTotal();
            }
        }

        System.out.println("\nVentas totales: $" + totalVentas);
    }
}


