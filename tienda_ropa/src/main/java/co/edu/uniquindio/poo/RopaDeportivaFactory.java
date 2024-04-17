package co.edu.uniquindio.poo;

public class RopaDeportivaFactory implements RopaFactory{

    @Override
    public Zapato crearZapato() {
        return new ZapatoDeportivo();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaDeportiva();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonDeportivo();
    }
}
