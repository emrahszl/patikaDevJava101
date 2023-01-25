import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz: ");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunu Giriniz: ");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = scanner.nextInt();

        double sonuc = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız: "+ sonuc);

        boolean gectiMi = sonuc > 60;
        String mesaj = gectiMi ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(mesaj);
        }
    }