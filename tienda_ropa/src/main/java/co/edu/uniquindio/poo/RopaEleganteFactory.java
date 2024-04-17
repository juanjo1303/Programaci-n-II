package co.edu.uniquindio.poo;

public class RopaEleganteFactory implements RopaFactory{

    @Override
    public Zapato crearZapato() {
        return new ZapatoElegante();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaElegante();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonElegante();
    }
}
