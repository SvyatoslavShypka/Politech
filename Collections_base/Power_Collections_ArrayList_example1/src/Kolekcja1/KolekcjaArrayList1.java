package Kolekcja1;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	
	//Sk�adowe Klasy_________
	private String Imie;
	private String Nazwisko;
	//_______________________
	
	
	//Konstruktor____________________________________________________
	public Student(String imie, String nazwisko) 
	{
		this.Imie = imie;
		this.Nazwisko = nazwisko;
	}
	//_______________________________________________________________
	
	
	//Get-ery / Set-ery ______________________________
	public String getImie() {
		return Imie;
	}
	public void setImie(String imie) {
		Imie = imie;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	//_______________________________________________
}



public class KolekcjaArrayList1 {

	private ArrayList<Student> ListaStudent�w;
	
	
	//Konstruktor domy�lny____________________________
	public KolekcjaArrayList1()
	{
		ListaStudent�w = new ArrayList<Student>();
	}
	//________________________________________________
	
	
	//Odczyt danych z konsoli_________________________
	public void WczytajDane()
	{
		Scanner odczyt = new Scanner(System.in); 		   
		String [] s;
		
		while (odczyt.hasNext())
		{   
			s = odczyt.nextLine().split(" ");	
			
			if (s[0].equals("koniec")) break;
			 else ListaStudent�w.add(new Student(s[0], s[1])); //Wczytanie element�w do listy: add();
	    }	
		
		odczyt.close();
	}	
	//________________________________________________
	
	//Wy�wietlenie element�w ArrayListy_______________________________________________________
	public void drukujStudent�w() {
		
		System.out.println("Drukowanie Listy Student�w : \n");
		
		// Metody: size(); get(index);
		for(int i=0; i<ListaStudent�w.size(); i++)
			System.out.println( "Student " + i + " Imi�: " + ListaStudent�w.get(i).getImie() + 
					" Nazwisko: " + ListaStudent�w.get(i).getNazwisko() + "\n\n");
	}
	
	//__________________________________________________________________________________________

	//Wybrane metody klasy ArrayList___________________________________________________________________________
	public void Mozliwo�ciArrayList() 
	{
		
	drukujStudent�w();
	
	Student st = new Student("Piotr","Marek");
	ListaStudent�w.add(st); //dodanie studenta do wype�nionej ArrayListy: add();
	
	drukujStudent�w();
	
	
	//contains(Object ob); sprawdzenie czy student wyst�puje w li�cie, na podstawie referencji do obiektu
	if (ListaStudent�w.contains(st)) System.out.println("Student " + st.getImie() + " " + st.getNazwisko() + " znaleziony \n");
		else System.out.println("Brak studenta");
		
	//remove(index); remove(Object ob); usuwanie elementu - mo�na wed�ug referencji, mo�na po indeksie
	if (ListaStudent�w.contains(st)) 
	{
		System.out.println("Student " + st.getImie() + " " + st.getNazwisko() + " usuni�ty \n");
		ListaStudent�w.remove(st);
	}
	
	drukujStudent�w();
	
	//Usuwanie po indeksie (warto�� 0)
	ListaStudent�w.remove(0);
		
	drukujStudent�w();
		
	//Sprawdzenie czy kolekcja jest pusta
	if (ListaStudent�w.isEmpty()) System.out.println("Kolekcja jest pusta");
	 else System.out.println("Kolekcja nie jest pusta");
	
	}
	
	//_________________________________________________________________________________________________________
	
	
	public static void main(String[] args) 
	{
		
		KolekcjaArrayList1 ob = new KolekcjaArrayList1();
		
		ob.WczytajDane();	
		ob.Mozliwo�ciArrayList();
	}
	
}
