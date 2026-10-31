package P6;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    @Override
    public float luas() {
        float hasil = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + hasil);
        return hasil;
    }
    
}
