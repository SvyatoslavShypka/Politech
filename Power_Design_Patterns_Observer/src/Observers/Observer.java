package Observers;

//Obiekty klas, kt�re implementuj� ten interfejs, staj� si� obserwatorami.
public interface Observer {
	public void update(float temp, float humidity, float pressure);   
}
