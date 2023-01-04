package ZegarySwiata.Observable;

import ZegarySwiata.Observers.Observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeData implements Subject {

    ArrayList<Observer> observerList = new ArrayList<Observer>();

    private int hh;
    private int mm;
    private int ss;

    public TimeData() {
        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date
        this.hh = calendar.get(Calendar.HOUR_OF_DAY);
        this.mm = calendar.get(Calendar.MINUTE);
        this.ss = calendar.get(Calendar.SECOND);
    }

    public TimeData(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer x: observerList
             ) {
            x.update(hh, mm, ss);
        }
    }

    public void measurementsChanged()
    {
        display();
        notifyObservers();
    }

    private void display() {
        System.out.printf("Zegar Atomowy: \t\t\t%d:%d:%d\n", hh, mm, ss);
    }
    //____________________________________________________________________________

    //Ustawienie nowego stanu dla obiektu obserwowanego____________________________
    public void przesun(int hh, int mm, int ss)
    {
        System.out.printf("\nZmiana czasu Letni/Zimowy/Przesuniêcie czasu o %dh, %dm, %ds\n", hh, mm, ss);
        this.hh += hh;
        this.mm += mm;
        this.ss += ss;
        correctTime();
//        display();
        measurementsChanged();
    }

    private void correctTime() {
        if (ss >= 60) {
            ss = ss % 60;
            mm++;
        }
        if (mm >= 60) {
            mm = mm % 60;
            hh++;
        }
        if (hh >= 24) {
            hh = hh % 24;
        }
    }

    public void tykniecie() {
        System.out.println("\nZegar tyka");
        ss++;
        correctTime();
//        display();
        measurementsChanged();
    }

}