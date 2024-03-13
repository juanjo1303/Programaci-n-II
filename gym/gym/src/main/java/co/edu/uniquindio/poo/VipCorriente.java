package co.edu.uniquindio.poo;

public class VipCorriente implements Vip{

    public VipCorriente(){
        System.out.println("Membresia Vip para plan corriente creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 15;
    }

    @Override
    public float precioMembresia() {
        return 35000;
    }
}
