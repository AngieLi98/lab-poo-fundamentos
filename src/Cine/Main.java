package Cine;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Los increibles", "Superheroes", 115,30);
        Sala sala1 = new Sala("A36", "3D", 100,60);

        Reserva reserva1 = new Reserva(pelicula1, sala1, "Laura Velez");
        Reserva reserva2 = new Reserva(pelicula1,sala1, "Mateo Porras");

        reserva1.realizarReservar();
        reserva1.mostrarDetallesReserva();

        reserva2.realizarReservar();
        reserva2.mostrarDetallesReserva();
    }
}
