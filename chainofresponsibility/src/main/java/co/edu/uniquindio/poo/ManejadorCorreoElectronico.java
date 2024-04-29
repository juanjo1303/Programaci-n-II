package co.edu.uniquindio.poo;

public class ManejadorCorreoElectronico extends Manejador {
    @Override
    public void manejarMensaje(TipoMensaje tipo, String contenido) {
        if (tipo == TipoMensaje.CORREOELECTRONICO) {
            System.out.println("Manejando correo electrónico: " + contenido);
        } else if (sucesor != null) {
            sucesor.manejarMensaje(tipo, contenido);
        }
    }
}

