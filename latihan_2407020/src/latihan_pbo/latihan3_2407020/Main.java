package latihan3_2407020;

public class Main {
    public static void main(String[] args) {

        Coba1 bangun = new Coba1();

        bangun.setSisi(5);
        System.out.println("Keliling Persegi : " + bangun.hitungKelilingPersegi());

        bangun.setPanjang(8);
        bangun.setLebar(4);
        System.out.println("Keliling Persegi Panjang : " + bangun.hitungKelilingPersegiPanjang());
    }
}