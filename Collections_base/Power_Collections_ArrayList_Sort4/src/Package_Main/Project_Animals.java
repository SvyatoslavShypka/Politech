package Package_Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Zwierze.*;

public class Project_Animals {

	//Sk³adowe Klasy________________________
	private ArrayList<Zwierze> animals;		
	//To s¹ nasze komparatory	
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
		
		//Sortowanie po 'Wabi siê'
		Collections.sort(ob_animals.getAnimals(), ob_animals.getComparator1());				
		ob_animals.View_Animals();
		
		System.out.println("\n");
		
		//Sortowanie po 'Wieku'
		Collections.sort(ob_animals.getAnimals(), ob_animals.getComparator2());				
		ob_animals.View_Animals();

	}
	//******************************************************

	////////////////////////////////////////////////////////////////////////////////////
	
	
/*	Jak najbardziej, w JAVIE mo¿emy tworzyæ klasy wewnêtrzne, tzn. okreœliæ klasê w klasie.
	Klasy wewnêtrzne (ich metody), maj¹ dostêp do sk³adowych klasy zewnêtrznej (nawet tych prywatnych).
	Sens korzystania z nich stanowi mo¿liwoœæ przes³aniania metod implementowanego interfejsu na ró¿ne sposoby.

	Tzn. gdyby klasa podstawowa implementowa³a interfejs Comparator, 
	to mo¿liwoœæ przes³oniêcia metody z interfejsu by³aby tylko jedna, a oznacza to, ¿e okreœlilibyœmy tylko jeden sposób sortowania.

	Korzystaj¹c z klas wewnêtrznych, umo¿liwiamy tworzenie wielu komparatorów, czyli wiele sposobów na sortowanie ArrayList'y.
*/	
	//Klasy Wewnêtrzne	
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
	
	//Tworzymy nasze komparatory - czyli referencja na obiekty klas wewnêtrznych
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
