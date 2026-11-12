package P8;

public class Persegi extends BangunDatar {
    private float sisi;

    @Override
    protected float luas() {
        return sisi * sisi;
    }

    @Override
    protected float keliling() {
        return 4 * sisi;
    }

    public float setSisi(float sisi) {
        this.sisi = sisi;
        return this.sisi;
    }

    public float getSisi() {
        return sisi;
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