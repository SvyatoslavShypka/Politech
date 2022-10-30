import NowyPackage.Pies;

public class FlyPies extends Pies {

    boolean canFly;

    public FlyPies(String name, String rasa, boolean canFly) {
        super(name, rasa);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "FlyPies{" +
                "canFly=" + canFly +
                ", name='" + name + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
