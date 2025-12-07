package Cine;

public class Pelicula {
    String titulo;
    String genero;
    double duracion;
    int disponible;

    public Pelicula() {

    }

    public Pelicula(String titulo, String genero, double duracion, int disponible) {
        this.titulo= titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.disponible = disponible;
    }

    void informacionPelicula() {
        System.out.println("\nLa pelicula es: ");
        System.out.println("Titulo: "+ titulo);
        System.out.println("Genero: "+ genero);
        System.out.println("Duracion en minutos: "+ duracion);
        System.out.println("Entradas disponibles: "+ disponible);
    }

    void venderEntrada() {
        if (disponible > 0) {
            disponible--;
            System.out.println("entrada vendida");
        } else {
            System.out.println("no hay entradas");
        }

    }
}
