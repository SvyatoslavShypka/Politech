package Pizza;

public class PizzaPieczonaWPiecuKamiennym implements Pizza{


    @Override
    public String metodaPieczenia() {
        return "Pieczona w piecu kamiennym";
    }

    @Override
    public void przyrzadzPizze() {
        System.out.println("Pizza upieczona w piecu kamiennym");
    }
}
