public class MainOverload {

    public static void main(String[] args) {
        System.out.println("Main utama dijalankan");
        main(10);
        main("Gita");
    }

    public static void main(int x) {
        System.out.println("Main dengan int: " + x);
    }

    public static void main(String nama) {
        System.out.println("Main dengan String: " + nama);
    }
}