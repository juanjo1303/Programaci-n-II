package co.edu.uniquindio.poo;

public class MembresiaParejaFactory implements MembresiaFactory{

    @Override
    public Estandard crearMembresiaEstandard() {
        return new EstandardPareja();
    }

    @Override
    public Vip crearMembresiaVip() {
        return new VipPareja();
    }

    @Override
    public Gold crearMembresiaGold() {
        return new GoldPareja();
    }

}
