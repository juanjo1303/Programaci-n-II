package co.edu.uniquindio.poo;

public class GoldEstudiante implements Gold{

    public GoldEstudiante(){
        System.out.println("Membresia Gold para plan estudiante creada - " + "Precio= " + precioMembresia());
    }

    @Override
    public int tiempoGym() {
        return 22;
    }

    @Override
    public float precioMembresia() {
        return 35000;
    }
}
