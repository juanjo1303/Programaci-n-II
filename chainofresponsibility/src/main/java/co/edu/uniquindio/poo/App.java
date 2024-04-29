package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Manejador manejadorCorreo = new ManejadorCorreoElectronico();
        Manejador manejadorSMS = new ManejadorSMS();
        Manejador manejadorVoz = new ManejadorMensajeVoz();

        manejadorCorreo.establecerSucesor(manejadorSMS);
        manejadorSMS.establecerSucesor(manejadorVoz);

        manejadorCorreo.manejarMensaje(TipoMensaje.CORREOELECTRONICO, "Este es un correo electrónico de prueba.");
        manejadorCorreo.manejarMensaje(TipoMensaje.SMS, "Este es un mensaje de SMS de prueba.");
        manejadorCorreo.manejarMensaje(TipoMensaje.MENSAJEVOZ, "Este es un mensaje de voz de prueba.");
    }
}
