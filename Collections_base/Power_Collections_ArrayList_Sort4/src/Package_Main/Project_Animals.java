package Package_Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Zwierze.*;

public class Project_Animals {

	//Sk�adowe Klasy________________________
	private ArrayList<Zwierze> animals;		
	//To s� nasze komparatory	
	private ZwierzeCompare_WabiSie Comparator1;
	private ZwierzeCompare_Wiek Comparator2;
	//______________________________________
	
	//Konstruktor klasy_____________________
	public Project_Animals()
	{
		animals = new ArrayList<Zwierze>();
	}
	
	//*****************************************************
	public static void main(String[] args) {
		
		Project_Animals ob_animals = new Project_Animals();
		
		ob_animals.Create_Animals();
		
		ob_animals.CreateComparators();
		
		//Sortowanie po 'Wabi si�'
		Collections.sort(ob_animals.getAnimals(), ob_animals.getComparator1());				
		ob_animals.View_Animals();
		
		System.out.println("\n");
		
		//Sortowanie po 'Wieku'
		Collections.sort(ob_animals.getAnimals(), ob_animals.getComparator2());				
		ob_animals.View_Animals();

	}
	//******************************************************

	////////////////////////////////////////////////////////////////////////////////////
	
	
/*	Jak najbardziej, w JAVIE mo�emy tworzy� klasy wewn�trzne, tzn. okre�li� klas� w klasie.
	Klasy wewn�trzne (ich metody), maj� dost�p do sk�adowych klasy zewn�trznej (nawet tych prywatnych).
	Sens korzystania z nich stanowi mo�liwo�� przes�aniania metod implementowanego interfejsu na r�ne sposoby.

	Tzn. gdyby klasa podstawowa implementowa�a interfejs Comparator, 
	to mo�liwo�� przes�oni�cia metody z interfejsu by�aby tylko jedna, a oznacza to, �e okre�liliby�my tylko jeden spos�b sortowania.

	Korzystaj�c z klas wewn�trznych, umo�liwiamy tworzenie wielu komparator�w, czyli wiele sposob�w na sortowanie ArrayList'y.
*/	
	//Klasy Wewn�trzne	
	class ZwierzeCompare_WabiSie implements Comparator<Zwierze> 
	{
		public int compare(Zwierze zw1, Zwierze zw2) 
		{
			return zw1.getZwierze_Wabi_sie().compareTo(zw2.getZwierze_Wabi_sie());
		}
	}
	
	class ZwierzeCompare_Wiek implements Comparator<Zwierze> 
	{
		public int compare(Zwierze zw1, Zwierze zw2) 
		{		
			if (zw1.getZwierze_Wiek()<zw2.getZwierze_Wiek()) return -1;	
			if (zw1.getZwierze_Wiek()>zw2.getZwierze_Wiek()) return 1;
			return 0;
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	

	//Metody Klasy Project_Animals____________________________________________
	public void Create_Animals()
	{
		animals.add(new Pies("Burek", "Labrador", 2, false));
		animals.add(new Kot("Szarek", "Kot Europejski", 3, true));
		animals.add(new Kot("Szarek", "Kot Australijski", 2, true));
		animals.add(new Pies("Hektor", "Boxer", 3, false));
		animals.add(new Kot("Szarek", "Kot Australijski", 5, true));		
	}
	
	//Tworzymy nasze komparatory - czyli referencja na obiekty klas wewn�trznych
	public void CreateComparators()
	{
		Comparator1 = new ZwierzeCompare_WabiSie();
		Comparator2 = new ZwierzeCompare_Wiek();
		
	}
	
	public void View_Animals()
	{
		for(int i=0; i<animals.size(); i++)
			System.out.println("Zwierze: " + animals.get(i));
		
	}	
		
	public ArrayList<Zwierze> getAnimals() {
		return animals;
	}	
	public ZwierzeCompare_WabiSie getComparator1() {
		return Comparator1;
	}
	public ZwierzeCompare_Wiek getComparator2() {
		return Comparator2;
	}
	//____________________________________________________________________________
	

}
