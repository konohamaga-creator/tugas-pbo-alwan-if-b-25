package P8;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    // Atribut tambahan untuk menghitung keliling segitiga
    private float sisiA;
    private float sisiB;
    private float sisiC;

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        return sisiA + sisiB + sisiC;
    }

    public float setAlas(float alas) {
        this.alas = alas;
        return this.alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setSisiKeliling(float sisiA, float sisiB, float sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}