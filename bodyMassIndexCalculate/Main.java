import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight, bodyMassIndex;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextDouble();

        bodyMassIndex = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex);
    }
}
