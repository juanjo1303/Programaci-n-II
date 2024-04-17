package co.edu.uniquindio.poo;

public class CamisaElegante implements Camisa{

    public CamisaElegante(){
        System.out.println("Camisa Elegante");
    }
    
    @Override
    public boolean mangaLarga(){
        return true;
    }
}
