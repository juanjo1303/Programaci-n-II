import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaInterfaz extends JFrame {
    private JTextField textField;
    private JButton addButton;
    private JButton removeButton;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public ListaInterfaz() {
        // Configura el frame
        setTitle("Manejo de Lista");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializa el modelo de la lista y la lista
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);

        // Panel para los controles
        JPanel panel = new JPanel();
        textField = new JTextField(20);
        addButton = new JButton("Agregar");
        removeButton = new JButton("Quitar");

        panel.add(textField);
        panel.add(addButton);
        panel.add(removeButton);
        add(panel, BorderLayout.SOUTH);

        // Agrega funcionalidad a los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().trim().isEmpty()) {
                    listModel.addElement(textField.getText().trim());
                    textField.setText("");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaInterfaz().setVisible(true);
            }
        });
    }
}
