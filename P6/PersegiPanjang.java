package P6;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    public float luas() {
        float hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
        return hasil;
    }

    @Override
    public float keliling() {
        float hasil = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + hasil);
        return hasil;
    }
    
    
}
