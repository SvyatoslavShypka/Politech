package Package_Main;

import Package_AlgorytmyObrazuBinaryzacja.Sposob_1_NaWykonanieBinaryzacji;
import Package_AlgorytmyObrazuPreProcessing.Sposob_2_NaWykonaniePreProcessing;
import Package_Obraz.Projekt_Student1;
import Package_Obraz.Projekt_Student2;


public class Projekt_Obraz {

	public static void main(String[] args) {
		
		//Praca Studenta 1_______________________________
		Projekt_Student1 st1 = new Projekt_Student1();
		st1.wykonajStartegie(1);		
		st1.wykonajStartegie(2);		
		st1.WyswietlInfo();
		//_______________________________________________
		
		System.out.println("\n\n");
		
		//Praca Studenta 2_______________________________
		Projekt_Student2 st2 = new Projekt_Student2();
		st2.wykonajStartegie(1);	
		st2.wykonajStartegie(2);			
		st2.WyswietlInfo();
		//_______________________________________________
		
		System.out.println("\n\n Zmiana Algorytm�w \n______________________________________________________________________");
		
		
		//Student2 decyduje u�y� Algorytmu nr 1 na PreProcessing !_______________________________________
		st2.ustawNowaStrategia(1, new Sposob_2_NaWykonaniePreProcessing(), "Algorytm 2 na PreProcessing", null, "");
		st2.wykonajStartegie(1);	
		st2.WyswietlInfo();
		//_______________________________________________________________________________________________
		
		
		//Student1 decyduje u�y� Algorytmu nr 1 na Binaryzacj� !_______________________________________________
		st1.ustawNowaStrategia(2, null, "", new Sposob_1_NaWykonanieBinaryzacji(), "Algorytm 1 na Binaryzacj� Obrazu");
		st1.wykonajStartegie(2);	
		st1.WyswietlInfo();
		//_____________________________________________________________________________________________________
	}

}
