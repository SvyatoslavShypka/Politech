public class Tablica2D_2 {

//    n i w (przy for) ilosc wierszy
//    k ilosc kolumn

    public static int n = 5;
    public static int k;
    public static int[][] tablica = new int[n][];

    public static void main(String[] args) {


        System.out.println("Ilość n (wierszy): " + n);
        System.out.println("Długość tablicy: " + tablica.length);

        int d = 0;

       for(int w = 0; w<n; w++)
       {
           // w liscie tworzymy nową listę w+1, aby zmiescily się tam wszystkie elementy, bo w - (numer wiersza) jest o jeden mniejszy od ilosci elementów
           // które mają w nim być
           tablica[w] = new int[w+1];

           for (int k = 0; k<=w; k++)
           {
               tablica [w][k] = ++d;
           }

       }
        WypiszElementy();


    }


    private static void WypiszElementy() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++){
                System.out.print(tablica[i][j] + "\t");

            }

            System.out.println();
        }
    }

}


