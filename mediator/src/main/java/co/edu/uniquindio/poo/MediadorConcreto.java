package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador {
    private List<Colega> colegas;

    public MediadorConcreto() {
        colegas = new ArrayList<>();
    }

    public void agregarColega(Colega colega) {
        colegas.add(colega);
    }

    @Override
    public void enviar(String mensaje, Colega colegaOrigen) {
        for (Colega colega : colegas) {
            if (colega != colegaOrigen) {
                colega.recibirMensaje(mensaje);
            }
        }
    }
}

