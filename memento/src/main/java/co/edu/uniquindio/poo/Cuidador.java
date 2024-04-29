package co.edu.uniquindio.poo;

import java.util.Stack;

public class Cuidador {
    private Stack<Memento> historial = new Stack<>();

    public void guardarEstado(EditorTexto editor) {
        historial.push(editor.guardarEnMemento());
    }

    public void deshacer(EditorTexto editor) {
        if (!historial.isEmpty()) {
            editor.restaurarDesdeMemento(historial.pop());
        }
    }
}

