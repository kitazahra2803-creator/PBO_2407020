package tugas2_pbo;
public class BangunDatar {
    protected double panjang;
    protected double lebar;

    //constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar ;
    }

    public void tampilkanhasil(){
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
    }
}