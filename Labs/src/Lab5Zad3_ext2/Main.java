package Lab5Zad3_ext2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static int n = 100;
    public static Konto[] bank = new Konto[n];
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Random k = new Random();
        double suma;
        Random rand = new Random();
        BigInteger result;
        BigInteger min = BigDecimal.valueOf(Double.MAX_VALUE).toBigInteger();
        BigInteger max = BigDecimal.valueOf(Double.MIN_VALUE).toBigInteger();

        for (int i = 0; i < n; i++) {
            result = (new BigInteger(86, rand)).add(new BigDecimal("1E25").toBigInteger());
            suma = Double.parseDouble(df.format(k.nextDouble() * 1000000).replaceAll(",", "."));
            bank[i] = new Konto(result, suma);
// Test place
/*
            if (result.toString().length() != 26) {
                throw new IllegalArgumentException("ai ja jaj");
            }
            min = min.min(result);
            max = max.max(result);
            System.out.println(i);
            System.out.println("12345678901234567890123456");
            System.out.println(min + "    min");
            System.out.println(max + "    max");
*/
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

    public static void WyswietlanieTablicy() {
            for (Konto k: bank
                 ) {
                k.getStan();
            }
        }
}
