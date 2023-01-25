import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, armutkg,elmakg,domateskg,muzkg,patlicankg, toplamTutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutkg = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmakg = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domateskg = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzkg = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicankg = scanner.nextDouble();

        toplamTutar = armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;
        System.out.println("Toplam Tutar : "+ toplamTutar + " TL");
    }
}
