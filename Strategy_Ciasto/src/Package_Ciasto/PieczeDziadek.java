package Package_Ciasto;

public class PieczeDziadek extends Ciasto{
    public void PieczeDziadek(){
        System.out.println("Dziadek piecze\n");
        if (getAlgorytmInfoJablko() != null) {
            wykonajSzarlotk�();
        }
        else if (getAlgorytmInfoSliwka() != null) {
            wykonajCiastoSliwkowe();
        }
        else {
            System.out.println("Dziadek nie otrzyma� zam�wienia");
        }
    }

    public void wyswietlInfo() {
        if (getAlgorytmInfoJablko() != null) {
            System.out.println("Planuje si� wypieka� szarlotk�, jab�ka krojone jako: " + getAlgorytmInfoJablko());
        }
        else if (getAlgorytmInfoSliwka() != null) {
            System.out.println("Planuje si� wypieka� ciasto �liwkowe, �liwki: " + getAlgorytmInfoSliwka());
        }
        else {
            System.out.println("Dziadek nie otrzyma� zam�wienia");
        }
    }

}
