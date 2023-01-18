package Zwierze;


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
	
	//__________________________________________________________________________
	@Override
	public int compareTo(Zwierze zw) //Przes³oniêta : Comparable
	{			
		if (this.getZwierze_Wiek()<zw.getZwierze_Wiek()) return -1;
		
		if (this.getZwierze_Wiek()>zw.getZwierze_Wiek()) return 1;
		
		return 0;
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
