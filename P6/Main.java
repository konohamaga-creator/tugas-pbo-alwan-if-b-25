package P6;

public class Main {
    public static void main(String[] args){
        // #### Object Bangun datar dibuat #####
        System.out.println("#### Object Bangun datar dibuat #####");
        BangunDatar bangunDatar = new BangunDatar();
        System.out.print("- Output method luas: ");
        bangunDatar.luas();
        System.out.print("- Output method keliling: ");
        bangunDatar.keliling();
        
        System.out.println();

        // #### Object Persegi dibuat #####
        System.out.println("#### Object Persegi dibuat #####");
        Persegi persegi = new Persegi();
        System.out.println("- Output method luas:");
        persegi.sisi = 4;
        persegi.luas();
        
        System.out.println("- Output method keliling:");
        persegi.sisi = 2;
        persegi.keliling();

        System.out.println();

        // #### Object Lingkaran dibuat #####
        System.out.println("#### Object Lingkaran dibuat #####");
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("- Output method luas:");
        lingkaran.r = 4;
        lingkaran.luas();

        System.out.println("- Output method keliling:");
        lingkaran.r = 2;
        lingkaran.keliling();
        
        // #### Object Persegi Panjang dibuat #####
        System.out.println("#### Object Persegi Panjang dibuat #####");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        System.out.println("- Output method luas:");
        persegiPanjang.luas();
        System.out.println("- Output method keliling:");
        persegiPanjang.keliling();

        System.out.println();   
        
        // #### Object Segitiga dibuat #####
        System.out.println("#### Object Segitiga dibuat #####");
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 8;
        System.out.println("- Output method luas:");
        segitiga.luas();
    }
}
    

