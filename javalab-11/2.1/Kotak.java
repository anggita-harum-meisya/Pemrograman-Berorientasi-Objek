public class Kotak implements Resizeable {

    private double sisi;

    public Kotak(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void resize(double factor) {
        sisi *= factor;
    }

    public void tampil() {
        System.out.println("Sisi = " + sisi);
    }
}