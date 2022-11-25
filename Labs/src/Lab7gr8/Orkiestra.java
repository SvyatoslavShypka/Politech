public class Orkiestra {

    private Instrument[] tablica = new Instrument[20];

    private int n;

    public static void main(String[] args) {

        Orkiestra orkiestra1 = new Orkiestra();
        orkiestra1.tablica[0] = new InstrumentDety("trąbka", 1);
        orkiestra1.tablica[1] = new InstrumentDety("róg", 1);
        orkiestra1.tablica[2] = new InstrumentDety("puzon", 2);
        orkiestra1.tablica[3] = new InstrumentDety("klarnet", 1);
        orkiestra1.tablica[4] = new InstrumentDety("tuba", 3);

        orkiestra1.tablica[5] = new InstrumentSmyczkowy("skrzypce", 1);
        orkiestra1.tablica[6] = new InstrumentSmyczkowy("altówka", 4);
        orkiestra1.tablica[7] = new InstrumentSmyczkowy("wiolonczela", 1);
        orkiestra1.tablica[8] = new InstrumentSmyczkowy("kontrabas", 2);
        orkiestra1.odswiezIloscInstrumentow();

        System.out.println("Wszystkich wpisanych instrumentów jest: " + orkiestra1.n);
        System.out.println("Wszystkie instrumenty i ich dziwięki:");
        int najwięcejInstrumentow = 0;
        int indeks = 0;
        for (int i = 0; i < orkiestra1.tablica.length; i++) {
            if (orkiestra1.tablica[i] != null) {
                System.out.println(orkiestra1.tablica[i].toString());
                orkiestra1.tablica[i].graj();
                if (najwięcejInstrumentow < orkiestra1.tablica[i].getIlosc()) {
                    najwięcejInstrumentow = orkiestra1.tablica[i].getIlosc();
                    indeks = i;
                }
            }
        }
        System.out.println("Najwięcej instrumentów jest: " + orkiestra1.tablica[indeks] + " indeks w tablicy: " + indeks);

        orkiestra1.wyswietlInstrumentyDete();

        orkiestra1.wyswietlInstrumentySmyczkowe();

        System.out.println("Ilość kontrabasów: " + orkiestra1.iloscKontrabasow());



    }

    public void wyswietlInstrumentyDete() {
        System.out.println("Wyświetlenie instrumentów dętych:");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != null) {
                if (tablica[i] instanceof InstrumentDety) {
                    System.out.println(tablica[i].toString());
                }
            }
        }
    }

    public void wyswietlInstrumentySmyczkowe() {
        System.out.println("Wyświetlenie instrumentów smyczkowych:");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != null) {
                if (tablica[i] instanceof InstrumentSmyczkowy) {
                    System.out.println(tablica[i].toString());
                }
            }
        }
    }

    public int iloscKontrabasow() {
        int ilosc = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != null) {
                if (tablica[i] instanceof InstrumentSmyczkowy && ((InstrumentSmyczkowy) tablica[i]).jestKontrabasem()) {
                    ilosc = ilosc + tablica[i].getIlosc();
                }
            }
        }
        return ilosc;
    }

    public void odswiezIloscInstrumentow() {
        n = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != null) {
                n++;
            }
        }
    }
}