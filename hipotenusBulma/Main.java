import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c,alan,cevre,u;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz : ");
        a = scanner.nextDouble();
        System.out.print("2. kenar uzunluğunu giriniz : ");
        b = scanner.nextDouble();
        System.out.print("3. kenar uzunluğunu giriniz : ");
        c = scanner.nextDouble();

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Çevresi : "+ cevre);
        System.out.println("Üçgenin Alanı : "+ alan);

    }
}
