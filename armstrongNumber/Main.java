import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, digit = 0, totalDigit = 0, tempDigit = totalDigit, totalPow, armstrongResult = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = number; i > 0; i /= 10) {
            totalDigit++;
        }

        for (int j = number; j > 0; j /= 10) {
            digit = j % 10;

            totalPow = 1;
            for (int x = 1; x <= totalDigit; x++) {
                totalPow *= digit;
            }
            armstrongResult += totalPow;
        }
        if (number == armstrongResult) {
            System.out.println(number + " armstrong sayısıdır.");
        } else {
            System.out.println(number + " armstrong sayısı değildir.");
        }
    }
}
