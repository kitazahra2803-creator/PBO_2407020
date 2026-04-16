package tugas4_pbo;
public class menu {
    protected String nama;
    protected int harga;

    public menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // method polymorphism
    public int hitungTotal() {
        return harga;
    }

    public void tampilkan() {
        System.out.println("Menu: " + nama + " | Harga: " + harga);
    }
}