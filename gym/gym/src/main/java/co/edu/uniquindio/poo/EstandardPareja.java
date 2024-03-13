package co.edu.uniquindio.poo;

public class EstandardPareja implements Estandard{

    public EstandardPareja(){
        System.out.println("Membresia Estandard para plan pareja creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 10;
    }

    @Override
    public float precioMembresia() {
        return 15000;
    }
}
