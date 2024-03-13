package co.edu.uniquindio.poo;

public class MembresiaCorrienteFactory implements MembresiaFactory{

    @Override
    public Estandard crearMembresiaEstandard() {
        return new EstandardCorriente();
    }

    @Override
    public Vip crearMembresiaVip() {
        return new VipCorriente();
    }

    @Override
    public Gold crearMembresiaGold() {
        return new GoldCorriente();
    }

}
