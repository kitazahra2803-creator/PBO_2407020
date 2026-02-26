package latihan_pbo.latihan4_2407020;

public class PersegiPanjang {
                    protected double panjang;   // menggunakan protected
    protected double lebar;

    // Setter panjang
    public void setPanjang(double panjang) {
        if (panjang > 0) {
            this.panjang = panjang;
        } else {
            System.out.println("Panjang tidak boleh negatif atau nol!");
        }
    }

    // Setter lebar
    public void setLebar(double lebar) {
        if (lebar > 0) {
            this.lebar = lebar;
        } else {
            System.out.println("Lebar tidak boleh negatif atau nol!");
        }
    }

    // Getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Hitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}