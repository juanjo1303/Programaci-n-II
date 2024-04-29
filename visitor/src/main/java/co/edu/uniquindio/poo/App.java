package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan");
        Gerente gerente = new Gerente("Sofía");

        InformeSalario informe = new InformeSalario();
        empleado.aceptar(informe);
        gerente.aceptar(informe);
    }
}

