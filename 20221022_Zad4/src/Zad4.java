
public class Zad4 {

    public static void main(String[] args) {
        Roslina roslina = new Roslina();
        roslina.Rosnij();
        roslina.Pokaz();
        roslina.RosnijDuzo(10);
        roslina.Pokaz();

        Zwierzak zwierzak = new Zwierzak();
        zwierzak.Zjedz(roslina, 11);
        roslina.Pokaz();
    }
}
