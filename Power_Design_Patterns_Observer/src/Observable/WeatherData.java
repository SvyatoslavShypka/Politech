package Observable;
import Observers.Observer;

import java.util.ArrayList;

//Klasa obiektów obserwowanych
public class WeatherData implements Subject 
{

	/*Obiekt obserwowany przechowuje w kolekcji (np. ArrayList) 
	wszystkich swoich obserwatorów*/
	//Lista obserwatorów dla obiektu obserwowanego_______________
	ArrayList<Observer> ObserverList = new ArrayList<Observer>();
	//___________________________________________________________
	
	//Stan obiektu obserwowanego______________________
	private float temperature;
	private float humidity;
	private float pressure;
	//_______________________________________________
	
	//Metody przes³oniête__________________________________________________
	
	/*Wystarczy, ¿e dostaniemy obiekt, który implementuje interfej Observer (czyli obserwatora)
	i wrzucamy go do kolekcji zarejestrowanych obserwatorów, poniewa¿ kolekcja ta jest typu interfejs Observer
	(to jest to 'pisanie kodu na wysokim poziomie abstrakcji')*/
	@Override
	public void registerObserver(Observer observer) 
	{	
		ObserverList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) 
	{
		ObserverList.remove(observer);
	}

	
	/*Wspania³y przyk³ad wykorzystania polimorfizmu:
	powiadamiamy wszystkich obserwatorów o zmianie stanu obiektu obserwowanego poprzez 
	uruchomienie metody interfejsy Observer ( update() ).
	Ka¿dy obserwator implementuje j¹ na swój sposób, a wiêc reaguje na swój sposób na zmianê stanu.*/
	@Override
	public void notifyObservers() 
	{
		for(int i = 0; i<ObserverList.size(); i++) 
			ObserverList.get(i).update(temperature, humidity, pressure);
	}
	//_______________________________________________________________________________________________
		
	
	/*Uruchomienie powiadomienia obserwatorów
	(oczywiœcie, mo¿emy to zrobiæ i bez tej metody - tzn. ju¿ na poziomie setMeasurements() , 
	ale zwiêksza to poprawnoœæ procedury, poza tym measurementsChanged() mo¿e mieæ
	dodatkowe zasady uruchomienia: notifyObservers() )____________________________*/
	public void measurementsChanged() 
	{
		notifyObservers();
	}
	//____________________________________________________________________________
	
	//Ustawienie nowego stanu dla obiektu obserwowanego____________________________
	public void setMeasurements(float temperature, float humidity, float pressure) 
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	//____________________________________________________________________________

}
