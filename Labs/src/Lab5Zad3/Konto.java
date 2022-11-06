package Lab5Zad3;

public class Konto {

    private int  nr_konta;
    private double saldo;

    public Konto() {
    }

    public Konto(int nr_konta, double saldo) {
        this.nr_konta = nr_konta;
        this.saldo = saldo;
    }

    public void setNr_konta(int nr_konta) {
        this.nr_konta = nr_konta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNr_konta() {
        return nr_konta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void getStan() {
        System.out.println("konto Nr: " + this.getNr_konta() + "\t saldo: " + this.getSaldo());
    }
}
