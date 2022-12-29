package Zdarzenie_przyklad1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_example1 implements ActionListener 
{
	
	
	//Sk³adowe klasy____________________
	private JButton przycisk1;
	private JButton przycisk2;
	private int ile1, ile2;
	//__________________________________
	
	
	public static void main(String[] args) 
	{
		
		Event_example1 apGUI = new Event_example1();
		apGUI.doRysuj();
	}
	
	
	//Tworzenie prostego GUI________________________________________________
	public void doRysuj() 
	{
		
		JFrame ramka = new JFrame();
		przycisk1 = new JButton("Kliknij mnie");
		przycisk2 = new JButton("Kliknij mnie");
	
		
		przycisk1.addActionListener(this);
		przycisk2.addActionListener(this);
		
		JPanel panel = new JPanel();		
		ramka.getContentPane().add(panel);
		panel.add(przycisk1);
		panel.add(przycisk2);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setSize(500,300);
		ramka.setVisible(true);
	}	
	//_______________________________________________________________________

/*	Obiekt zainteresowany Ÿród³em zdarzeñ (dzia³aniem przycisków) jest obiektem klasy 
	Event_example1 (czyli obiekt bie¿¹cy - wskazywany przez this) 
	On rejestruje siê jako 'nas³uchiwacz' zdarzeñ generowanych przez przyciski.
	Oznacza to, ¿e jego klasa musi implementowaæ interfejs ActionListener, a wiêc równie¿
	przes³oniæ metodê: actionPerformed, która jest reakcj¹ na zdarzenie.

	Dodatkowo, obiekt zdarzenia przekazywany do metody actionPerformed identyfikuje Ÿród³o zdarzenia.*/
	public void actionPerformed(ActionEvent zdarzenie) 
	{
		
		if (zdarzenie.getSource() == przycisk1) 
		{
			ile1++;
			przycisk1.setText("Zosta³em kliniêty razy " + ile1);
		}
		
		if (zdarzenie.getSource() == przycisk2) 
		{
			ile2++;
			przycisk2.setText("Zosta³em kliniêty razy " + ile2);
		}		
	}
}