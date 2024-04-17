import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Triqui extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private boolean xTurn = true;

    public Triqui() {
        setTitle("Triqui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("")) {
            if (xTurn) {
                button.setText("X");
            } else {
                button.setText("O");
            }

            xTurn = !xTurn;

            if (checkWin()) {
                JOptionPane.showMessageDialog(this, (xTurn ? "O" : "X") + " wins!");
                resetBoard();
            } else if (isBoardFull()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetBoard();
            }
        }
    }

    private boolean checkWin() {
        for(int i = 0; i < 3; i++){
            if (!buttons[0][2].getText().isBlank() && !buttons[1][1].getText().isBlank() && !buttons[2][0].getText().isBlank()){
                if(buttons[0][2].getText() != buttons[1][1].getText() && buttons[2][0].getText() != buttons[1][1].getText()){
                    return false;
                } else {return true;}
            }
            if (!buttons[i][0].getText().isBlank() && !buttons[i][1].getText().isBlank() && !buttons[i][2].getText().isBlank()){
                if(buttons[i][0].getText() != buttons[i][1].getText() && buttons[i][1].getText() != buttons[i][2].getText()){
                    return false;
                } else {return true;}
            }
            if (!buttons[0][0].getText().isBlank() && !buttons[1][1].getText().isBlank() && !buttons[2][2].getText().isBlank()){
                if(buttons[0][0].getText() != buttons[1][1].getText() && buttons[2][2].getText() != buttons[1][1].getText()){
                    return false;
                } else {return true;}
            }
            if (!buttons[0][i].getText().isBlank() && !buttons[1][i].getText().isBlank() && !buttons[2][i].getText().isBlank()){
                if(buttons[0][i].getText() != buttons[1][i].getText() && buttons[1][i].getText() != buttons[2][i].getText()){
                    return false;
                } else {return true;}
            }
        }
        return false;
    }

/*
    private boolean checkWin() {
            String aux1 = "";
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    aux1 = buttons[i][0].getText();
                }
            }
            return false;
        }
*/   

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        xTurn = true;
    }

    public static void main(String[] args) {
        new Triqui();
    }
}
