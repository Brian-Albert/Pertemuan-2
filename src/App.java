//Nama : Brian Albert
//NIM  : 03081210027
//Kelas: 21SI2
//Kelompok 1

import java.util.Scanner;

public class App {
    public static void hitungVolumeTabung(int r, int t){
        //Volume Tabung = π r2 t
        double v = 0.0;
        final float PI = 22.0f/7;
        v = PI * (Math.pow(r, 2)) * t;
        System.out.println("Menghitung Volume Tabung:");
        System.out.println("Panjang Jari-jari Tabung = " + r + " cm");
        System.out.println("Tinggi Tabung = " +  t + " cm");
        System.out.println("Rumus: Volume Tabung = " + PI + " x " + r + "^2 x " + t );
        System.out.println("Volume Tabung = " + v + " cm^3");
    }
    public static void main(String[] args) throws Exception {
        int r, t;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang jari-jari Tabung (cm) : ");
        r = input.nextInt();
        System.out.print("Masukkan Tinggi Tabung (cm) : ");
        t = input.nextInt();
        hitungVolumeTabung(r,t);
    }
}
