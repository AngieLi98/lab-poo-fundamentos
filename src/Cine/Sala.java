package Cine;

public class Sala {
    String id;
    String tipo;
    int capacidad;
    int ocupados;

    public Sala() {

    }

    public Sala(String id, String tipo, int capacidad, int ocupados) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ocupados = ocupados;
    }

    void reservaAsiento() {
        if (ocupados < capacidad) {
            ocupados++;
            System.out.println("asiento reservado");
        } else {
            System.out.println("no hay asisentos disponibles");
        }
    }

    void mostrarEstadoSala() {
        System.out.println("\nInformacion de la sala");
        System.out.println("Identificador: "+ id);
        System.out.println("Tipo de sala: "+ tipo);
        System.out.println("Capacidad: "+ capacidad);
        System.out.println("Asiento reservados: "+ ocupados);
    }


}
