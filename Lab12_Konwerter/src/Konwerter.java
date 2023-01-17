public class Konwerter {

    private static final double przelicznik = 1.8;

    public static String CelsiuszToFahrenheit(double celsiusz) {
        return String.valueOf(celsiusz * przelicznik + 32);
    }

    public static String FahrenheitToCelsiusz(double fahrenheit) {
        return String.valueOf((fahrenheit - 32) / przelicznik);
    }
}
