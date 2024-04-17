package co.edu.uniquindio.poo;

public class Llanta implements Clonable{
    private float psi;
    private boolean pinchada;
    private final Marca marca;

    public Llanta(float psi, Marca marca) {
        this.psi = psi;
        this.marca = marca;
        pinchada = false;
    }

    public float getPsi() {
        return psi;
    }

    public Marca getMarca() {
        return marca;
    }

    public boolean isPinchada() {
        return pinchada;
    }

    public void setPsi(float psi) {
        this.psi = psi;
        pinchada = psi == 0;
    }

    public void setPinchada(boolean pinchada) {
        this.pinchada = pinchada;
    }

    @Override
    public String toString() {
        return "Llanta [psi=" + psi + ", pinchada=" + pinchada + ", marca=" + marca + "]";
    }

    @Override
    public Clonable clonar() {
        return new Llanta(this.psi, this.marca);
    }

}