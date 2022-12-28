package Frytki;

public class SmazoneNaOlejuRzepakowym implements Frytki{


    @Override
    public String metodaSmazenia() {
        return "Na oleju rzepakowym";
    }

    @Override
    public void usmazFrytki() {
        System.out.println("Frytki usmażone na oleju rzepakowym");
    }
}
