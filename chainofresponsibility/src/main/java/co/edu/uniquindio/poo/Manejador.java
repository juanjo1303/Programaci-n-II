package co.edu.uniquindio.poo;
public  abstract class Manejador {
    protected Manejador sucesor;

    public void establecerSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

    public abstract void manejarMensaje(TipoMensaje tipo, String contenido);
}


