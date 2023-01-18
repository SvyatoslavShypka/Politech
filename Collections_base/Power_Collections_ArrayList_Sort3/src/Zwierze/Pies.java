package Zwierze;

public class Pies extends Zwierze 
{
	
	//Sk³adowe Klasy Psy______________________________
	private boolean Czy_Agresywny;
	//________________________________________________	
	
	//Konstruktor klasy
	public Pies(String wabi_sie, String rasa, int wiek, boolean Agr)
	{
		super(wabi_sie, rasa, wiek);
		Czy_Agresywny = Agr;
	}

	
	//Metody Klasy___________________________________________
	public String toString()
	{
		return 	super.toString() +
				"Agresja: " + Czy_Agresywny();
	}
	//_______________________________________________________
	
	
	//Metody typu Get i Set__________________________________
	public boolean Czy_Agresywny() {
		return Czy_Agresywny;
	}
	public void setCzy_Agresywny(boolean czy_Agresywny) {
		Czy_Agresywny = czy_Agresywny;
	}
	//________________________________________________________	

}
