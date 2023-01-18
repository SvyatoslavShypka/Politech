package Zwierze;

/*Sortujemy zwierzêta, a wiêc klasa abstrakcyjna 
Zwierze musi implementowaæ interfejs Comparable
(do kolekcji typu Zwierze, mo¿emy jak najbardziej 
wpisywaæ referencje na obiekty klas Pies i Kot) - 
klasa Zwierze jest Abstrakcyjna.*/
public abstract class Zwierze implements Comparable<Zwierze>
{
	
	//Sk³adowe Klasy Zwierzê______________________________
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
	public String toString() //Przes³oniêta : Object
	{
		return 	"Wabi siê: *" + getZwierze_Wabi_sie() + "* " +
				"Rasa: "	+ getZwierze_Rasa() + " " +
				"Wiek: "	+ getZwierze_Wiek() + " ";
	}
	
	
/*	W trakcie sortowania metoda CompareTo uruchamiana jest na rzecz bie¿¹cego obiektu kolekcji, 
	który jest porównywany z obiektem przekazanym do tej metody (sortujemy przecie¿ Zwierzêta).
	Poniewa¿ sortujemy wed³ug wartoœci typu String, a klasie String  CompareTo jest równie¿ 
	odpowiednio przes³oniête, to podobnie u¿ywamy  CompareTo z klasy String 
	(uruchamianego wzglêdem obiektów typu String).
	Wynikiem takiego przes³oniêcia jest sortowanie Zwierz¹t wed³ug String'a, który jest 
	sk³adow¹ klasy Zwierze: 'Zwierze_Wabi_sie'.*/
	@Override
	public int compareTo(Zwierze zw) //Przes³oniêta : Comparable
	{
//			Porównanie po polu Zwierze_Wabi_sie
			return this.Zwierze_Wabi_sie.compareTo(zw.getZwierze_Wabi_sie());
//			Porównanie po polu Zwierze_Rasa
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
