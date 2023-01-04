package ZegarySwiata.ProjectObserver;

import ZegarySwiata.Observable.TimeData;
import ZegarySwiata.Observers.ZegarWarszawa;
import ZegarySwiata.Observers.ZegarWaszyngton;

public class ProjectObserver {

    public static void main(String[] args) throws InterruptedException {
        TimeData timeData = new TimeData();

        ZegarWarszawa zegarWarszawa = new ZegarWarszawa(timeData);
        ZegarWaszyngton zegarWaszyngton = new ZegarWaszyngton(timeData);

        for (int i = 0; i < 6; i++) {
            // pauza w 1 sekundê
            Thread.sleep(1000);
            if (i == 3) {
                // przesuniêcie czasu na Letni
                timeData.przesun(1,00,00);
            }
            timeData.tykniecie();
        }
    }
}
