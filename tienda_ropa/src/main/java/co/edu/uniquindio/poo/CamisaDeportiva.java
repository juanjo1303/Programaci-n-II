package co.edu.uniquindio.poo;

public class CamisaDeportiva implements Camisa{

    public CamisaDeportiva(){
        System.out.println("Camisa Deportiva");
    }
    
    @Override
    public boolean mangaLarga(){
        return false;
    }
}
