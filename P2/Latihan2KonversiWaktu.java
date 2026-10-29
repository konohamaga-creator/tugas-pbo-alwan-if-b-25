import java.util.Scanner;

public class Latihan2KonversiWaktu {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jam, menit, detik, totdet;

        // Membuat scanner untuk membaca input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam: ");
        jam = input.nextInt();
        
        System.out.print("Masukkan menit: ");
        menit = input.nextInt();
        
        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        // Proses perhitungan
        totdet = jam * 3600 + menit * 60 + detik;

        // Output hasil
        System.out.println("Total detik: " + totdet);
        
        input.close();
    }
}

