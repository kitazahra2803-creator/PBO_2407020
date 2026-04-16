package tugas4_pbo;

 public class main { 
    public static void main(String[] args) {

        // polymorphism (1 tipe, beda objek)
        menu m1 = new MenuItem("Nasi Goreng", 15000, 2);
        menu m2 = new MenuItem("Mie Ayam", 12000, 1);
        menu m3 = new MenuItem("Es Teh", 5000, 3);

        System.out.println("=== Daftar Pesanan ===");

        m1.tampilkan();
        m2.tampilkan();
        m3.tampilkan();

        int total = m1.hitungTotal() + m2.hitungTotal() + m3.hitungTotal();

        System.out.println("=================");
        System.out.println("Total Bayar: " + total);
    }
}