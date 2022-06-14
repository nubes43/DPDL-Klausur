package Klausuraufgaben;

public class Konto extends Kunde {

    private int id;
    private double saldo;

    public void Konto() {

    }

    public Konto(String name, String adresse, int id, double saldo) {
        super(name, adresse);
        this.id = id;
        this.saldo = saldo;
    }

    public void add(double betrag) {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Konto other = (Konto) obj;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    public Object clone(Object kont) {

        return kont;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}