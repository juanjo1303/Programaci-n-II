package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

// Clase Pizza
public class Pizza {
    private String masa;
    private String salsa;
    private List<String> toppings;

    private Pizza(Builder builder) {
        this.masa = builder.masa;
        this.salsa = builder.salsa;
        this.toppings = builder.toppings;
    }

    // Método para mostrar la pizza construida
    public String toString() {
        return "Pizza con masa " + masa + ", salsa " + salsa + ", toppings " + toppings;
    }

    // Clase Builder anidada
    public static class Builder {
        private String masa;
        private String salsa;
        private List<String> toppings = new ArrayList<>();

        public Builder masa(String masa) {
            this.masa = masa;
            return this;
        }

        public Builder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder agregarTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
