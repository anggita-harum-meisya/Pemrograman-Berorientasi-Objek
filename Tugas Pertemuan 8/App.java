import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        BangunDatar segitiga = new Segitiga(alas, tinggi);
        segitiga.luas(); 

        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();

        BangunDatar persegi = new Persegi(sisi);
        persegi.luas();

        input.close();
    }
}