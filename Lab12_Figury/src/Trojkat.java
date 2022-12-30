public class Trojkat extends Figura {
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isJestTrojkatem() {
        return jestTrojkatem;
    }

    public void setJestTrojkatem(boolean jestTrojkatem) {
        this.jestTrojkatem = jestTrojkatem;
    }

    private boolean jestTrojkatem;

    public Trojkat(String kolor, int a, int b, int c) {
        super(kolor, a, b);
        this.c = c;
        if (a > Math.abs(b - c) && a < (b + c)) {
            this.jestTrojkatem = true;
        }
        else {
            this.jestTrojkatem = false;
        }
    }

    public Trojkat() {
        super();
        this.c = 1;
        if (a > Math.abs(b - c) && a < (b + c)) {
            this.jestTrojkatem = true;
        }
        else {
            this.jestTrojkatem = false;
        }
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "kolor='" + kolor + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", jestTrojkatem=" + jestTrojkatem +
                '}';
    }

    @Override
    int Obwod() {
        if (isJestTrojkatem()) {
        return a + b + c;
        }
        return 0;
    }
}
