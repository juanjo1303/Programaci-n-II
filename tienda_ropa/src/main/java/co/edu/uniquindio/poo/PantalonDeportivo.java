package co.edu.uniquindio.poo;

public class PantalonDeportivo implements Pantalon{

    public PantalonDeportivo(){
        System.out.println("Pantalon Deportivo");
    }
    
    @Override
    public boolean tieneCremallera(){
        return false;
    }
}
