package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    Llanta miLlanta = new Llanta(35, Marca.PIRELI);

        Automovil miCarro = new Automovil("Onix", "Verde",
            miLlanta,
            (Llanta) miLlanta.clonar(), 
            (Llanta) miLlanta.clonar(), 
            (Llanta) miLlanta.clonar()
        );
        Automovil miCarro2 = (Automovil) miCarro.clonar();
        Automovil miCarro3 = (Automovil) miCarro.clonar();

        miCarro.getDelanteraDerecha().setPsi(0);
        miCarro.getTraseraIzquierda().setPsi(15);
        miCarro2.setNombre("miCarro2");
        miCarro3.setNombre("miCarro3");

        miCarro2.getTraseraIzquierda().setPsi(11);

        miCarro3.getTraseraIzquierda().setPsi(13);
        //Carro miCarro2 = new Carro("miCarro2" ,miLlanta, miLlanta2, miLlanta3, miLlanta4);
        System.out.println(miCarro);
        System.out.println(miCarro2);
        System.out.println(miCarro3);
    }
}
