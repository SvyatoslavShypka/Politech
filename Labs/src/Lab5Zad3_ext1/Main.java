package Lab5Zad3_ext1;

import Lab5Zad3.Konto;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    private static int n = 1000;
    private static Konto[] bank = new Konto[n];
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Random k = new Random();
        double suma;

        for (int i = 0; i < n; i++) {
            suma = Double.parseDouble(df.format(k.nextDouble() * 1000000).replaceAll(",", "."));
            bank[i] = new Konto(k.nextInt(899999999) + 100000000, suma);
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
