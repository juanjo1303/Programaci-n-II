package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DirectorPizza pizzeria = new DirectorPizza();

        Pizza hawaiana = pizzeria.prepararPizzaHawaiana();
        System.out.println(hawaiana);

        Pizza carnivora = pizzeria.prepararPizzaCarnivora();
        System.out.println(carnivora);
    }
}
