package AsosiasiAlwan;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data pemilik 
        Pemilik pemilik = new Pemilik("Budiman", "Cianjur");
        
        // Array untuk menampung objek Mobil yang dibeli (maksimal 5)
        Mobil[] daftarMobil = new Mobil[5];

        System.out.print("Masukkan jumlah mobil yang ingin dibeli (maks 5): ");
        int n = input.nextInt();
        input.nextLine(); // Membersihkan newline buffer

        if (n > 5) {
            System.out.println("Maksimal hanya 5 mobil. Diatur menjadi 5.");
            n = 5;
        }

        // Proses Input Beli Mobil
        for (int i = 0; i < n; i++) {
            System.out.println("\nBeli Mobil:");
            System.out.print("Merk\t\t: ");
            String merek = input.nextLine();

            System.out.print("No\t\t: ");
            String noPlat = input.nextLine();

            System.out.print("Tahun Keluaran\t: ");
            long tahunKeluaran = input.nextLong();
            input.nextLine(); // Membersihkan newline buffer

            // Buat objek Mobil dan asosiasikan ke Pemilik via noPlat
            daftarMobil[i] = new Mobil(merek, noPlat, tahunKeluaran);
            pemilik.beliMobil(noPlat);
        }

        // Proses Output sesuai format contoh
        System.out.println("\nPemilik Mobil: " + pemilik.getNama() + " Alamat: " + pemilik.getAlamat());
        System.out.println("Data Mobil:");

        String[] platDimiliki = pemilik.getNoPlatMobil();

        for (int i = 0; i < pemilik.getJumlahMobil(); i++) {
            System.out.println("====================================================");
            
            // Mencocokkan nomor plat di Pemilik dengan objek di daftarMobil
            for (int j = 0; j < n; j++) {
                if (daftarMobil[j] != null && daftarMobil[j].getnoPlat().equals(platDimiliki[i])) {
                    System.out.println("Merk\t\t: " + daftarMobil[j].getMerek());
                    System.out.println("No\t\t: " + daftarMobil[j].getnoPlat());
                    System.out.println("Tahun Keluaran\t: " + daftarMobil[j].getTahunKeluaran());
                    break;
                }
            }
        }
        
        input.close();
    }
}
    
    

