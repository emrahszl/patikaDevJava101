import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, totalNumber = 0;
        boolean isNumberOdd = false;

        Scanner scanner = new Scanner(System.in);

        while (!isNumberOdd) {

            System.out.print("Bir sayı giriniz : ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                if (number % 4 == 0) {

                    totalNumber += number;
                }
            } else {
                isNumberOdd = true;
            }
        }
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı : " + totalNumber);
    }
}
