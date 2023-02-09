import java.util.Scanner;

public class Main {
    static void isPrimeNumber() {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        int counter = 0;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL DEĞİLDİR!");
        }
    }

    public static void main(String[] args) {

        isPrimeNumber();
    }
}