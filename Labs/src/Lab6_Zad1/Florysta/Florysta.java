package Lab6_Zad1.Florysta;

import Lab6_Zad1.Bukiet.Bukiet;

public class Florysta {

    public static void tworzBukiet(Bukiet bukiet) {
        bukiet.setDostepny(true);
    }

    public static boolean sprzedajBukiet(Bukiet bukiet) {
        if (!bukiet.isDostepny()) {
            System.out.println("brak bukietu " + bukiet.getKwiat().getNazwa());
            return false;
        }
        bukiet.setDostepny(false);
        return true;
        }
}
