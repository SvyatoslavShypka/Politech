
import java.util.Random;

public class Lab5Zad2 {

//    public int k = 10;

    static int n = 10;
    static int[] array = new int[n];

    public static void main(String[] args) {

        Random g = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = g.nextInt(50);
        }

        printAll();
        System.out.println("Znaczenie minimalne: " + minValue());
        System.out.println("Iloczyn liczb nieparzystych: " + iloczynLiczbNieparzystych());
        System.out.println("Ilosc liczb nieparzystych: " + iloscLiczbNieparzystych());
    }

    private static void printAll() {
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + array[i]);
        }
    }

    private static int iloscLiczbNieparzystych() {
        int ilosc = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                ilosc = ilosc + 1;
            }
        }
        return ilosc;
    }

    private static int iloczynLiczbNieparzystych() {
        int iloczyn = 1;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                iloczyn = iloczyn * array[i];
            }
        }
        return iloczyn;
    }

    private static int minValue() {
        int min = array[0];
        for (int i = 1; i < n; i++) {
//            min = min > array[i] ? array[i] : min;
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


}
