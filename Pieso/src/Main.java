import NowyPackage.Pies;

public class Main {
    public static void main(String[] args) {
        Pies pies1 = new Pies("Szelka", "Sheltie");
        System.out.println(pies1);

        FlyPies flyka = new FlyPies("FlykaNazwa", "Buldog", true);
//        flyka.canFly = false;
        System.out.println(flyka);

    }
}
