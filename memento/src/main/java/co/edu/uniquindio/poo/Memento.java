package co.edu.uniquindio.poo;

public class Memento {
    private final String estadoTexto;

    public Memento(String texto) {
        this.estadoTexto = texto;
    }

    public String getTextoGuardado() {
        return estadoTexto;
    }
}

