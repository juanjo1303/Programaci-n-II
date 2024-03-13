package co.edu.uniquindio.poo;

public class MembresiaEstudianteFactory implements MembresiaFactory{

    @Override
    public Estandard crearMembresiaEstandard() {
        return new EstandardEstudiante();
    }

    @Override
    public Vip crearMembresiaVip() {
        return new VipEstudiante();
    }

    @Override
    public Gold crearMembresiaGold() {
        return new GoldEstudiante();
    }
    
}   
