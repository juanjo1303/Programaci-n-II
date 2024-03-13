package co.edu.uniquindio.poo;

public class VipEstudiante implements Vip{

    public VipEstudiante(){
        System.out.println("Membresia Vip para plan estudiante creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 17;
    }

    @Override
    public float precioMembresia() {
        return 30000;
    }
}
