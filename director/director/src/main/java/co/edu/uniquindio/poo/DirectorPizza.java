package co.edu.uniquindio.poo;

// Clase Director
public class DirectorPizza {
    public Pizza prepararPizzaHawaiana() {
        return new Pizza.Builder()
                .masa("suave")
                .salsa("dulce")
                .agregarTopping("piña")
                .agregarTopping("jamón")
                .build();
    }

    public Pizza prepararPizzaCarnivora() {
        return new Pizza.Builder()
                .masa("crispy")
                .salsa("barbacoa")
                .agregarTopping("pepperoni")
                .agregarTopping("salchicha")
                .agregarTopping("carne")
                .build();
    }
}