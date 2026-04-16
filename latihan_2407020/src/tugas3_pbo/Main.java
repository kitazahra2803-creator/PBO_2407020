public class Main {
    public static void main(String[] args) {

        // polymorphism 
        BangunDatar bd1 = new BangunDatar(3, 4);
        BangunDatar bd2 = new Persegi(5);
        BangunDatar bd3 = new PersegiPanjang(5, 3);
        BangunDatar bd4 = new Segitiga(0, 0);

        Persegi p1 = new Persegi(0);

        bd1.tampilkan();
        bd2.tampilkan();
        bd3.tampilkan();
        bd4.tampilkan();
    }
}