package co.edu.uniquindio.poo;

public class TorreControl extends Colega {
    public TorreControl(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviar(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Torre de Control recibe: " + mensaje);
    }
}


