
public abstract class Instrument {
    public String nazwa;

    public Instrument() {
        nazwa = "";
    }

    public Instrument(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return "Instrument o nazwie: " + nazwa;
    }

    public abstract String wydajDzwiek();

    public abstract void graj();

    public abstract int getIlosc();

}
