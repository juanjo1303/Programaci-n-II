package co.edu.uniquindio.poo;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Reserva {
    private Libro libro;
    private Persona persona;
    private LocalDate inicioReserva;
    private LocalDate finReserva;
}
