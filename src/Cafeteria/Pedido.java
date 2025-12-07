package Cafeteria;

public class Pedido {
    String id;
    Producto producto;
    int cantidadComprada;
    boolean entregado;

    public Pedido() {

    }

    public Pedido(String id, Producto producto, int cantidadComprada) {
        this.id = id;
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.entregado = false;
    }

    void marcarEntregado() {
        if (!entregado) {
            for (int i = 0; i < cantidadComprada; i++) {
                producto.marcarVendido();
            }
            entregado = true;
            System.out.println("El pedido "+ id + " entregado");
        } else {
            System.out.println("El pedido "+ id + " ya estaba entregado");
        }
    }

    double calcularTotal() {
        return producto.precio * cantidadComprada;
    }

    void mostrarDetalles() {
        System.out.println("\nDetalles del pedido");
        System.out.println("Identificador: "+ id);
        producto.informacionProducto();
        System.out.println("Cantidad comprada: "+ cantidadComprada);
        System.out.println("Entregado: "+ entregado);
    }

}
