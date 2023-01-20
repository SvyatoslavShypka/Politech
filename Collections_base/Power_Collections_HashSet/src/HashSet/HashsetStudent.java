package HashSet;

import java.util.HashSet;

class Student
{
	//Sk³adowe Klasy_________
	private String Imie;
	private String Nazwisko;
	private int nr_indeksu;
	//_______________________
	
	//Konstruktor____________________________________________________
	public Student(String Imie, String Nazwisko, int nr_indeksu) 
	{
		this.Imie = Imie;
		this.Nazwisko = Nazwisko;
		this.nr_indeksu = nr_indeksu;
	}
	//_______________________________________________________________

	//Metody przes³oniête_____________________________________________________
	@Override
	public int hashCode() {
//		System.out.println(this.getNazwisko().hashCode());
		return this.getNazwisko().hashCode();
//		return this.getImie().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		
//		if (Imie.equals(other.Imie)) return true;
		if (Nazwisko.equals(other.getNazwisko())) return true;
		 else return false;
	}
	
	@Override
	public String toString()
	{
		return this.getImie() + this.getNazwisko() + this.getNr_indeksu();
	}
	//________________________________________________________________________
	
	
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
	public int getNr_indeksu() {
		return nr_indeksu;
	}
	public void setNr_indeksu(int nr_indeksu) {
		this.nr_indeksu = nr_indeksu;
	}
	//_______________________________________________
}


public class HashsetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student("Tomasz ","Kowalski ",123);
		Student st2 = new Student("Piotr ","Nowak ", 345);
		Student st3 = new Student("Piotr ","Kowalski ", 567);
		
		HashSet<Student> Studenci = new HashSet<Student>();
		Studenci.add(st1);
		Studenci.add(st2);
		Studenci.add(st3);
		
		
		System.out.println(Studenci);
		
	}

}
