package Frytki;

public class SmazoneNaOlejuSlonecznikowym implements Frytki{

    @Override
    public String metodaSmazenia() {
        return "Na oleju słonecznikowym";
    }

    @Override
    public void usmazFrytki() {
        System.out.println("Frytki usmażone na oleju słonecznikowym");
    }
}
