package latihan_pbo;

public class coba {
protected double panjang;
protected double lebar;
protected double sisi;


public void setPanjang(double Panjang) {
this.panjang = Panjang;
}

public double getPanjang() {
return panjang;

}

public void setLebar(double Lebar) {
this.lebar = Lebar;
}

public void cetakLuas() {
System.out.println("Luasnya adalah : " + (panjang * lebar));
}

public double hitungLuas() {
                    double Luas = panjang * lebar;
                    return Luas;
}
}