package co.edu.uniquindio.poo;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Builder

public class Cliente {
    private String cedula;
    private String direccion;
    private String email;
    private String telefono;
    private String nombreCompleto;
    private String ciudad;
}
