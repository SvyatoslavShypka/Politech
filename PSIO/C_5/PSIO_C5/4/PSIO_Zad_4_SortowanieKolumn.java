import java.util.Random;

public class PSIO_Zad_4_SortowanieKolumn {

    static int[][] macierz = new int[10][20];
    static Random rand = new Random();

    public static void main(String[] args) {
        wypelnijMacierz(macierz);
        wyswlietlMacierz(macierz);
        sortujPoKolumnachBabelkowo(macierz);
        wyswlietlMacierz(macierz);
    }

    private static void sortujPoKolumnachBabelkowo(int[][] macierz) {
        int tmp;
        for (int j = 0; j < macierz[0].length; j++) {
            for (int k = 1; k < macierz.length - 1; k++) {
                for (int i = 0; i < macierz.length - k; i++) {
                    if (macierz[i][j] > macierz[i+1][j]) {
                        tmp = macierz[i+1][j];
                        macierz[i+1][j] = macierz[i][j];
                        macierz[i][j] = tmp;
                    }
                }
            }
        }
    }

    private static void wyswlietlMacierz(int[][] macierz) {

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.printf("%4d", macierz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void wypelnijMacierz(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                 macierz[i][j] = rand.nextInt(10) + 1;
            }
        }
    }

}