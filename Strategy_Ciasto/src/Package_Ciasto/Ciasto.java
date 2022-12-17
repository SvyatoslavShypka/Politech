package Package_Ciasto;

import Package_CiastoSliwkowe.Polowki;
import Package_CiastoSliwkowe.Zmiksowane;
import Package_Szarlotka.Cwiartki;
import Package_Szarlotka.Kostka;

public abstract class Ciasto {

    private String algorytmInfoJablko;
    private String algorytmInfoSliwka;

    public void wykonajSzarlotk�() {
        if (algorytmInfoJablko == null) {
            System.out.println("Dla szar�otki nie zosta�a ustawiona metoda przygotowania jablek");
        }
        else {
            if (algorytmInfoJablko.equalsIgnoreCase("kostka")) {
                Kostka szarlotka = new Kostka();
                szarlotka.przygotowanieJablka();
                System.out.println("Szarlotka zosta�a upieczona");
            }
            else {
                if (algorytmInfoJablko.equalsIgnoreCase("cwiartki")) {
                    Cwiartki szarlotka = new Cwiartki();
                    szarlotka.przygotowanieJablka();
                    System.out.println("Szarlotka zosta�a wypieczona");
                }
                else {
                    System.out.println("Nieznana metoda przygotowania jablek");
                }
            }
        }
    }

    public void wykonajCiastoSliwkowe() {
        if (algorytmInfoSliwka == null) {
            System.out.println("Dla ciasta �liwkowego nie zosta�a ustawiona metoda przygotowania jablek");
        }
        else {
            if (algorytmInfoSliwka.equalsIgnoreCase("zmiksowane")) {
                Zmiksowane ciastoSliwkowe = new Zmiksowane();
                ciastoSliwkowe.przygotowanieSliwki();
                System.out.println("Ciasto �liwkowe zosta�o upieczone");
            }
            else {
                if (algorytmInfoSliwka.equalsIgnoreCase("polowki")) {
                    Polowki ciastoSliwkowe = new Polowki();
                    ciastoSliwkowe.przygotowanieSliwki();
                    System.out.println("Ciasto �liwkowe zosta�o upieczone");
                }
                else {
                    System.out.println("Nieznana metoda przygotowania �liwek");
                }
            }
        }
    }

    public void ustawSzarlotke() {
        System.out.println("\nPlanuje si� wypieka� szarlotk�");
        algorytmInfoSliwka = null;
    }

    public void ustawCiastoSliwkowe() {
        System.out.println("\nPlanuje si� wypieka� ciasto �liwkowe");
        algorytmInfoJablko = null;
    }

    public String getAlgorytmInfoJablko() {
        return algorytmInfoJablko;
    }

    public void setAlgorytmInfoJablko(String algorytmInfoJablko) {
        this.algorytmInfoJablko = algorytmInfoJablko;
    }

    public String getAlgorytmInfoSliwka() {
        return algorytmInfoSliwka;
    }

    public void setAlgorytmInfoSliwka(String algorytmInfoSliwka) {
        this.algorytmInfoSliwka = algorytmInfoSliwka;
    }
}
