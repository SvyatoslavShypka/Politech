package Biblioteka;

public class Biblioteka {

    public static double sinus(double x, int n)
    {

        double suma = x;
        double l = x;
        double m = 1;

        for(int k = 1; k<=n; k++)
        {
             l = l * (x*x);
            m = m * (2*k)*(2*k+1);

            if(k%2==0)

            {
                suma = suma + l/m;
            }

            else
            {
                suma = suma - (l/m);
            }

        }
        return suma;
    }

    public static double cosinus(double x, int n) {

        double suma = 1, l = 1, m=1;

        for (int k = 1; k<= n; k++) {
            l = l * x*x;
            m = m*2*k*(2*k-1);

            if(k%2==0)
                suma+=(l/m);

            else
                suma-=(l/m);

        }
        return suma;
    }

    public static double expon(double x, int n) {

        double suma = 1, ulamek = 1;

        for (int i = 1; i <= n; i++) {
            ulamek = ulamek * x / i;
            suma += ulamek;
        }
        return suma;
    }

}
