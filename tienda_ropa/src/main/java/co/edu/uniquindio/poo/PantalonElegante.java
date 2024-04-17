package co.edu.uniquindio.poo;

public class PantalonElegante implements Pantalon{


    public PantalonElegante(){
        System.out.println("Pantalon Elegante");
    }
    
    @Override
    public boolean tieneCremallera(){
        return true;
    }
}
