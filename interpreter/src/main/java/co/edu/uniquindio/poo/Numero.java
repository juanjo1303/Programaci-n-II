package co.edu.uniquindio.poo;

public class Numero  implements Expresion{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return numero;
    }
}

