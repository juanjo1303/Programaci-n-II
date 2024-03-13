package co.edu.uniquindio.poo;

public class GoldPareja implements Gold{

    public GoldPareja(){
        System.out.println("Membresia Gold para plan pareja creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 20;
    }

    @Override
    public float precioMembresia() {
        return 25000;
    }

}
