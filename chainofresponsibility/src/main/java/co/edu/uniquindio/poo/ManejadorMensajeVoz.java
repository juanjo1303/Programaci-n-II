package co.edu.uniquindio.poo;

public class ManejadorMensajeVoz extends Manejador {
    @Override
    public void manejarMensaje(TipoMensaje tipo, String contenido) {
        if (tipo == TipoMensaje.MENSAJEVOZ) {
            System.out.println("Manejando mensaje de voz: " + contenido);
        } else if (sucesor != null) {
            sucesor.manejarMensaje(tipo, contenido);
        }
    }
}

