package P8;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    @Override
    protected float luas() {
        return panjang * lebar;
    }

    @Override
    protected float keliling() {
        return 2 * (panjang + lebar);
    }

    public float setPanjang(float panjang) {
        this.panjang = panjang;
        return this.panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
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