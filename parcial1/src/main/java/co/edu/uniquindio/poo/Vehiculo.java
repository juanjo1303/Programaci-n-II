package co.edu.uniquindio.poo;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Builder

public class Vehiculo {
    private int modelo;
    private float precioDia;
    private Marca marca;
    private int kilometraje;
    private String foto;
    private String placa;
    private String referencia;
    private TipoVehiculo tipo;
}
