package Lab5Zad3_ext2;

import java.math.BigInteger;

public class Konto {

    private BigInteger nr_konta;
    private double saldo;

    public Konto() {
    }

    public Konto(BigInteger nr_konta, double saldo) {
        this.nr_konta = nr_konta;
        this.saldo = saldo;
    }

    public void setNr_konta(BigInteger nr_konta) {
        this.nr_konta = nr_konta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public BigInteger getNr_konta() {
        return nr_konta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void getStan() {
        System.out.println("konto Nr: " + this.getNr_konta() + "\t saldo: " + this.getSaldo());
    }
}
