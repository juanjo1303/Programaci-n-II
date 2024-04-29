package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
   
            public static void main(String[] args) {
                // Representa la expresión (5 + 7) - 2
                Expresion expresion = new Resta(
                    new Suma(
                        new Numero(5),
                        new Numero(7)
                    ),
                    new Numero(2)
                );
        
                System.out.println("El resultado de la expresión es: " + expresion.interpretar());
            }
        }
    
