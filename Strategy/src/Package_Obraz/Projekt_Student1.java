package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.Sposob_2_NaWykonanieBinaryzacji;
import Package_AlgorytmyObrazuPreProcessing.Sposob_1_NaWykonaniePreProcessing;

public class Projekt_Student1 extends Obraz {

	/*W konstruktorze klasy Projektu Studenta ustawiamy jego kombinacje 
	algorytm�w - tj. kt�re dok�adnie sposoby na realizacje preprocessingu 
	oraz binaryzacji obrazu wykorzysta*/
	public Projekt_Student1() {
		
		PreProc = new Sposob_1_NaWykonaniePreProcessing();
		setAlgorytmInfoPreProcessing("Algorytm 1 na PreProcessing Obrazu Cyfrowego");
		
		BinObr = new Sposob_2_NaWykonanieBinaryzacji();
		setAlgorytmInfoBinaryzacja("Algorytm 2 na Binaryzacje Obrazu");
	}
	
	
	
	//Wy�wietlenie informacji, kt�ry student, z kt�rego algorytmu korzysta.
	@Override
	public void WyswietlInfo() {
		
		System.out.println("\nStudent 1 używa " + getAlgorytmInfoPreProcessing());
		System.out.println("Student 1 używa " + getAlgorytmInfoBinaryzacja());
	}

	
	//Inne Metody Studenta 1, dotycz�ce przetwarzania i analizy obrazu ...
	
}
