package co.edu.uniquindio.poo;

public class EstandardCorriente implements Estandard{

    public EstandardCorriente(){
        System.out.println("Membresia Estandard para plan corriente creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 10;
    }

    @Override
    public float precioMembresia() {
        return 25000;
    }
}
