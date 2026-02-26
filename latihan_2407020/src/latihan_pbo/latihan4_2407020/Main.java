package latihan_pbo.latihan4_2407020;

public class Main {
    public static void main(String[] args) {

        persegi p = new persegi();
        p.setSisi(4);

        System.out.println("PERSEGI");
        System.out.println("Sisi      : " + p.getSisi());
        System.out.println("Luas      : " + p.hitungLuas());
        System.out.println("Keliling  : " + p.hitungKeliling());

        System.out.println();

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(5);

        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang   : " + pp.getPanjang());
        System.out.println("Lebar     : " + pp.getLebar());
        System.out.println("Luas      : " + pp.hitungLuas());
        System.out.println("Keliling  : " + pp.hitungKeliling());
    }
}