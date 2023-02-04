import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, tempNumber, countNumber, maxNumber, minNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        countNumber = scanner.nextInt();

        while (countNumber == 0 || countNumber == 1 || countNumber < 0) {

            System.out.println("Hatalı giriş yaptınız, lütfen pozitif ve en az 2 sayı giriniz !");

            System.out.print("Kaç tane sayı gireceksiniz : ");
            countNumber = scanner.nextInt();

        }

        System.out.print("1. Sayıyı giriniz : ");
        tempNumber = scanner.nextInt();
        maxNumber = tempNumber;

        for (int i = 2; i <= countNumber; i++) {

            System.out.print(i + ". Sayıyı giriniz : ");
            number = scanner.nextInt();

            if (number > maxNumber) {

                maxNumber = number;

                if (minNumber == 0 && i == 2) {

                    minNumber = tempNumber;
                }
            } else if (number < minNumber) {

                minNumber = number;
            }
        }
        System.out.println("En büyük sayı : " + maxNumber);
        System.out.println("En küçük sayı : " + minNumber);
    }
}