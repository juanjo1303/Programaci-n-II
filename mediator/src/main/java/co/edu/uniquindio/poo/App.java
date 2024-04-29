package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MediadorConcreto mediador = new MediadorConcreto();
        TorreControl torreControl = new TorreControl(mediador);
        Avion avion1 = new Avion(mediador, "123");
        Avion avion2 = new Avion(mediador, "456");

        mediador.agregarColega(torreControl);
        mediador.agregarColega(avion1);
        mediador.agregarColega(avion2);

        avion1.enviarMensaje("Solicitando permiso para aterrizar.");
        torreControl.enviarMensaje("Permiso concedido a Avión 123.");
        avion2.enviarMensaje("Solicitando permiso para despegar.");
    }
}

