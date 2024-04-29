package co.edu.uniquindio.poo;

public class EditorTexto {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Memento guardarEnMemento() {
        return new Memento(texto);
    }

    public void restaurarDesdeMemento(Memento memento) {
        texto = memento.getTextoGuardado();
    }
}
