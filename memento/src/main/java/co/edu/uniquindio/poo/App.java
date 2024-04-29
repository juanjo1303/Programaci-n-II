package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Cuidador cuidador = new Cuidador();

        editor.setTexto("Primera línea de texto");
        cuidador.guardarEstado(editor);

        editor.setTexto("Segunda línea de texto");
        cuidador.guardarEstado(editor);

        editor.setTexto("Tercera línea de texto");

        // Deshacer cambios
        cuidador.deshacer(editor);
        System.out.println(editor.getTexto()); // Segunda línea de texto

        cuidador.deshacer(editor);
        System.out.println(editor.getTexto()); // Primera línea de texto
    }
}

