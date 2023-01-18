package Package_Main;

import Zwierze.Kot;
import Zwierze.Pies;
import Zwierze.Zwierze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Project_Animals {

	//Sk³adowe Klasy________________________
	private ArrayList<Zwierze> animals;	
	
	private ZwierzeCompare_WabiSie Comparator1;
	private ZwierzeCompare_WabiSie_Wiek Comparator2;
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
	//Klasy Wewnêtrzne	
	class ZwierzeCompare_WabiSie implements Comparator<Zwierze> 
	{
		public int compare(Zwierze zw1, Zwierze zw2) 
		{
			return zw1.getZwierze_Wabi_sie().compareTo(zw2.getZwierze_Wabi_sie());
		}
	}	
	
/*	Ten komparator (sortuj¹cy wed³ug wieku), bêdzie sortowaæ tylko dla takich 
	samych wartoœci sk³adowej 'wabi siê'.
	A wiêc zachowa sortowania komparatora pierwszego.*/
	class ZwierzeCompare_WabiSie_Wiek implements Comparator<Zwierze> 
	{
		public int compare(Zwierze zw1, Zwierze zw2) 
		{		
			if (zw1.getZwierze_Wabi_sie().equals(zw2.getZwierze_Wabi_sie()) && (zw1.getZwierze_Wiek()<zw2.getZwierze_Wiek()) ) return -1;
			
			if (zw1.getZwierze_Wabi_sie().equals(zw2.getZwierze_Wabi_sie()) && (zw1.getZwierze_Wiek()>zw2.getZwierze_Wiek()) ) return 1;

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
		animals.add(new Pies("Burek", "Owczarek", 1, false));
		animals.add(new Pies("Hektor", "Boxer", 3, false));
		animals.add(new Kot("Szarek", "Kot Australijski", 5, true));		
	}
	
	public void CreateComparators()
	{
		Comparator1 = new ZwierzeCompare_WabiSie();
		Comparator2 = new ZwierzeCompare_WabiSie_Wiek();
		
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
	public ZwierzeCompare_WabiSie_Wiek getComparator2() {
		return Comparator2;
	}
	//____________________________________________________________________________
	

}
