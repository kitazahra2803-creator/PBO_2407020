package tugas4_pbo;

class MenuItem extends menu {
    private int jumlah;

    public MenuItem(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // override (polymorphism)
    @Override
    public int hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama + " x " + jumlah + " = " + hitungTotal());
    }
}