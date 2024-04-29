package co.edu.uniquindio.poo;

public class ManejadorSMS  extends Manejador{
    @Override
    public void manejarMensaje(TipoMensaje tipo, String contenido) {
        if (tipo == TipoMensaje.SMS) {
            System.out.println("Manejando SMS: " + contenido);
        } else if (sucesor != null) {
            sucesor.manejarMensaje(tipo, contenido);
        }
    }
}


