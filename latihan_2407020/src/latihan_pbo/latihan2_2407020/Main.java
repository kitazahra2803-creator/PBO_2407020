package latihan_pbo.latihan2_2407020;

class Cafe{
                    String nama;
                    String alamat;

                     // construktor
                    Cafe(String Nama, String Alamat){
                                        this.nama= "Nama";
                                        this.alamat = "Alamat";
                                        System.out.println("Nama cafenya adalah =" + nama);
                                        System.out.println("Alamatnya ada di =" + alamat);
                    }

                    //method
                    void buka(){
                         System.out.println("Cafe sudah buka" );               
                    }
}

public class Main {

                    public static void main(String[] args) {
                                        Cafe cafe1 = new Cafe("Halaman",  "Jatibarang"); // proses instalasi object
                                        cafe1.buka();
                                        Cafe cafe2 = new Cafe("Kozi",  "Bulak"); // proses instalasi object
                                        cafe2.buka();
                                        Cafe cafe3 = new Cafe( "Liren warkop",  "Indramayu"); // proses instalasi object
                                        cafe3.buka(); 
                                        
                    }
}