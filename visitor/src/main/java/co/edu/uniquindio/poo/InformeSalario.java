package co.edu.uniquindio.poo;

public class InformeSalario implements Visitor {
    @Override
    public void visitarEmpleado(Empleado empleado) {
        System.out.println("Generando informe de salario para empleado: " + empleado.getNombre());
    }

    @Override
    public void visitarGerente(Gerente gerente) {
        System.out.println("Generando informe de salario para gerente: " + gerente.getNombre());
    }
}

