package Jedzenie;

import Frytki.Frytki;
import Pizza.Pizza;

import java.io.*;


public abstract class Jedzenie implements Serializable {

    private static final long serialVersionUID = 3895670990255762290L;

    protected Pizza pizza;
    protected Frytki frytki;


    private String AlgorytmInfoPizza;
    private String AlgorytmInfoFrytki;


    public void pzyrzadzJedzenie(int nr_Jedzenia) {

        switch(nr_Jedzenia) {

            case 1 :
                pizza.przyrzadzPizze();
                break;
            case 2 :
                frytki.usmazFrytki();
                break;
            default : System.out.println("Brak wybranego jedzenia");
        }

    }


    public void zamowienie(int nr_Jedzenia, Pizza pizza, String AlgorytmInfoPizza, Frytki frytki, String AlgorytmInfoFrytki ){

        switch (nr_Jedzenia){

            case  1:
                if (pizza != null){
                    this.pizza = pizza;
                    this.AlgorytmInfoPizza = AlgorytmInfoPizza;
                    System.out.println("Przyjęto zamówienie na pizze. " + getAlgorytmInfoPizza());
                }
                break;
            case 2:
                if(frytki != null){
                    this.frytki = frytki;
                    this.AlgorytmInfoFrytki = AlgorytmInfoFrytki;
                    System.out.println("Przyjęto zamówienie na frytki");
                }
                break;

            default:
                System.out.println("Nie ma tego w menu");


        }


    }

    public void wyswietlInfo(){

        if(getAlgorytmInfoPizza() != null){
            System.out.println(getAlgorytmInfoPizza());

        }
        else if (getAlgorytmInfoFrytki() != null) {
            System.out.println(getAlgorytmInfoFrytki());

        }

    }
    public String getAlgorytmInfoPizza() {
        return AlgorytmInfoPizza;
    }

    public void setAlgorytmInfoPizza(String algorytmInfoPizza) {
        AlgorytmInfoPizza = algorytmInfoPizza;
    }

    public String getAlgorytmInfoFrytki() {
        return AlgorytmInfoFrytki;
    }

    public void setAlgorytmInfoFrytki(String algorytmInfoFrytki) {
        AlgorytmInfoFrytki = algorytmInfoFrytki;
    }

    @Override
    public String toString() {
        return "Jedzenie{" +
                "pizza=" + pizza +
                ", frytki=" + frytki +
                ", AlgorytmInfoPizza='" + AlgorytmInfoPizza + '\'' +
                ", AlgorytmInfoFrytki='" + AlgorytmInfoFrytki + '\'' +
                '}';
    }
}
