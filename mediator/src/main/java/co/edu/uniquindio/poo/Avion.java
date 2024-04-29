package co.edu.uniquindio.poo;

public class Avion extends Colega {
    private String id;

    public Avion(Mediador mediador, String id) {
        super(mediador);
        this.id = id;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviar("Avión " + id + ": " + mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Avión " + id + " recibe: " + mensaje);
    }
}


