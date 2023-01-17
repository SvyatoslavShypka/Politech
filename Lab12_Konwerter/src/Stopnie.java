import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopnie {


    private JButton clearButton;
    private double daneCelsjusz;
    private double daneFahrenheit;
    private JLabel celsjuszJLabel;
    private JLabel fahrenheitJLabel;
    private JTextField celsjuszJTextField;
    private JTextField fahrenheitJTextField;

    public static void main(String[] args) {

        Stopnie start = new Stopnie();
        start.doRysuj();
    }

    class ReakcjaNaPrzycisk implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            celsjuszJTextField.setText("");
            fahrenheitJTextField.setText("");
            daneCelsjusz = 0;
            daneFahrenheit = 0;
        }
    }

    private void doRysuj() {

        JFrame ramka = new JFrame();
        ramka.setTitle("Konwerter stopni");

        JPanel panel = new JPanel();
        clearButton = new JButton("Wyczyœæ pola");
        clearButton.addActionListener(new ReakcjaNaPrzycisk());
        celsjuszJLabel = new JLabel("Celsiusz");
        celsjuszJTextField = new JTextField("");
        celsjuszJTextField.addActionListener(new ReakcjaNaPoleCelsjusz());
        fahrenheitJLabel = new JLabel("Fahrenheit");
        fahrenheitJTextField = new JTextField("");
        fahrenheitJTextField.addActionListener(new ReakcjaNaPoleFahrenheit());

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(panel);
        panel.setLayout(new GridLayout(3,2));
        panel.add(celsjuszJLabel);
        panel.add(celsjuszJTextField);
        panel.add(fahrenheitJLabel);
        panel.add(fahrenheitJTextField);
        panel.add(clearButton);

        ramka.setSize(350,150);

        ramka.setResizable(false);
        ramka.setVisible(true);

    }

    private class ReakcjaNaPoleCelsjusz implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                daneCelsjusz = Double.parseDouble(celsjuszJTextField.getText());
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Nieprawid³owy format liczby", "", JOptionPane.ERROR_MESSAGE);
            }
            fahrenheitJTextField.setText(Konwerter.CelsiuszToFahrenheit(daneCelsjusz));
        }
    }

    private class ReakcjaNaPoleFahrenheit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                daneFahrenheit = Double.parseDouble(fahrenheitJTextField.getText());
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Nieprawid³owy format liczby", "", JOptionPane.ERROR_MESSAGE);
            }
            celsjuszJTextField.setText(Konwerter.FahrenheitToCelsiusz(daneFahrenheit));
        }
    }
}
