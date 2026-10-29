package P2;

import java.util.Scanner;

public class Sepeda {
    // Atribut objek
    String merk;
    int jarakTempuh = 0;

    // Method Bergerak Maju (Menu 1)
    public void melaju() {
        jarakTempuh += 10;
        System.out.println("-   Bergerak Maju 10 Km");
        System.out.println("-   Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    // Method Bergerak Mundur (Menu 2)
    public void mundur() {
        jarakTempuh -= 5;
        System.out.println("-   Bergerak Mundur 5 Km");
        System.out.println("-   Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    // Method Berhenti (Menu 3)
    public void berhenti() {
        System.out.println("-   Sepeda Berhenti");
        System.out.println("-   Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }

    // Main Method untuk menjalankan program interaktif
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sepeda sepedaKu = new Sepeda();

        // Input Merk Sepeda di awal program
        System.out.print("Masukan Object Merk Sepeda: ");
        sepedaKu.merk = input.nextLine();
        System.out.println("-   Object " + sepedaKu.merk + " dibuat, jarak tmpuh awal 0 km");

        int pilihan;

        // Loop Menu Interaktif
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            // Memproses pilihan menu
            switch (pilihan) {
                case 1:
                    sepedaKu.melaju();
                    break;
                case 2:
                    sepedaKu.mundur();
                    break;
                case 3:
                    sepedaKu.berhenti();
                    break;
                case 0:
                    // Teks Terima kasih
                    System.out.println("-   Keluar Program ..");
                    System.out.println("-   Terimakasih sudah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
