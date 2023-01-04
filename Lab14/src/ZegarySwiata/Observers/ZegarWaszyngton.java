package ZegarySwiata.Observers;

import ZegarySwiata.Observable.Subject;

public class ZegarWaszyngton implements Observer {

    private int hh;
    private int mm;
    private int ss;
    private Subject timeData;

    public ZegarWaszyngton(Subject timeData) {
        this.timeData = timeData;
        this.timeData.registerObserver(this);
    }



    @Override
    public void update(int hh, int mm, int ss) {
        // Ró¿nica czasu w Waszyngtonie - "-6 godzin"
        this.hh = hh - 6;
        // je¿eli minus - to to jest czas z poprzedniego dnia
        if (this.hh < 0) {
            this.hh+=24;
        }
        this.mm = mm;
        this.ss = ss;
        display();
    }

    private void display() {
        System.out.printf("Czas w Waszyngtonie:\t%d:%d:%d\n", hh, mm, ss);
    }
}