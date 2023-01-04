package Zegar.Observable;

import Zegar.Observers.Observer;

import java.util.ArrayList;

public class TimeData implements Subject{

    ArrayList<Observer> observerList = new ArrayList<Observer>();

    private int hh;
    private int mm;
    private int ss;

    public TimeData() {
        this.hh = 0;
        this.mm = 0;
        this.ss = 0;
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
        System.out.print("Zegar:\t\t\tczas= " + (hh * 60 * 60  + mm * 60 + ss));
        System.out.printf("\t\t%d:%d:%d\n", hh, mm, ss);
    }
    //____________________________________________________________________________

    //Ustawienie nowego stanu dla obiektu obserwowanego____________________________
    public void przesun(int hh, int mm, int ss)
    {
        System.out.printf("Przesuniêcie czasu o %dh, %dm, %ds\n", hh, mm, ss);
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
        System.out.println("Zegar tyka");
        ss++;
        correctTime();
//        display();
        measurementsChanged();
    }

}
