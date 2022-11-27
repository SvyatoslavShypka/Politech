package Weterynarz;

import Pies_Obroża.Pies;

public class Weterynarz {

    /* Weterynarz przechwytuje obiekt typu Pies w swojej metodzie szczepienia
    i wykonuje sczepienie poprzez uruchomienie set-era dla tego Psa.
    Metoda szczepienie jest statyczna, ponieważ traktujemy weterynarza jako usługodawcę.*/
    public static void WykonajSzczepienie(Pies p) {
        p.setSzczepienie(true);
    }
}
