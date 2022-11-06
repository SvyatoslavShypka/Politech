package Lab6_Zad1.Projekt_Main;

import Lab6_Zad1.Bukiet.Bukiet;
import Lab6_Zad1.Bukiet.Kwiat;
import Lab6_Zad1.Florysta.Florysta;

import java.util.Random;

public class Main {

        private static int n = 5;
        private static Bukiet[] kwiaciarnia = new Bukiet[n];

    public static void main(String[] args) {


        Random g = new Random();

        for (int i = 0; i < n; i++) {
//            kwiaciarnia[i] = new Bukiet(new Kwiat(g.nextInt(6) + 1), g.nextBoolean());
            kwiaciarnia[i] = new Bukiet(new Kwiat(g.nextInt(6) + 1));
        }

        WyswietlBukiety();
        Florysta.tworzBukiet(kwiaciarnia[0]);
        Florysta.tworzBukiet(kwiaciarnia[4]);
        WyswietlBukiety();
        Florysta.sprzedajBukiet(kwiaciarnia[3]);
        WyswietlBukiety();
    }

    private static void WyswietlBukiety() {

        for (int i = 0; i < kwiaciarnia.length; i++) {
            System.out.println("Bukiet o indeksie = " + i + kwiaciarnia[i].getStan());
        }
    }
}
