package Lista4Zad3;

import java.util.Random;

public class Lista4Zad3_MnozenieMacierzy_Extended {

    private static Random rand = new Random();

    public static void main(String[] args) {

        int[][] a = new int[rand.nextInt(4) + 2][rand.nextInt(4) + 2];
        System.out.println("a - " + a.length + " : " + a[0].length);
        int[][] b = new int[a[0].length][rand.nextInt(4) + 2];
        System.out.println("b - " + b.length + " : " + b[0].length);
        a = WypelnienieMacierzy(a);
        b = WypelnienieMacierzy(b);

        mnozenieMacierzy(a, b);
    }

    private static int[][] WypelnienieMacierzy(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = rand.nextInt(21) - 10;
                System.out.printf("%5d", a[i][j]);
//                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }

    public static int[][] mnozenieMacierzy(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        int suma;

        for (int w = 0; w < c.length; w++) {
            for (int k = 0; k < c[0].length; k++) {
                suma = 0;
                for (int i = 0; i < a[0].length; i++) {
                suma = suma + a[w][i] * b[i][k];
                }
                c[w][k] = suma;
                System.out.printf("%5d", c[w][k]);
//                System.out.print(c[w][k] + "\t");
            }
            System.out.println();
        }
        return c;
    }
}
