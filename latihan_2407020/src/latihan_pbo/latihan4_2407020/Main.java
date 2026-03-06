package latihan4_2407020;

public class Main {

    public static void main(String[] args) {
        Segitiga sTiga = new Segitiga();
        sTiga.SetAlas(5);
        sTiga.SetTinggi(7);
        System.out.println("Luas segitiga adalah : " + sTiga.LuasSegitiga());

        
        JajarGenjang jGenjang = new JajarGenjang();
        jGenjang.SetAlas(12);
        jGenjang.SetTinggi(16);
        System.out.println(" Luas jajar genjang adalah :" + jGenjang.LuasJajarGenjang());

        Persegi sPersegi = new Persegi();
        sPersegi.SetSisi(12);
        sPersegi.SetSisi(22);
        System.out.println(" Luas persegi adalah :" + sPersegi.LuasPersegi());

        PersegiPanjang sPersegiPanjang = new PersegiPanjang();
        sPersegiPanjang.SetPanjang(12);
        sPersegiPanjang.SetLebar(22);
        System.out.println(" Luas persegi panjang adalah :" + sPersegiPanjang.LuasPersegiPanjang());
    }
}