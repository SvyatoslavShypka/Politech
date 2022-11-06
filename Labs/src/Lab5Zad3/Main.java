package Lab5Zad3;

import java.util.Random;

public class Main {

    private static int n = 5;
    private static Konto[] bank = new Konto[n];

    public static void main(String[] args) {

        Random k = new Random();

        for (int i = 0; i < n; i++) {
            bank[i] = new Konto(k.nextInt(999999999), k.nextDouble() * 1000000);
        }
        WyswietlanieTablicy();
        WyswietlNajwyzszeSaldo();

    }

    private static void WyswietlNajwyzszeSaldo() {
        double max = 0;
        Konto kontoMaxSaldo = bank[0];
        for (Konto k: bank
             ) {
            if (max < k.getSaldo()) {
                max = k.getSaldo();
                kontoMaxSaldo = k;
            }
        }
        System.out.println("Konto z najwyższym saldem:");
        kontoMaxSaldo.getStan();
    }

    private static void WyswietlanieTablicy() {
            for (Konto k: bank
                 ) {
                k.getStan();
            }
        }
}
