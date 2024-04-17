package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public void añadirReserva(Reserva nuevaReserva)throws Exception {
        for (Reserva reserva : reservas) {
            if (reserva.getLibro().getIsbn().equals(nuevaReserva.getLibro().getIsbn()) &&
                !(reserva.getFinReserva().isBefore(nuevaReserva.getInicioReserva()) ||
                  reserva.getInicioReserva().isAfter(nuevaReserva.getFinReserva()))) {
                throw new Exception("La reserva se solapa con otra existente para el libro con ISBN: " + nuevaReserva.getLibro().getIsbn());
            }
        }
        reservas.add(nuevaReserva);
    }
}
