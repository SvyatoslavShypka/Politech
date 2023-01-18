package Zwierze;

public class Kot extends Zwierze
{
	
	//Sk³adowe Klasy Koty______________________________
	private boolean Czy_Lapie_Myszy;
	//________________________________________________	
	
	//Konstruktor klasy
	public Kot(String wabi_sie, String rasa, int wiek, boolean Mysz)
	{
		super(wabi_sie, rasa, wiek);
		Czy_Lapie_Myszy = Mysz;
	}

	
	//Metody Klasy___________________________________________________________
	public String toString()
	{
	return 	super.toString() +
			"Umiejêtnoœæ ³apania myszy: " + Czy_Lapie_Myszy();
	}
	//________________________________________________________________________
	
	
	//Metody typu Get i Set__________________________________
	public boolean Czy_Lapie_Myszy() {
		return Czy_Lapie_Myszy;
	}
	public void setCzy_Lapie_Myszy(boolean czy_Lapie_Myszy) {
		Czy_Lapie_Myszy = czy_Lapie_Myszy;
	}
	//________________________________________________________

}