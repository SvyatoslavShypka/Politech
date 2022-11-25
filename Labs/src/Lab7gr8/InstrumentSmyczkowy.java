public class InstrumentSmyczkowy extends Instrument {

    private int ls;

    public InstrumentSmyczkowy() {
        super("Stradivarius");
        ls = 1;
    }

    @Override
    public String wydajDzwiek() {
        return "Smyk smyk smyk";
    }

    @Override
    public void graj() {
        for (int i = 0; i < ls; i++) {
            System.out.println(wydajDzwiek());
        }
    }

    @Override
    public String toString() {
            return "Instrument smyczkowy: " + nazwa + " ls=" + ls;
    }

    public boolean jestKontrabasem() {
        return nazwa.equals("kontrabas");
    }


    public InstrumentSmyczkowy(String nazwa, int a) {
        super(nazwa);
        ls = a;
    }

    public int getIlosc() {
        return ls;
    }
}
