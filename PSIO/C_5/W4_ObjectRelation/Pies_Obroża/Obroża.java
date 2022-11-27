package Pies_Obroża;

public class Obroża {
    //Składowe klasy_____________________
    private boolean CzySkóra;
    private boolean CzyPrzeciwKleszczom;
    private String Kolor;

    //___________________________________
//Konstruktor przeciążony:__________________________________________________
    public Obroża(boolean CzySkóra, boolean CzyPrzeciwKleszczom, String kolor) {
        this.CzySkóra = CzySkóra;
        this.CzyPrzeciwKleszczom = CzyPrzeciwKleszczom;
        this.Kolor = kolor;
    }

    //___________________________________________________________________________
//Metody typu get______________________________________________________________
    public boolean getCzySkora() {
        return CzySkóra;
    }

    public boolean getCzyPrzeciwKleszczom() {
        return CzyPrzeciwKleszczom;
    }

    public String getKolor() {
        return Kolor;
    }

    public void getStan() {
        System.out.println("Pies ! MA ! Obrożę - Kupiliśmy !");
        System.out.println("\tObroża: CzySkóra : " + getCzySkora() + "\t" + "CzyPrzeciwKleszczom : "
                + getCzyPrzeciwKleszczom() + "\t" + "Kolor :" + getKolor() + "\n\n");
    }

    //____________________________________________________________________________
//Metody typu set_____________________________________________________________
    public void setCzySkora(boolean CzySkóra) {
        this.CzySkóra = CzySkóra;
    }

    public void setCzyPrzeciwKleszczom(boolean CzyPrzeciwKleszczom) {
        this.CzyPrzeciwKleszczom = CzyPrzeciwKleszczom;
    }

    public void setkolor(String kolor) {
        this.Kolor = kolor;
    }
//____________________________________________________________________________
}
