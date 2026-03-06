package tugas1_pbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("PROGRAM MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("1. Segitiga");
        System.out.println("2. Jajar Genjang");
        System.out.println("3. Persegi");
        System.out.println("4. Persegi Panjang");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                Segitiga sTiga = new Segitiga();

                System.out.print("Masukkan alas : ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();

                sTiga.SetAlas(alas);
                sTiga.SetTinggi(tinggi);

                System.out.println("Luas Segitiga = " + sTiga.LuasSegitiga());
                break;

            case 2:
                JajarGenjang jGenjang = new JajarGenjang();

                System.out.print("Masukkan alas : ");
                alas = input.nextDouble();

                System.out.print("Masukkan tinggi : ");
                tinggi = input.nextDouble();

                jGenjang.SetAlas(alas);
                jGenjang.SetTinggi(tinggi);

                System.out.println("Luas Jajar Genjang = " + jGenjang.LuasJajarGenjang());
                break;

            case 3:
                Persegi sPersegi = new Persegi();

                System.out.print("Masukkan sisi : ");
                double sisi = input.nextDouble();

                sPersegi.SetSisi(sisi);

                System.out.println("Luas Persegi = " + sPersegi.LuasPersegi());
                break;

            case 4:
                PersegiPanjang sPersegiPanjang = new PersegiPanjang();

                System.out.print("Masukkan panjang : ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar : ");
                double lebar = input.nextDouble();

                sPersegiPanjang.SetPanjang(panjang);
                sPersegiPanjang.SetLebar(lebar);

                System.out.println("Luas Persegi Panjang = " + sPersegiPanjang.LuasPersegiPanjang());
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}