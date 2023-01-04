package Observers;

//Obiekty klas, które implementuj¹ ten interfejs, staj¹ siê obserwatorami.
public interface Observer {
	public void update(float temp, float humidity, float pressure);   
}
