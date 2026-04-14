public class Main {
    public static void main(String[] args) {

        // satu tipe variabel untuk semua objek (polymorphism)
        BangunDatar bangun;

        bangun = new Persegi(5.0);
        bangun.tampilkan();

        System.out.println();

        bangun = new PersegiPanjang(4.0, 6.0);
        bangun.tampilkan();

        System.out.println();

        bangun = new Segitiga(6.0, 8.0);
        bangun.tampilkan();
    }
}