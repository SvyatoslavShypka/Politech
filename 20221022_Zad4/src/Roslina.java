public class Roslina {
    public int dlugosc;

    public Roslina() {
        dlugosc = 1;
    }

    void Rosnij() {
        if (dlugosc > 0) {
            dlugosc++;
            System.out.println("Roslina wyrosla na 1 cm");
        }
    }

    void RosnijDuzo(int a) {
        if (dlugosc > 0) {
            System.out.println("Roslina wyrosla na " + a + " cm");
            dlugosc = dlugosc + a;
        }
    }

    void Pokaz() {
        System.out.println("Dlugosc rosliny: " + dlugosc + " cm");
    }
}
