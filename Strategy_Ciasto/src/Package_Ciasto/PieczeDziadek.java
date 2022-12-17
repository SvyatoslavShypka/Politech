package Package_Ciasto;

public class PieczeDziadek extends Ciasto{
    public void PieczeDziadek(){
        System.out.println("Dziadek piecze\n");
        if (getAlgorytmInfoJablko() != null) {
            wykonajSzarlotkê();
        }
        else if (getAlgorytmInfoSliwka() != null) {
            wykonajCiastoSliwkowe();
        }
        else {
            System.out.println("Dziadek nie otrzyma³ zamówienia");
        }
    }

    public void wyswietlInfo() {
        if (getAlgorytmInfoJablko() != null) {
            System.out.println("Planuje siê wypiekaæ szarlotkê, jab³ka krojone jako: " + getAlgorytmInfoJablko());
        }
        else if (getAlgorytmInfoSliwka() != null) {
            System.out.println("Planuje siê wypiekaæ ciasto œliwkowe, œliwki: " + getAlgorytmInfoSliwka());
        }
        else {
            System.out.println("Dziadek nie otrzyma³ zamówienia");
        }
    }

}
