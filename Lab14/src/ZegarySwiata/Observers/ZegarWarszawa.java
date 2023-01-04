package ZegarySwiata.Observers;

import ZegarySwiata.Observable.Subject;

public class ZegarWarszawa implements Observer {

    private int hh;
    private int mm;
    private int ss;
    private Subject timeData;

    public ZegarWarszawa(Subject timeData) {
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
        System.out.printf("Czas w Warszawie:\t\t%d:%d:%d\n", hh, mm, ss);
    }
}