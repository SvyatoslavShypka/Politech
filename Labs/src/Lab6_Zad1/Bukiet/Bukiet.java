package Lab6_Zad1.Bukiet;

public class Bukiet {

    private Kwiat kwiat;
    boolean dostepny = false;

    public Bukiet() {
    }

    public Bukiet(Kwiat kwiat) {
        this.kwiat = kwiat;
    }

    public Kwiat getKwiat() {
        return kwiat;
    }

    public void setKwiat(Kwiat kwiat) {
        this.kwiat = kwiat;
    }

    public boolean isDostepny() {
        return dostepny;
    }

    public void setDostepny(boolean dostepny) {
        this.dostepny = dostepny;
    }

    public String getStan() {
        return " kwiat = " + kwiat.getNazwa() + " dostępny = " + this.isDostepny();
    }
}
