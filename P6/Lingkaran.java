package P6;

public class Lingkaran extends BangunDatar {
    float r;

    @Override
    public float luas() {
        System.out.println("masukan Jari-jari = " + (int)r + ";");
        float hasil = (float) (Math.PI * r * r);
        System.out.printf("luas lingkaran dengan jari= %d adalah %.2f\n", (int)r, hasil);
        return hasil;
    }

    @Override
    public float keliling() {
        System.out.println("masukan jari-jari = " + (int)r + ";");
        float hasil = (float) (2 * Math.PI * r);
        System.out.printf("keliling lingkaran dengan jari-jari = %d adalah %.2f\n\n", (int)r, hasil);
        return hasil;
    }
    
    
}
