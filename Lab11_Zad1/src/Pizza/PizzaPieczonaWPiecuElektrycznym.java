package Pizza;

public class PizzaPieczonaWPiecuElektrycznym implements Pizza {


    @Override
    public String metodaPieczenia() {
        return "Pieczona w piecu elektrycznym";
    }

    @Override
    public void przyrzadzPizze() {
        System.out.println("Pizza upieczona w piecu elektrycznym");
    }
}
