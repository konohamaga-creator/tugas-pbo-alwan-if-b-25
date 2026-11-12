package P8;

public class Main {
    public static void main(String[] args) {
        // 1. Object Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println();

        // 2. Object Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        System.out.println("=== LINGKARAN ===");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());
        System.out.println();

        // 3. Object Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(4);
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());
        System.out.println();

        // 4. Object Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(8);
        segitiga.setSisiKeliling(6, 8, 10);
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}