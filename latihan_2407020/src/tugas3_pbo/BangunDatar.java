public class BangunDatar {
    protected double varA;
    protected double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Method default
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan
    public void tampilkan() {
        System.out.println("Bangun datar");
        System.out.println("VarA: " + varA);
        System.out.println("VarB: " + varB);
    }
}