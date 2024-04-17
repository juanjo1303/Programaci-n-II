package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Builder

public class Factura {
    private LocalDateTime fecha;
    private float subtotal;
    private String codigoFactura;
    private float total;
}
