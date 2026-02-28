package latihan_pbo.latihan4_2407020;

public class Persegi {
                     protected double sisi;   // menggunakan protected

    // Setter
    public void setSisi(double sisi) {
        if (sisi > 0) {
            this.sisi = sisi;
        } else {
            System.out.println("Sisi tidak boleh negatif atau nol!");
        }
    }

    // Getter
    public double getSisi() {
        return sisi;
    }

    // Hitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Hitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }
}