package co.edu.uniquindio.poo;

public class Gerente implements Visitable {
    private String nombre;

    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarGerente(this);
    }
}

