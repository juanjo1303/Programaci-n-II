package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public void añadirReserva(Reserva nuevaReserva) throws ReservaSolapadaException {
        for (Reserva reserva : reservas) {
            if(comprobarFechaRango(reserva.getInicioReserva(), nuevaReserva.getInicioReserva(), nuevaReserva.getFinReserva())  ||
                comprobarFechaRango(reserva.getFinReserva(), nuevaReserva.getInicioReserva(), nuevaReserva.getFinReserva()) ){
                    throw new ReservaSolapadaException("La reserva se solapa con otra existente para el libro con ISBN: " + nuevaReserva.getLibro().getIsbn());
            }
        }
        reservas.add(nuevaReserva);
    }

    /**
     * Método para comprobar si una fecha está dentro de un rango de fechas dado
     * @param fechaComprobar Fecha a comprobar
     * @param fechaInicio Fecha de inicio del rango
     * @param fechaFin Fecha de fin del rango
     * @return true si la fecha a comprobar está dentro del rango (incluyendo los límites), false de lo contrario
     */
    private boolean comprobarFechaRango(LocalDate fechaComprobar, LocalDate fechaInicio, LocalDate fechaFin){
        return !fechaComprobar.isBefore(fechaInicio) && !fechaComprobar.isAfter(fechaFin);
    }
}
