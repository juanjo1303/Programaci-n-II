package co.edu.uniquindio.poo;

public class GoldCorriente implements Gold{

    public GoldCorriente(){
        System.out.println("Membresia Gold para plan corriente creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 20;
    }

    @Override
    public float precioMembresia() {
        return 40000;
    }

}
