package co.edu.uniquindio.poo;

public abstract class Colega {
    protected Mediador mediador;

    public Colega(Mediador mediador) {
        this.mediador = mediador;
    }

    public abstract void enviarMensaje(String mensaje);
    public abstract void recibirMensaje(String mensaje);
}

