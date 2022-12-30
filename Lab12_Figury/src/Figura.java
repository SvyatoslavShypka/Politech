

public abstract class Figura {
    String kolor;
    int a;
    int b;

    public Figura(String kolor, int a, int b) {
        this.kolor = kolor;
        this.a = a;
        this.b = b;
    }

    public Figura() {
        this.kolor = "przejrzysty";
        this.a = 1;
        this.b = 1;
    }

    abstract int Obwod();
}
