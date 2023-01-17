import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopnie {


    private JButton clearButton;
    private double wynik;
    private JLabel celsiusJLabel;
    private JLabel fahrenheitJLabel;
    private JTextField celsiusJTextField;
    private JTextField fahrenheitJTextField;

    public static void main(String[] args) {

        Stopnie start = new Stopnie();
        start.doRysuj();
    }

    class ReakcjaNaPrzycisk implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

            wynik = 0;
            String menu = "";

            celsiusJTextField.setText(" " + wynik);
            fahrenheitJTextField.setText(menu);

        }
    }

    private void doRysuj() {

        JFrame ramka = new JFrame();
        ramka.setTitle("Konwerter stopni");

        JPanel panel = new JPanel();
        clearButton = new JButton("Wyczyœæ pola");
        clearButton.addActionListener(new ReakcjaNaPrzycisk());
        celsiusJLabel = new JLabel("Celsiusz");
        celsiusJTextField = new JTextField("");
        fahrenheitJLabel = new JLabel("Fahrenheit");
        fahrenheitJTextField = new JTextField("");

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(panel);
        panel.setLayout(new GridLayout(3,2));
        panel.add(celsiusJLabel);
        panel.add(celsiusJTextField);
        panel.add(fahrenheitJLabel);
        panel.add(fahrenheitJTextField);
        panel.add(clearButton);

        ramka.setSize(350,150);

        ramka.setResizable(false);
        ramka.setVisible(true);

    }

}
