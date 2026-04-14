package tugas2_pbo;

public class BangunRuang extends BangunDatar {
                    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar*2;
    }

    //ini dari class parent
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }
    
    //ini dari class child
    public double hitungVolume2() {
        return hitungLuas() * tinggi;
    }

    //method hitung volume
    public void tampilkanInfoRuang() {
        super.tampilkanhasil();
        System.out.println("tinggi :" + tinggi);
    }
}
