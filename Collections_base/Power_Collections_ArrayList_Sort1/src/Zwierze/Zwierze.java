package Zwierze;

/*Sortujemy zwierz�ta, a wi�c klasa abstrakcyjna 
Zwierze musi implementowa� interfejs Comparable
(do kolekcji typu Zwierze, mo�emy jak najbardziej 
wpisywa� referencje na obiekty klas Pies i Kot) - 
klasa Zwierze jest Abstrakcyjna.*/
public abstract class Zwierze implements Comparable<Zwierze>
{
	
	//Sk�adowe Klasy Zwierz�______________________________
	private String Zwierze_Wabi_sie;
	private String Zwierze_Rasa;
	private int Zwierze_Wiek;
	//_____________________________________________________	
	
	//Konstruktor klasy
	public Zwierze(String wabi_sie, String rasa, int wiek)
	{
		Zwierze_Wabi_sie = wabi_sie;
		Zwierze_Rasa = rasa;
		Zwierze_Wiek = wiek;
	}

	//Metody Klasy____________________________________________________________
	@Override
	public String toString() //Przes�oni�ta : Object
	{
		return 	"Wabi si�: *" + getZwierze_Wabi_sie() + "* " +
				"Rasa: "	+ getZwierze_Rasa() + " " +
				"Wiek: "	+ getZwierze_Wiek() + " ";
	}
	
	
/*	W trakcie sortowania metoda CompareTo uruchamiana jest na rzecz bie��cego obiektu kolekcji, 
	kt�ry jest por�wnywany z obiektem przekazanym do tej metody (sortujemy przecie� Zwierz�ta).
	Poniewa� sortujemy wed�ug warto�ci typu String, a klasie String  CompareTo jest r�wnie� 
	odpowiednio przes�oni�te, to podobnie u�ywamy  CompareTo z klasy String 
	(uruchamianego wzgl�dem obiekt�w typu String).
	Wynikiem takiego przes�oni�cia jest sortowanie Zwierz�t wed�ug String'a, kt�ry jest 
	sk�adow� klasy Zwierze: 'Zwierze_Wabi_sie'.*/
	@Override
	public int compareTo(Zwierze zw) //Przes�oni�ta : Comparable
	{
//			Por�wnanie po polu Zwierze_Wabi_sie
			return this.Zwierze_Wabi_sie.compareTo(zw.getZwierze_Wabi_sie());
//			Por�wnanie po polu Zwierze_Rasa
//			return this.Zwierze_Rasa.compareTo(zw.getZwierze_Rasa());
	}
	//_________________________________________________________________________
	
	//Metody typu Get i Set__________________________________
	public String getZwierze_Wabi_sie() {
		return Zwierze_Wabi_sie;
	}
	public void setZwierze_Wabi_sie(String zwierze_Wabi_sie) {
		Zwierze_Wabi_sie = zwierze_Wabi_sie;
	}
	public String getZwierze_Rasa() {
		return Zwierze_Rasa;
	}
	public void setZwierze_Rasa(String zwierze_Rasa) {
		Zwierze_Rasa = zwierze_Rasa;
	}
	public int getZwierze_Wiek() {
		return Zwierze_Wiek;
	}
	public void setZwierze_Wiek(int zwierze_Wiek) {
		Zwierze_Wiek = zwierze_Wiek;
	}	
	//________________________________________________________	

}
