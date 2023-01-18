package Package_Main;

import Zwierze.Kot;
import Zwierze.Pies;
import Zwierze.Zwierze;

import java.util.ArrayList;
import java.util.Collections;

public class Project_Animals {

	//Sk³adowe Klasy________________________
	private ArrayList<Zwierze> animals;	
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
		
		Collections.sort(ob_animals.getAnimals());
		
		ob_animals.View_Animals();

	}
	//******************************************************


	//Metody Klasy Project_Animals__________________________
	public void Create_Animals()
	{
		animals.add(new Pies("Burek", "Labrador", 2, false));
		animals.add(new Kot("Szarek", "Kot Europejski", 3, true));
		animals.add(new Kot("Szarek", "Kot Australijski", 2, true));
		animals.add(new Pies("Hektor", "Boxer", 3, false));
		animals.add(new Kot("Szarek", "Kot Australijski", 5, true));
		
	}
	
	public void View_Animals()
	{
		for(int i=0; i<animals.size(); i++)
			System.out.println("Zwierze: " + animals.get(i));
		
	}	
		
	public ArrayList<Zwierze> getAnimals() {
		return animals;
	}
	//______________________________________________________
	

}
