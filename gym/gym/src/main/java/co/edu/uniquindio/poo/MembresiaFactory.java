package co.edu.uniquindio.poo;

public interface MembresiaFactory {
    public abstract Estandard crearMembresiaEstandard();
    public abstract Vip crearMembresiaVip();
    public abstract Gold crearMembresiaGold();
}
