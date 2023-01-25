import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius , pi = 3.14, daireninAlani, daireninCevresi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        radius = scanner.nextDouble();
        daireninCevresi = 2 * pi * radius;
        daireninAlani = pi * radius * radius;
        System.out.println("Dairenin Çevresi : " + daireninCevresi);
        System.out.println("Dairenin Alanı : " + daireninAlani);
    }
}
