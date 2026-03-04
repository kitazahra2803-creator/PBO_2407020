package latihan_pbo.latihan3_2407020;

public class Coba1 {

    private double sisi;
    private double panjang;
    protected double lebar;

    // Constructor
    public Coba1() {
    } 

    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Getter
    public double getSisi() {
        return sisi;
    }

    // Getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Method hitung keliling Persegi
    public double hitungKelilingPersegi() {
        return 4 * sisi;
    }

    // Method hitung keliling Persegi panjang
    public double hitungKelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }
}