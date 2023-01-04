package Observable;
import Observers.*;


/*Interfejs Subject prezentuje metody wspólne dla obiektów, 
 które s¹ obiektami obserwowanymi
(w projekcie mo¿na mieæ wiêcej takich obiektów)*/
public interface Subject {

	  public void registerObserver(Observer observer);
      public void removeObserver(Observer observer);
      public void notifyObservers();   
}
