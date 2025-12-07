package Cine;

public class Reserva {
    Pelicula pelicula;
    Sala sala;
    String cliente;

    public Reserva() {

    }

    public Reserva(Pelicula pelicula, Sala sala, String cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    void realizarReservar() {
        System.out.println("\nReserva");
        System.out.println("\ncliente: "+ cliente);
        pelicula.venderEntrada();
        sala.reservaAsiento();
        System.out.println("Listo completaste tu reserva");
    }

    void mostrarDetallesReserva() {
        System.out.println("\nInformacion de la reserva");
        System.out.println("\ncliente: "+ cliente);
        pelicula.informacionPelicula();
        sala.mostrarEstadoSala();
    }


}
