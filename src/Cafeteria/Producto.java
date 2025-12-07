package Cafeteria;

public class Producto {
    String nombre;
    double precio;
    int vendida;

    public Producto() {

    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.vendida = 0;
    }

    void informacionProducto() {
        System.out.println("Informacion del producto: ");
        System.out.println("Nombre producto: "+ nombre);
        System.out.println("Precio: "+ precio);
    }

    void marcarVendido() {
        vendida++;
    }
}
