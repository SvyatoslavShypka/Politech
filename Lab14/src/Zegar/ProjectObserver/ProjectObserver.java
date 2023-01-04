package Zegar.ProjectObserver;

import Zegar.Observable.TimeData;
import Zegar.Observers.ZegarAnalogowy;
import Zegar.Observers.ZegarCyfrowy;

public class ProjectObserver {

    public static void main(String[] args) throws InterruptedException {
        TimeData timeData = new TimeData();

        ZegarCyfrowy zegarCyfrowy = new ZegarCyfrowy(timeData);
        ZegarAnalogowy zegarAnalogowy = new ZegarAnalogowy(timeData);

        for (int i = 0; i < 6; i++) {
            // pauza w 1 sekundê
            Thread.sleep(1000);
            if (i == 3) {
                // test przesuniêcia czasu
                timeData.przesun(23,59,57);
            }
            else {
                // nastêpna sekunda
                timeData.tykniecie();
            }
        }
    }
}
