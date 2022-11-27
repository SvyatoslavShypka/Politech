package Pies_Obroża;

import Weterynarz.Weterynarz;
    public class Pies
    {
        //Składowe klasy____________
        private float wiek;
        private String rasa;
        private boolean CzyGroźny;
        private boolean CzySzczepiony;
        //__________________________
/* Zawieranie się obiektów:
Psy mają obroże - więc jedna ze składowych klasy Pies,
będzie definiować obiekty klasy Obroża.*/
        private Obroża obr = null;
//__________________________

        //Konstruktor domyślny:______
        public Pies()
        {
            wiek = 0.1f;
            rasa = "Labrador";
            CzyGroźny = false;
            CzySzczepiony = false;
        }
        //__________________________
//Konstruktor przeciążony:____________________________________
        public Pies(float wiek, String rasa, boolean CzyGroźny, boolean CzySzczepiony)
        {
            this.wiek = wiek;
            this.rasa = rasa;
            this.CzyGroźny = CzyGroźny;
            this.CzySzczepiony = CzySzczepiony;
        }
        //___________________________________________________________
//Metody klasy:______________________________________________
        public String Szczeka() {
            if (CzyGroźny) return "Agresywne szczekanie ...";
            else return "Normalne szczekanie ...";
        }
        public String Aport(boolean T) {
            if (T) return "Potrafi aportować...";
            else return "Nie potrafi aportować...";
        }

        //Weterynarz_____________________________________________
        public void Szczepienie() {
/* Właśnie w tym miejscu wykonujemy szczepienie - tzn.:
przekazujemy bieżąco używany obiekt typu pies do weterynarza.
Jak uzyskać do tego psa dostęp ? - właśnie do tego służy wskaźnik this,
Wskaźnik ten stanowi 'uchwyt' na bieżąco używany obiekt w ramach klasy.*/
//użycie referencji 'this'***********
            Weterynarz.WykonajSzczepienie(this);
//***********************************
/* Nie potrzebujemy tworzyć obiekt weterynarza, ponieważ metoda 'szczepionca' w klasie Weterynarz jest statyczna. Statyczne metody są własnością klasy i uruchamiamy je poprzez nazwę klasy.
Z metod statycznych korzystaj, jeśli implementujesz usługę - tj. weterynarz wykonuje usługę szczepienia,
on sam jako obiekt nas nie interesuje (przynajmniej w tym projekcie).*/
        }
        //_______________________________________________________
//metody typu get (Pozyskanie stanu obiektu)______________________
        public float getWiek()
        {
            return wiek;
        }
        public String getRasa()
        {
            return rasa;
        }
        public boolean getCzyGroźny()
        {
            return CzyGroźny;
        }
        public boolean getSzczepienie(boolean CzySzczepiony)
        {
            return CzySzczepiony;
        }
        public void getStan() {
            System.out.println("Wiek : " + wiek + "\t" + "Rasa : "
                    + rasa + "\t" + "Czy Groźny ? :" + CzyGroźny + "\t" + "Czy jest sczepiony ? : " + CzySzczepiony);
        }
        //____________________________________________________________
//metody typu set (Zmiana stanu obiektu)
        public void setWiek(float wiek)
        {
            this.wiek=wiek;
        }
        public void setRasa(String rasa)
        {
            this.rasa = rasa;
        }
        public void setCzyGroźny(boolean CzyGroźny)

        {
            this.CzyGroźny=CzyGroźny;
        }
        public void setSzczepienie(boolean CzySzczepiony)
        {
            this.CzySzczepiony = CzySzczepiony;
        }
        //_____________________________________________________________
/* W tej właśnie metodzie tworzymy instancję obroży i wiążemy ją z bieżąco 'używanym' Psem.
Jeśli jej nie użyjemy dla określonego Psa, to jego składowa Obroża będzie Null.*/
//Obroża (Set-er)____________________________________________________________________
        public void ZakupObrozy(boolean CzySkora, boolean CzyPrzeciwKleszczom, String kolor)
        {
            obr = new Obroża(CzySkora, CzyPrzeciwKleszczom, kolor);
        }
        //___________________________________________________________________________________
//Obroża Get-er
        public Obroża getObroza()
        {
            return obr;
        }
//__________________________________________________________________________________

    }