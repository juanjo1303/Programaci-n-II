package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MembresiaFactory membresiaCorrienteFactory = new MembresiaCorrienteFactory();
        MembresiaFactory membresiaEstudianteFactory = new MembresiaEstudianteFactory();
        MembresiaFactory membresiaParejFactory = new MembresiaParejaFactory();

        Estandard estandardEstudiante = membresiaEstudianteFactory.crearMembresiaEstandard();
        Estandard estandardCorriente = membresiaCorrienteFactory.crearMembresiaEstandard();
        Estandard entandardPareja = membresiaParejFactory.crearMembresiaEstandard();

        Vip vipEstudiante = membresiaEstudianteFactory.crearMembresiaVip();
        Vip vipCorriente = membresiaCorrienteFactory.crearMembresiaVip();
        Vip vipPareja = membresiaParejFactory.crearMembresiaVip();

        Gold goldEstudiante = membresiaEstudianteFactory.crearMembresiaGold();
        Gold goldCorriente = membresiaCorrienteFactory.crearMembresiaGold();
        Gold goldPareja = membresiaParejFactory.crearMembresiaGold();
    }
}
