import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String wprowadzoneDane;
        double x;
        int n = 0;

        do {
            System.out.print("Wprowadz naturalne N: ");
            wprowadzoneDane = reader.readLine();
            try {
                n = Integer.parseInt(wprowadzoneDane);
            }
            catch (NumberFormatException e) {
                System.out.println("Wprowadzone dane nie sa liczba naturalna");
            }
        } while (n <= 0);

        while (true) {
            System.out.print("Wprowadz rzeczywiste X: ");
            wprowadzoneDane = reader.readLine();
            try {
                x = Double.parseDouble(wprowadzoneDane);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Wprowadzone dane nie sa liczba");
            }
        }
        System.out.println("Wynik: " + funkcjaS(n, x));
    }

    public static double funkcjaS(int n, double x) {
        double result;
        if (x < -1) {
            result = 2/3.0;
        }
            else if (x > 1) {
                long fact;
                result = 0;
                for(int i = 1; i <= n; i++) {
                fact = 1;
                for(int j = 2; j <= i; j++) {
                    fact = fact * j;
                }
                result = result + (x + i) / fact;
                }
        }
            else {
                result = Math.sin(x) + Math.pow(x, 2);
        }
        return result;
    }
}
