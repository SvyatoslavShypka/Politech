package Projekt_Main;

import Pies_Obroża.Pies;

public class Projekt_Zawieranie_Obiektow {
    public static void main(String[] args) {
        Pies pies_domyslny = new Pies();
        System.out.println("Pies domyślny : ");
        pies_domyslny.getStan();
        System.out.println(pies_domyslny.Szczeka());
        System.out.println(pies_domyslny.Aport(true) + "\n\n");
        Pies pies1 = new Pies(0.3f, "Owczarek", false, false);
        Pies pies2 = new Pies(3f, "Labrador", false, false);
        Pies pies3 = new Pies(2f, "Bokser", false, false);
        Pies pies4 = new Pies(5f, "Pitbull", true, false);
        pies3.getStan();
        System.out.println(pies3.Szczeka());
        System.out.println(pies3.Aport(true) + "\n\n");
        pies4.getStan();
        System.out.println(pies4.Szczeka());
        System.out.println(pies4.Aport(false) + "\n\n");
//Zmiana stanu___________________________
        pies4.setCzyGroźny(false);
        pies4.getStan();
        System.out.println(pies4.Szczeka());
//_______________________________________
//Kupujemy obrożę dla Psa 4 - czyli Naszego Pitbulla____
        pies4.ZakupObrozy(true, true, "czerwony");
//______________________________________________________
//Szczepimy Psa 4 ______________________________________
        pies4.Szczepienie(); //Czyli this w metodzie sczepienie w klasie Pies, będzie wskazywał właśnie na Psa 4 (Pitbulla)
        System.out.println("\nWeterynarz wykonał szczepienie\n\n");
//______________________________________________________
//Informcje dotyczące naszego Pitbilla__________________
        pies4.getStan();
        if (pies4.getObroza() != null) (pies4.getObroza()).getStan();
        pies3.ZakupObrozy(true,true,"green");
        pies3.getObroza().getStan();
//______________________________________________________
    }
}
