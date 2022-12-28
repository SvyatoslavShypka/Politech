package Main;

import Frytki.Frytki;
import Frytki.SmazoneNaOlejuRzepakowym;
import Frytki.SmazoneNaOlejuSlonecznikowym;
import Jedzenie.Jedzenie;
import Jedzenie.SerwisKucharza;
import Jedzenie.SerwisSzefaKuchni;
import Pizza.Pizza;
import Pizza.PizzaPieczonaWPiecuElektrycznym;
import Pizza.PizzaPieczonaWPiecuKamiennym;

import java.util.Scanner;

public class Uruchom {
        private static SerwisSzefaKuchni serwisSzefaKuchni = null;
        private static SerwisSzefaKuchni serwisSzefaKuchniRead = null;
        private static SerwisKucharza serwisKucharza = null;
        private static SerwisKucharza serwisKucharzaRead = null;
        private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        Uruchom test = new Uruchom();


        System.out.println("Zloz zamowienie");
        System.out.println("Od szefa kuchni - 1, od kucharza - 2");

        int cook = 1;
        cook  = sc.nextInt();
        if (cook == 1){
        serwisSzefaKuchni = new SerwisSzefaKuchni();
            Menu(serwisSzefaKuchni);
        }
        else if (cook == 2){
           serwisKucharza = new SerwisKucharza();
            Menu(serwisKucharza);
        }

        else{
            System.out.println("Złe dane");
        }
    }



    private  static void Menu(Jedzenie cook){

        int typJedzenia = 1;
        int metodaGotowania = 1;
        Pizza pizza = null;
        Frytki frytki = null;

            System.out.println("Wybierz 1, aby zamówić  Pizze" + "\nWybierz 2, aby zamówić Frytki \n");
            typJedzenia = sc.nextInt();
            if(typJedzenia == 1){
                System.out.println("W jakim piecu? 1 - Kamienny" + " 2 - Elektryczny");
                metodaGotowania = sc.nextInt();
                if(metodaGotowania == 1){
                    pizza = new PizzaPieczonaWPiecuKamiennym();

                }
                else if (metodaGotowania == 2) {

                    pizza = new PizzaPieczonaWPiecuElektrycznym();

                }

                else{
                    System.out.println("Złe dane");
                }
                cook.zamowienie(typJedzenia, pizza, pizza.metodaPieczenia(), null, null);
                cook.wyswietlInfo();
                cook.pzyrzadzJedzenie(typJedzenia);
            }



                else if (typJedzenia == 2) {
                    System.out.println("Na jakim oleju?");
                    System.out.println("1 - Olej słonecznikowy, 2 - Olej rzepakowy");
                    metodaGotowania = sc.nextInt();

                    if(metodaGotowania == 1){

                        frytki = new SmazoneNaOlejuSlonecznikowym();


                    }

                    else if(metodaGotowania == 2){
                        frytki = new SmazoneNaOlejuRzepakowym();

                    }
                        else{
                         System.out.println("Złe dane");
                        }
                        cook.zamowienie(typJedzenia, null, null, frytki, frytki.metodaSmazenia());
                        cook.wyswietlInfo();
                        cook.pzyrzadzJedzenie(typJedzenia);
            }


    }

    }


