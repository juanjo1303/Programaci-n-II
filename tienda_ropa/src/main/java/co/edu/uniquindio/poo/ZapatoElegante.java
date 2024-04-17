package co.edu.uniquindio.poo;

public class ZapatoElegante implements Zapato{

    public ZapatoElegante(){
        System.out.println("Zapato Elegante");
    }

    @Override
    public boolean sonParaCorrer(){
        return false;
    }
}
