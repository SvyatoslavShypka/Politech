package Lista4Zad3;

public class Lista4Zad3_MnozenieMacierzy {

    public static void main(String[] args) {

        int[][] a = {
                {1,  2,  3},
                {4,  5,  6},
                {7,  8,  9},
                {10, 11, 12}
        };

        int[][] b = {
                {1,2},
                {3,4},
                {5,6}
        };
        mnozenieMacierzy(b, a);
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
                System.out.print(c[w][k] + "\t");
            }
            System.out.println();
        }
        return c;
    }
}
