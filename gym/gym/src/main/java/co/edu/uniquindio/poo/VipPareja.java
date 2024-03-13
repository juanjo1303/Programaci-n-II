package co.edu.uniquindio.poo;

public class VipPareja implements Vip{

    public VipPareja(){
        System.out.println("Membresia Vip para plan pareja creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 15;
    }

    @Override
    public float precioMembresia() {
        return 25000;
    }
}
