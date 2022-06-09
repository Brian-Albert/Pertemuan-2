import java.util.Scanner;

public class TabungTest {
    public static void hitungVolumeTabung(int r, int t){
        //Volume Tabung = π r2 t
        double v = 0.0;
        final float PI = 22.0f/7;
        v = PI * (r*r) * t;
        System.out.println("Menghitung Volume Tabung:");
        System.out.println("Rumus: Volume Tabung = π x r^2 x t");
        System.out.println("Volume Tabung = " + v + " cm^3");
    } 

    public static void main(String[] args) throws Exception {
        int rTabung, tTabung;
        //int r,t;
        //Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang jari-jari Tabung (cm) : ");
        rTabung = input.nextInt();
        System.out.print("Masukkan Tinggi Tabung (cm) : ");
        tTabung = input.nextInt();
        System.out.println();
        hitungVolumeTabung(rTabung,tTabung);
        System.out.println();
        //hitungLuasPermukaanTabung(r, t);
    }
} 

