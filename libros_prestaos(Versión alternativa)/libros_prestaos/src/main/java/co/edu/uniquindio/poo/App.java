package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        GestorReservas gestorReservas = new GestorReservas();
        Persona persona1 = new Persona(1, "Juan Pérez");
        Persona persona2 = new Persona(2, "Paco Mercelo");
        Libro libro1 = new Libro("123-456-789", "El arte de la guerra", "Sun Tzu");
        Libro libro2 = new Libro("987-456-123", "Habitos atomicos", "James Clear");

        Reserva reserva1 = new Reserva(libro1, persona1, LocalDate.now(), LocalDate.now().plusDays(7));

        try {
            gestorReservas.añadirReserva(reserva1);
            System.out.println("Reserva añadida exitosamente.");
        } catch (ReservaSolapadaException e) {
            System.err.println(e.getMessage());
        }

        //Esta reserva abarca el tiempo de la reserva 1 por ende se solapa
        Reserva reserva2 = new Reserva(libro2, persona2, LocalDate.now().minusDays(2), LocalDate.now().plusDays(9));

        //Esta reserva no se solapa
        //Reserva reserva2 = new Reserva(libro1, persona2, LocalDate.now().plusDays(8), LocalDate.now().plusDays(9));

        //Esta reserva no se solapa
        //Reserva reserva2 = new Reserva(libro1, persona2, LocalDate.now().minusDays(8), LocalDate.now().minusDays(5));

        try {
            gestorReservas.añadirReserva(reserva2);
            System.out.println("Reserva añadida exitosamente.");
        } catch (ReservaSolapadaException e) {
            System.err.println(e.getMessage());
        }

        // Intenta hacer otra reserva del mismo libro en el mismo rango de fechas
        try {
            gestorReservas.añadirReserva(reserva1); // Esto lanzará una excepción
        } catch (ReservaSolapadaException e) {
            System.err.println(e.getMessage());
        }
    }
}
