import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sniadanie {

    private JButton akceptujButton;
    private double suma;
    private JCheckBox rogalikCheckBox;
    private JCheckBox jajecznicaCheckBox;
    private JCheckBox herbataCheckBox;
    private JCheckBox kawaCheckBox;
    private JTextField mojeSniadanieJTextField;
    private JTextField kwotaDoZaplatyJTextField;

    public static void main(String[] args) {

        Sniadanie start = new Sniadanie();
        start.doRysuj();
    }

    class ReakcjaNaPrzycisk implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

            suma = 0;
            String menu = "";
            if (rogalikCheckBox.isSelected()) {
                suma+=5.0;
                menu += rogalikCheckBox.getText().split(" ")[0] + ",";
            }
            if (jajecznicaCheckBox.isSelected()) {
                suma+=15.0;
                menu += jajecznicaCheckBox.getText().split(" ")[0] + ",";
            }
            if (herbataCheckBox.isSelected()) {
                suma+=4.0;
                menu += herbataCheckBox.getText().split(" ")[0] + ",";
            }
            if (kawaCheckBox.isSelected()) {
                suma+=6.0;
                menu += kawaCheckBox.getText().split(" ")[0] + ",";
            }

            kwotaDoZaplatyJTextField.setText(" " + suma);
            mojeSniadanieJTextField.setText(menu);

//            akceptujButton.setText(" " + suma);
        }
    }

    private void doRysuj() {

        JFrame ramka = new JFrame();
        ramka.setTitle("Sniadanie");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(BorderLayout.WEST, panel1);
        ramka.getContentPane().add(BorderLayout.EAST, panel2);

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        rogalikCheckBox = new JCheckBox("Rogalik – 5 z³");
        jajecznicaCheckBox = new JCheckBox("Jajecznica – 15 z³");
        herbataCheckBox = new JCheckBox("Herbata – 4 z³");
        kawaCheckBox = new JCheckBox("Kawa – 6 z³");
        akceptujButton = new JButton("Akceptuj");
        akceptujButton.addActionListener(new ReakcjaNaPrzycisk());
        panel1.add(new JLabel("Menu"));
        panel1.add(rogalikCheckBox);
        panel1.add(jajecznicaCheckBox);
        panel1.add(herbataCheckBox);
        panel1.add(kawaCheckBox);
        panel1.add(akceptujButton);

        mojeSniadanieJTextField = new JTextField();
        kwotaDoZaplatyJTextField = new JTextField();

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(new JLabel("Moje œniadanie"));
        panel2.add(mojeSniadanieJTextField);
        panel2.add(new JLabel("Kwota do zap³aty:"));
        panel2.add(kwotaDoZaplatyJTextField);

        ramka.setSize(300,200);

//        ramka.pack();
        ramka.setResizable(false);
        ramka.setVisible(true);

    }
}
