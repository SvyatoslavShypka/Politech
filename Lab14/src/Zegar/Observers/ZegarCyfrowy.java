package Zegar.Observers;

import Zegar.Observable.Subject;

public class ZegarCyfrowy implements Observer {

    private int hh;
    private int mm;
    private int ss;
    private Subject timeData;

    public ZegarCyfrowy(Subject timeData) {
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
        System.out.println("Zegar Cyfrowy:\tczas= " + (hh * 60 * 60 + mm * 60 + ss) + "\t\tZegar cyfrowy");
    }
}
