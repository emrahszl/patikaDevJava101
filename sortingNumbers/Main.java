import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        number1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        number2 = scanner.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        number3 = scanner.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println("Küçükten büyüğe sıralama : " + number1 + " < " + number2 + " < " + number3);
            } else {
                System.out.println("Küçükten büyüğe sıralama : " + number1 + " < " + number3 + " < " + number2);
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println("Küçükten büyüğe sıralama : " + number2 + " < " + number1 + " < " + number3);
            } else {
                System.out.println("Küçükten büyüğe sıralama : " + number2 + " < " + number3 + " < " + number1);
            }
        } else {
            if (number1 < number2) {
                System.out.println("Küçükten büyüğe sıralama : " + number3 + " < " + number1 + " < " + number2);
            } else {
                System.out.println("Küçükten büyüğe sıralama : " + number3 + " < " + number2 + " < " + number1);
            }
        }
    }
}
