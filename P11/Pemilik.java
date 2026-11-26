package AsosiasiAlwan; 

public class Pemilik {
    private String nama;
    private String alamat;
    private int jumlahMobil;
    private String[] noPlatMobil;

    public Pemilik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahMobil = 0;
        this.noPlatMobil = new String[5]; // Maksimal 5 mobil
    }

    public void beliMobil(String noPlat) {
        if (jumlahMobil < 5) {
            noPlatMobil[jumlahMobil] = noPlat;
            jumlahMobil++;
        } else {
            System.out.println("Maaf, " + nama + " sudah mencapai batas maksimal 5 mobil!");
        }
    }

    public void jualMobil(String noPlat) {
        int indexDitemukan = -1;
        
        // Cari posisi nomor plat yang akan dijual
        for (int i = 0; i < jumlahMobil; i++) {
            if (noPlatMobil[i].equalsIgnoreCase(noPlat)) {
                indexDitemukan = i;
                break;
            }
        }

        // Jika ditemukan, geser elemen array dan kurangi jumlahMobil
        if (indexDitemukan != -1) {
            for (int i = indexDitemukan; i < jumlahMobil - 1; i++) {
                noPlatMobil[i] = noPlatMobil[i + 1];
            }
            noPlatMobil[jumlahMobil - 1] = null;
            jumlahMobil--;
        } else {
            System.out.println("Nomor plat " + noPlat + " tidak ditemukan pada daftar mobil " + nama);
        }
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahMobil() {
        return jumlahMobil;
    }

    public String[] getNoPlatMobil() {
        return noPlatMobil;
    }
}