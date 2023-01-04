package ProjectObserver;
import Observable.WeatherData;
import Observers.CurrentConditionsDisplay;
import Observers.HeatIndex;

public class ProjectObserver {

	public static void main(String[] args) {
		
		//Tworzymy obiekt obserwowany
		WeatherData danePogodowe = new WeatherData();
	    
		//Tworzymy pierwszego obserwatora i wi¹¿emy go z tym obiektem obserwowanym
	    CurrentConditionsDisplay warunkiBiezace = new CurrentConditionsDisplay(danePogodowe);
	    
	    //Tworzymy drugiego obserwatora i wi¹¿emy go z tym obiektem obserwowanym
	    HeatIndex indCiepla = new HeatIndex(danePogodowe);
	    
	    //Symulacja/////////////////////////////////////
	    System.out.println("Symulacja 1: _______________________________________________________");
	    danePogodowe.setMeasurements(26.6f, 65f, 1013f);
	    System.out.println("____________________________________________________________________");
	    
	    System.out.println("\nSymulacja 2: _______________________________________________________");
	    danePogodowe.setMeasurements(100f, 70f, 997f);
	    System.out.println("____________________________________________________________________");
	    
	    System.out.println("\nSymulacja 3: _______________________________________________________");
	    danePogodowe.setMeasurements(-273.15f, 90f, 995f);
	    System.out.println("____________________________________________________________________");
	    ////////////////////////////////////////////////

	    
	    //Usuniêcie obserwatora
	    danePogodowe.removeObserver(indCiepla);
	    indCiepla = null;
	    
	    System.out.println("\nSymulacja 4: _______________________________________________________");
	    danePogodowe.setMeasurements(-50f, 80f, 1000f);
	    System.out.println("____________________________________________________________________");
	    ////////////////////////////////////////////////
	    
	}

}
