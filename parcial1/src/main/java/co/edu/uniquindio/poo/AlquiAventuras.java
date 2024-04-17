package co.edu.uniquindio.poo;

import java.util.ArrayList;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Builder

public class AlquiAventuras {
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Alquiler> alquileres;
}
