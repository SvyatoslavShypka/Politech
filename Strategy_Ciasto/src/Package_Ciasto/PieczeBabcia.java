package Package_Ciasto;

public class PieczeBabcia extends Ciasto{
    public void PieczeBabcia(){
        System.out.println("Babcia piecze\n");
        if (getAlgorytmInfoJablko() != null) {
            wykonajSzarlotk�();
        }
        else if (getAlgorytmInfoSliwka() != null) {
            wykonajCiastoSliwkowe();
        }
        else {
            System.out.println("Babcia nie otrzyma�a zam�wienia");
        }
    }

    public void wyswietlInfo() {
        if (getAlgorytmInfoJablko() != null) {
            System.out.println("\nPlanuje si� wypieka� szarlotk�, jab�ka krojone jako: " + getAlgorytmInfoJablko());
        }
        else if (getAlgorytmInfoSliwka() != null) {
            System.out.println("\nPlanuje si� wypieka� ciasto �liwkowe, �liwki: " + getAlgorytmInfoSliwka());
        }
        else {
            System.out.println("Babcia nie otrzyma�a zam�wienia");
        }
    }

}
