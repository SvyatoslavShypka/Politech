public class InstrumentDety extends Instrument{

    private int lt;

    public InstrumentDety() {
        super("ZlotaTrabka");
        lt = 1;
    }

    public InstrumentDety(String nazwa, int a) {
        super(nazwa);
        lt = a;
    }

    @Override
    public String wydajDzwiek() {
        return "Tra ta ta";
    }

    @Override
    public void graj() {
        for (int i = 0; i < lt; i++) {
        System.out.println(wydajDzwiek());
        }
    }

    @Override
    public String toString() {

        return "Instrument dęty: " + nazwa + " lt=" + lt;
    }

    public int getIlosc() {
        return lt;
    }
}
