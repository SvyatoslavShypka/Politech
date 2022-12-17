package Package_Ciasto;

public class PieczeBabcia extends Ciasto{
    public void PieczeBabcia(){
        System.out.println("Babcia piecze\n");
        if (getAlgorytmInfoJablko() != null) {
            wykonajSzarlotkê();
        }
        else if (getAlgorytmInfoSliwka() != null) {
            wykonajCiastoSliwkowe();
        }
        else {
            System.out.println("Babcia nie otrzyma³a zamówienia");
        }
    }

    public void wyswietlInfo() {
        if (getAlgorytmInfoJablko() != null) {
            System.out.println("\nPlanuje siê wypiekaæ szarlotkê, jab³ka krojone jako: " + getAlgorytmInfoJablko());
        }
        else if (getAlgorytmInfoSliwka() != null) {
            System.out.println("\nPlanuje siê wypiekaæ ciasto œliwkowe, œliwki: " + getAlgorytmInfoSliwka());
        }
        else {
            System.out.println("Babcia nie otrzyma³a zamówienia");
        }
    }

}
