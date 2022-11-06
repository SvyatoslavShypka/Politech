import org.apache.commons.math3.util.Precision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Prostokat {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private int dl1;

    private int dl2;

    public Prostokat()
    {
        x1 = 5;
        y1 = 10;
        x2 = -6;
        y2 = -3;
        dl1 = Math.abs(x1-x2);
        dl2 = Math.abs(y1-y2);
    }

    public Prostokat(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.dl1 = Math.abs(x1-x2);
        this.dl2 = Math.abs(y1-y2);
    }
    public int Pole()
    {
        return  ((dl1)*(dl2));
    }

    public int Obwod()

    {
        return  (2*dl1+2*dl2);
    }


    public double Przekatna()
    {
        return  Math.sqrt(Math.pow(Math.abs(dl1),2)+Math.pow(Math.abs(dl2),2));
    }

        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x1, x2, y1, y2;

            while (true) {
                try {
                    System.out.println("Wprowadz x1: ");
                    x1 = Integer.parseInt(reader.readLine());
                    System.out.println("Wprowadz y1: ");
                    y1 = Integer.parseInt(reader.readLine());
                    System.out.println("Wprowadz x2: ");
                    x2 = Integer.parseInt(reader.readLine());
                    System.out.println("Wprowadz y2: ");
                    y2 = Integer.parseInt(reader.readLine());

                    if ((x1 == x2) || (y1 == y2)) {
                        System.out.println("Dlugosc nie moze byc rowna zero");
                        continue;
                    }

                break;
                } catch (IOException e) {
                    System.out.println("Wprowadz prawidlowe dane");
                }
            }

            Prostokat p1 = new Prostokat(x1, y1, x2, y2);
//            System.out.println(p1.x1 + " " + p1.y1 +" " + p1.x2 + " " + p1.y2 + p1.dl1 + " " + p1.dl2);
            System.out.println("Pole: " + p1.Pole());
            System.out.println("Obwod: " + p1.Obwod());
            System.out.println("Przekatna: " + p1.Przekatna());
            System.out.println("Przekatna: " + Precision.round(p1.Przekatna(), 4));

            System.out.println("\n");

            Prostokat p2 = new Prostokat();
            System.out.println("Pole: " + p2.Pole());
            System.out.println("Obwod: " + p2.Obwod());
            System.out.println("Przekatna: " + p2.Przekatna());



        }




}
