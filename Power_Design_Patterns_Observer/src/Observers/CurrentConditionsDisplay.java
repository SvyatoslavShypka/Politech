package Observers;
import Observable.Subject;
import additionalActions.DisplayFahrenheit;

//PIERWSZY OBIEKT - OBSERWATOR ! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
//Warunki bie��ce_______________________________________________________________
public class CurrentConditionsDisplay implements Observer, DisplayFahrenheit {
	
	private   float temperature;
	private   float humidity;
	private   float pressure;
	    
	//Mo�na mie� sw�j obiekt obserwowany - mo�e si� przyda�
	private Subject weatherData;
	
  
	public CurrentConditionsDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		
		/*Obserwatora rejestrujemy w jego obiekcie 
		obserwowanym przy jego tworzeniu (ju� w konstruktorze)*/
		this.weatherData.registerObserver(this);
	}
	
	
	/*Przechwytujemy przekazany nam stan obiektu obserwowanego i odpowiednio reagujemy, 
	przy wykorzystaniu tych danych*/
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	//________________________________________________________________________________
	
	//Ten obserwator jest zainteresowany i tym dzia�aniem
	@Override
	public void displayFahrenheit() {
		
		System.out.println("\n Temperatura w skali Fahrenheita wynosi : " + (32 + (9*temperature)/5 ));
		
	}
	
	public void display() {
		System.out.println("\n Warunki bie��ce: " + temperature + " Stopni Celsjusza;  "
				+ "" + humidity +" % Wilgotno��;  " + pressure + " Ci�nienie;");
		
		displayFahrenheit();
	}
};
//______________________________________________________________________________


//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
