public class Konwerter {

    private static final double przelicznik = 1.8;

    private static double CelsiuszToFahrenheit(double celsiusz) {
        return celsiusz * przelicznik + 32;
    }

    private static double FahrenheitToCelsiusz(double fahrenheit) {
        return (fahrenheit - 32) / przelicznik;
    }


}
