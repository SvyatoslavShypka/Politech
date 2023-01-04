package Observable;
import Observers.*;


/*Interfejs Subject prezentuje metody wsp�lne dla obiekt�w, 
 kt�re s� obiektami obserwowanymi
(w projekcie mo�na mie� wi�cej takich obiekt�w)*/
public interface Subject {

	  public void registerObserver(Observer observer);
      public void removeObserver(Observer observer);
      public void notifyObservers();   
}
