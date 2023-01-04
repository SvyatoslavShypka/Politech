package Observable;
import Observers.Observer;

import java.util.ArrayList;

//Klasa obiekt�w obserwowanych
public class WeatherData implements Subject 
{

	/*Obiekt obserwowany przechowuje w kolekcji (np. ArrayList) 
	wszystkich swoich obserwator�w*/
	//Lista obserwator�w dla obiektu obserwowanego_______________
	ArrayList<Observer> ObserverList = new ArrayList<Observer>();
	//___________________________________________________________
	
	//Stan obiektu obserwowanego______________________
	private float temperature;
	private float humidity;
	private float pressure;
	//_______________________________________________
	
	//Metody przes�oni�te__________________________________________________
	
	/*Wystarczy, �e dostaniemy obiekt, kt�ry implementuje interfej Observer (czyli obserwatora)
	i wrzucamy go do kolekcji zarejestrowanych obserwator�w, poniewa� kolekcja ta jest typu interfejs Observer
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

	
	/*Wspania�y przyk�ad wykorzystania polimorfizmu:
	powiadamiamy wszystkich obserwator�w o zmianie stanu obiektu obserwowanego poprzez 
	uruchomienie metody interfejsy Observer ( update() ).
	Ka�dy obserwator implementuje j� na sw�j spos�b, a wi�c reaguje na sw�j spos�b na zmian� stanu.*/
	@Override
	public void notifyObservers() 
	{
		for(int i = 0; i<ObserverList.size(); i++) 
			ObserverList.get(i).update(temperature, humidity, pressure);
	}
	//_______________________________________________________________________________________________
		
	
	/*Uruchomienie powiadomienia obserwator�w
	(oczywi�cie, mo�emy to zrobi� i bez tej metody - tzn. ju� na poziomie setMeasurements() , 
	ale zwi�ksza to poprawno�� procedury, poza tym measurementsChanged() mo�e mie�
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
