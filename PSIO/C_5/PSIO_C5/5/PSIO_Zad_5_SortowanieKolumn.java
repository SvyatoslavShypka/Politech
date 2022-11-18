import java.util.Random;

public class PSIO_Zad_5_SortowanieKolumn {

    static int[][] macierz = new int[10][];
    static Random rand = new Random();

    public static void main(String[] args) {
        wypelnijMacierz(macierz);
        wyswlietlMacierz(macierz);
        sortujPoWierszachBabelkowo(macierz);
        wyswlietlMacierz(macierz);
    }

    private static void sortujPoWierszachBabelkowo(int[][] macierz) {
        int tmp;
        for (int i = 0; i < macierz.length; i++) {
            for (int k = 1; k < macierz[i].length; k++) {
                for (int j = 0; j < macierz[i].length - k; j++) {
                    if (macierz[i][j] > macierz[i][j+1]) {
                        tmp = macierz[i][j+1];
                        macierz[i][j+1] = macierz[i][j];
                        macierz[i][j] = tmp;
                    }
                }
            }
        }
    }

    private static void wyswlietlMacierz(int[][] macierz) {

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.printf("%4d", macierz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void wypelnijMacierz(int[][] macierz) {
        int n;
        for (int i = 0; i < macierz.length; i++) {
            n = rand.nextInt(10) + 1;
            macierz[i] = new int[n];
            for (int j = 0; j < n; j++) {
                 macierz[i][j] = rand.nextInt(10);
            }
        }
    }

}
