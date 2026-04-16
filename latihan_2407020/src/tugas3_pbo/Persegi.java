public class Persegi extends BangunDatar {
    public Persegi(double varA) {
        super(varA);
    }

    @Override
    public double hitungLuas() {
        return varA * varB;
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("========================");
        System.out.println("Sisi: " + varA);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================");
    }
}