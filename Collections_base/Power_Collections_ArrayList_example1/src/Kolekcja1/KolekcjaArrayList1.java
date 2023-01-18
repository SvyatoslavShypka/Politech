package Kolekcja1;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	
	//Sk³adowe Klasy_________
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

	private ArrayList<Student> ListaStudentów;
	
	
	//Konstruktor domyœlny____________________________
	public KolekcjaArrayList1()
	{
		ListaStudentów = new ArrayList<Student>();
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
			 else ListaStudentów.add(new Student(s[0], s[1])); //Wczytanie elementów do listy: add();
	    }	
		
		odczyt.close();
	}	
	//________________________________________________
	
	//Wyœwietlenie elementów ArrayListy_______________________________________________________
	public void drukujStudentów() {
		
		System.out.println("Drukowanie Listy Studentów : \n");
		
		// Metody: size(); get(index);
		for(int i=0; i<ListaStudentów.size(); i++)
			System.out.println( "Student " + i + " Imiê: " + ListaStudentów.get(i).getImie() + 
					" Nazwisko: " + ListaStudentów.get(i).getNazwisko() + "\n\n");
	}
	
	//__________________________________________________________________________________________

	//Wybrane metody klasy ArrayList___________________________________________________________________________
	public void MozliwoœciArrayList() 
	{
		
	drukujStudentów();
	
	Student st = new Student("Piotr","Marek");
	ListaStudentów.add(st); //dodanie studenta do wype³nionej ArrayListy: add();
	
	drukujStudentów();
	
	
	//contains(Object ob); sprawdzenie czy student wystêpuje w liœcie, na podstawie referencji do obiektu
	if (ListaStudentów.contains(st)) System.out.println("Student " + st.getImie() + " " + st.getNazwisko() + " znaleziony \n");
		else System.out.println("Brak studenta");
		
	//remove(index); remove(Object ob); usuwanie elementu - mo¿na wed³ug referencji, mo¿na po indeksie
	if (ListaStudentów.contains(st)) 
	{
		System.out.println("Student " + st.getImie() + " " + st.getNazwisko() + " usuniêty \n");
		ListaStudentów.remove(st);
	}
	
	drukujStudentów();
	
	//Usuwanie po indeksie (wartoœæ 0)
	ListaStudentów.remove(0);
		
	drukujStudentów();
		
	//Sprawdzenie czy kolekcja jest pusta
	if (ListaStudentów.isEmpty()) System.out.println("Kolekcja jest pusta");
	 else System.out.println("Kolekcja nie jest pusta");
	
	}
	
	//_________________________________________________________________________________________________________
	
	
	public static void main(String[] args) 
	{
		
		KolekcjaArrayList1 ob = new KolekcjaArrayList1();
		
		ob.WczytajDane();	
		ob.MozliwoœciArrayList();
	}
	
}
