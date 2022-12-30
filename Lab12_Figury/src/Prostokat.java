public class Prostokat extends Figura{
    private boolean jestKwadratem;

    public Prostokat(String kolor, int a, int b) {
        super(kolor, a, b);
        if (a == b) {
            jestKwadratem = true;
        }
        else {
            jestKwadratem = false;
        }
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "kolor='" + kolor + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", jestKwadratem=" + jestKwadratem +
                '}';
    }

    public Prostokat() {
        a = 1;
        b = 1;
        jestKwadratem = true;
    }

    public boolean isJestKwadratem() {
        return jestKwadratem;
    }

    public void setJestKwadratem(boolean jestKwadratem) {
        this.jestKwadratem = jestKwadratem;
    }

    @Override
    int Obwod() {
        return (a + b) * 2;
    }
}
