package co.edu.uniquindio.poo;

public class EstandardEstudiante implements Estandard{

    public EstandardEstudiante(){
        System.out.println("Membresia Estandard para plan estudiante creada - " + "Precio= " + precioMembresia());
    } 

    @Override
    public int tiempoGym() {
        return 12;
    }

    @Override
    public float precioMembresia() {
        return 20000;
    }
}
