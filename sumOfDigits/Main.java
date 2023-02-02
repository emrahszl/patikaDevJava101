import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, digit, sumOfDigits = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = number; i > 0; i /= 10) {

            digit = i % 10;
            sumOfDigits += digit;
        }
        System.out.println(sumOfDigits);
    }
}
