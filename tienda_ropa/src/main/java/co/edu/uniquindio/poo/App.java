package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        
        RopaFactory ropaDeportivaFactory = new RopaDeportivaFactory();
        RopaFactory ropaEleganteFactory = new RopaEleganteFactory();

        Camisa camisaDeportiva = ropaDeportivaFactory.crearCamisa();
        Pantalon pantalonDeportivo = ropaDeportivaFactory.crearPantalon();
        Zapato zapatoDeportivo = ropaDeportivaFactory.crearZapato();
        System.out.println("-------------------------------------------");
        Camisa camisaElegante = ropaEleganteFactory.crearCamisa();
        Pantalon pantalonElegante = ropaEleganteFactory.crearPantalon();
        Zapato zapatoElegante = ropaEleganteFactory.crearZapato();
    }
}
