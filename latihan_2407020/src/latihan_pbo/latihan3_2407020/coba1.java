package latihan_pbo.latihan3_2407020;

public class coba1 {

    protected double panjang;
    protected double lebar;

    // Constructor
    public coba1(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Method hitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method cetak keliling
    public void cetakKeliling() {
        System.out.println("Kelilingnya adalah : " + hitungKeliling());
    }
}
