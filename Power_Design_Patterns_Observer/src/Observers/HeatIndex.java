package Observers;
import Observable.Subject;

//DRUGI OBIEKT - OBSERWATOR ! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
//Indeks Ciep�a_______________________________________________________________
public class HeatIndex implements Observer {

	private float temperature;
	private float humidity;
	    
	//Mo�na mie� sw�j obiekt obserwowany - mo�e si� przyda�
	private Subject weatherData;
	
	public HeatIndex(Subject weatherData) {
		
		this.weatherData = weatherData;
		
		/*Obserwatora rejestrujemy w jego obiekcie 
		obserwowanym przy jego tworzeniu (ju� w konstruktorze)*/
		this.weatherData.registerObserver(this);
	}
	
	
	public double ObliczIndeksCiepla(){
      
      return (temperature*humidity + 29);
	}
	
	/*Przechwytujemy przekazany nam stan obiektu obserwowanego i odpowiednio reagujemy, 
	przy wykorzystaniu tych danych*/
	@Override
  	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	//_________________________________________________________________________________
	
	//Ten obserwator realizuje zaawansowan� analiz� danych
	public void display() {
			System.out.println("\n Indeks Ciepla: " + ObliczIndeksCiepla());
	}
}; 
//______________________________________________________________________________


//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
