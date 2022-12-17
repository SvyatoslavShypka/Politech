package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.Sposob_1_NaWykonanieBinaryzacji;
import Package_AlgorytmyObrazuPreProcessing.Sposob_2_NaWykonaniePreProcessing;

public class Projekt_Student2 extends Obraz {

	
	
	/*W konstruktorze klasy Projektu Studenta ustawiamy jego kombinacje 
	algorytm�w - tj. kt�re dok�adnie sposoby na realizacje preprocessingu 
	oraz binaryzacji obrazu wykorzysta*/
	public Projekt_Student2() {
		
		PreProc = new Sposob_2_NaWykonaniePreProcessing();
		setAlgorytmInfoPreProcessing("Algorytm 2 na PreProcessing Obrazu Cyfrowego");
		
		BinObr = new Sposob_1_NaWykonanieBinaryzacji();
		setAlgorytmInfoBinaryzacja("Algorytm 1 na Binaryzacje Obrazu");
	}
	
	
	//Wy�wietlenie informacji, kt�ry student, z kt�rego algorytmu korzysta.
	@Override
	public void WyswietlInfo() {
		
		System.out.println("\nStudent 2 u�ywa " + getAlgorytmInfoPreProcessing());
		System.out.println("Student 2 u�ywa " + getAlgorytmInfoBinaryzacja());
	}

	
	//Inne Metody Studenta 2, dotycz�ce przetwarzania i analizy obrazu ...
	
}
