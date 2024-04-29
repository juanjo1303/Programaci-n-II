package co.edu.uniquindio.poo;

public class Empleado implements Visitable {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarEmpleado(this);
    }
}

