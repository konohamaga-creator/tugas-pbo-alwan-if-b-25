import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Menampilkan pesan input
        System.out.print("Masukan Tahun (1909 - 2024): ");
        int tahun = input.nextInt();
        
        // Validasi aturan tahun kabisat
        // Tahun kabisat: habis dibagi 4, dan jika habis dibagi 100 harus habis dibagi 400 juga
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
        
        input.close();
    }
}

