package P6;

public class Persegi extends BangunDatar {
    float sisi;
    
    @Override
    public float luas() {
        System.out.println("masukan sisi persegi = " + (int)sisi + ";");
        float hasil = sisi * sisi;
        System.out.println("luas persegi dengan sisi = " + (int)sisi + " adalah " + (int)hasil);
        return hasil;
    }

    @Override
    public float keliling() {
        System.out.println("masukan sisi persegi = " + (int)sisi + ";");
        float hasil = 4 * sisi;
        System.out.println("keliling persegi dengan sisi = " + (int)sisi + " adalah " + (int)hasil);
        return hasil;
    }
    
    
}
