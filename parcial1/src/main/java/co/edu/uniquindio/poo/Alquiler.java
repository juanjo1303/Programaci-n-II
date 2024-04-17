package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Builder

public class Alquiler {
    private Cliente cliente;
    private LocalDateTime fechaRegistro;
    private Factura factura;
    private int numeroDias;
    private LocalDate fechaInicio;
    private Vehiculo vehiculo;
}
