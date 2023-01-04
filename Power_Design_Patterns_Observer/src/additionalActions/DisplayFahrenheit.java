package additionalActions;

/*Innego typu dzia³anie na danych - dlaczego interfejs ?
Pisanie na 'wysokim poziomie abstrakcji': musimy za³o¿yæ z góry, 
¿e bêdzie wiêcej obserwatorów, którzy bêd¹ tym dzia³aniem zainteresowani*/
public interface DisplayFahrenheit {
	
	public void displayFahrenheit();
}
