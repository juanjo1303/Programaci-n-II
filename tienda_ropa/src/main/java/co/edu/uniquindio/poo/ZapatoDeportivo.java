package co.edu.uniquindio.poo;

public class ZapatoDeportivo implements Zapato{

    public ZapatoDeportivo(){
        System.out.println("Zapato Deportivo");
    }

    @Override
    public boolean sonParaCorrer(){
        return true;
    }
}
