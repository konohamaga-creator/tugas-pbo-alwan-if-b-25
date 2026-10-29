import java.util.Scanner;

public class Latihan2HitungLuasKelilingLingkaran {
    public static void main(String[] args) {
        // Deklarasi variabel dan konstanta PI
        float jari, keliling, luas;
        final float PI = 3.14f;

        // Membuat scanner untuk membaca input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();

        // Proses perhitungan
        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        // Output hasil
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
        
        input.close();
    }
}