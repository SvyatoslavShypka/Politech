package Zegar.Observers;

import Zegar.Observable.Subject;

public class ZegarAnalogowy implements Observer {

    private int hh;
    private int mm;
    private int ss;
    private Subject timeData;

    public ZegarAnalogowy(Subject timeData) {
        this.timeData = timeData;
        this.timeData.registerObserver(this);
    }



    @Override
    public void update(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
        display();
    }

    private void display() {
        System.out.println("Zegar Analogowy:czas= " + (hh * 60 * 60 + mm * 60 + ss) + "\t\tZegar analogowy\n");
    }
}