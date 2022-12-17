package Package_Main;

import Package_Ciasto.PieczeBabcia;
import Package_Ciasto.PieczeDziadek;

public class Piekarnia_Ciast {

    public static void main(String[] args) {
        PieczeBabcia babcia = new PieczeBabcia();
        babcia.ustawCiastoSliwkowe();
        babcia.setAlgorytmInfoSliwka("polowki");
        babcia.wyswietlInfo();
        babcia.PieczeBabcia();

        PieczeDziadek dziadek = new PieczeDziadek();
        dziadek.ustawSzarlotke();
        dziadek.setAlgorytmInfoJablko("cwiartki");
        dziadek.wyswietlInfo();
        dziadek.PieczeDziadek();

        babcia.setAlgorytmInfoSliwka("kostka");
        babcia.wyswietlInfo();
        babcia.PieczeBabcia();

        dziadek.ustawCiastoSliwkowe();
        dziadek.setAlgorytmInfoSliwka("zmiksowane");
        dziadek.wyswietlInfo();
        dziadek.PieczeDziadek();




    }
}
