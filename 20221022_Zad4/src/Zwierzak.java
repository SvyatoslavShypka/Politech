
public class Zwierzak {

    void Zjedz(Roslina x, int a){
        if (x.dlugosc <= a) {
            System.out.println("Zwierzak zjadl cala rosline");
            x.dlugosc = 0;
        }
        else {
            System.out.println("Zwierzak zjada " + a + " cm rosliny");
            x.dlugosc = x.dlugosc - a;
        }
    }
}
