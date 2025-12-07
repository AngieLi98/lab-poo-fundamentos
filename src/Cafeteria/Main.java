package Cafeteria;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("cafe", 2000);
        Producto producto2 = new Producto("pastel", 21000);

        Pedido pedido1 = new Pedido("a1", producto1, 4);
        Pedido pedido2 = new Pedido("a2", producto2, 2);

        Cafeteria cafeteria1 = new Cafeteria("Cafeteria local");

        cafeteria1.agregarPedido(pedido1);
        cafeteria1.agregarPedido(pedido2);

        pedido1.marcarEntregado();

        cafeteria1.mostrarPedidos();

        cafeteria1.mostrarVentasTotales();
    }
}
