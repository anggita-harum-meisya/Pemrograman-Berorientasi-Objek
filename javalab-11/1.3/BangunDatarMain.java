public class BangunDatarMain {

    public static void main(String[] args) {

        Kotak k = new Kotak(5);
        Segitiga s = new Segitiga(6,8);

        System.out.println("Luas Kotak = " + k.luas());
        System.out.println("Keliling Kotak = " + k.keliling());

        System.out.println("Luas Segitiga = " + s.luas());
        System.out.println("Keliling Segitiga = " + s.keliling());
    }
}