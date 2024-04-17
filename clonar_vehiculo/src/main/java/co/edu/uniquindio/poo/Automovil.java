package co.edu.uniquindio.poo;

public class Automovil implements Clonable{
    private String nombre;
    private String color;
    private Llanta delanteraDerecha;
    private Llanta delanteraIzquierda;
    private Llanta traseraDerecha;
    private Llanta traseraIzquierda;
    
    public Automovil(String nombre, String color, Llanta delanteraDerecha, Llanta delanteraIzquierda,
            Llanta traseraDerecha, Llanta traseraIzquierda) {
        this.nombre = nombre;
        this.color = color;
        this.delanteraDerecha = delanteraDerecha;
        this.delanteraIzquierda = delanteraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.traseraIzquierda = traseraIzquierda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llanta getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Llanta delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Llanta getDelanteraIzquierda() {
        return delanteraIzquierda;
    }

    public void setDelanteraIzquierda(Llanta delanteraIzquierda) {
        this.delanteraIzquierda = delanteraIzquierda;
    }

    public Llanta getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Llanta traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Llanta getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Llanta traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    @Override
    public Clonable clonar() {
        String nombre = this.nombre;
        Llanta delanteraDerecha = (Llanta) this.getDelanteraDerecha().clonar();
        Llanta delanteraIzquierda = (Llanta) this.getDelanteraIzquierda().clonar();
        Llanta traseraDerecha = (Llanta) this.getTraseraDerecha().clonar();
        Llanta traseraIzquierda = (Llanta) this.getTraseraIzquierda().clonar();
        return new Automovil(
            nombre, color, delanteraDerecha, delanteraIzquierda,
            traseraDerecha, traseraIzquierda
        );
    }
}   