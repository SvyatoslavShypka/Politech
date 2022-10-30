public class NiezrobioneZad2 {

    static int pierwszyElementLicznika = -2;
    static int pierwszyElementMianownika = 2;
    static int licznik = pierwszyElementLicznika;
    static int mianownik = pierwszyElementMianownika;

    public static void main(String[] args) {

        int n = 10;

            licznik = pierwszyElementLicznika;
            mianownik = pierwszyElementMianownika;

            for (int i = 2; i <= n; i++) {
                System.out.println("Elementy licznika: " + elementLicznika(i));
                licznik = licznik + elementLicznika(i);
                System.out.println("Elementy mianownika: " + elementMianownika(i));
                mianownik = mianownik * elementMianownika(i);
//                System.out.println("mianownik = " + mianownik);
            }
//            System.out.println(licznik);
//            System.out.println(mianownik);
            System.out.println("Wartosc wyrazenia: " + wartoscWyrazenia());
    }

    private static double wartoscWyrazenia() {
        return (double) licznik / mianownik;
    }

    private static int elementMianownika(int i) {
        return pierwszyElementMianownika + 3 * (i - 1);
    }

    private static int elementLicznika(int i) {
        int result;
        if (i % 2 == 0) {
            result = 7 + 10 * (i/2-1);
        }
        else {
            result = pierwszyElementLicznika - 10 * (i / 2);
        }
        return result;
    }
}
