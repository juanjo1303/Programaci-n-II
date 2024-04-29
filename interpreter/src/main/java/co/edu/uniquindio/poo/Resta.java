package co.edu.uniquindio.poo;

public class Resta implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Resta(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        return izquierda.interpretar() - derecha.interpretar();
    }
}

