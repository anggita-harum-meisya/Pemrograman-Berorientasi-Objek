public class ResizeMain {

    public static void main(String[] args) {

        Kotak k = new Kotak(5);

        System.out.println("Sebelum resize:");
        k.tampil();

        k.resize(2);

        System.out.println("Sesudah resize:");
        k.tampil();
    }
}