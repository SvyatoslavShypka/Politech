package Zdarzenie_przyklad2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Example2 
{
	
	private JButton przycisk1;
	private JButton przycisk2;
	private int ile1, ile2;
	
	public static void main(String[] args) 
	{
		
		Event_Example2 apGUI = new Event_Example2();
		apGUI.doRysuj();
	}

	/*	Obs³uga zdarzeñ za pomoc¹ klas wewnêtrznych.
	Ka¿da klasa implementuje interfejs ActionListener, czyli przes³ania na swój sposób actionPerformed.
	(doœæ podobnie dzia³anie jak przy okreœlaniu komparatorów dla kolekcji ArrayList ...)*/
	
	class ReakcjaNaPrzycisk1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
			ile1++;
			przycisk1.setText("Zosta³em kliniêty razy " + ile1);
		}		
	}
	
	class ReakcjaNaPrzycisk2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			
			ile2++;
			przycisk2.setText("Zosta³em kliniêty razy " + ile2);
		}		
	}
	
	
	//Tworzenie prostego GUI__________________________________________
	public void doRysuj() {
		
		JFrame ramka = new JFrame();
		przycisk1 = new JButton("Kliknij mnie");
		przycisk2 = new JButton("Kliknij mnie");
	
		/*Teraz ju¿ obiektami nas³uchuj¹cymi (obserwatorami) przycisków 
		s¹ obiekty klas wewnêtrznych.
		Ka¿dy przycisk rejestruje swojego obserwatora*/
		przycisk1.addActionListener(new ReakcjaNaPrzycisk1());
		przycisk2.addActionListener(new ReakcjaNaPrzycisk2());
		
		JPanel panel = new JPanel();		
		ramka.getContentPane().add(panel);
		panel.add(przycisk1);
		panel.add(przycisk2);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setSize(500,300);
		ramka.setVisible(true);
	}
	//________________________________________________________________
}