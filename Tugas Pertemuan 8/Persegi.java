public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        double hasil = sisi * sisi;
        System.out.println("Luas persegi = " + hasil);
    }
}