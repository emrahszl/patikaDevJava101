import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();
        System.out.println("4'ün katları");
        for (int i = 1; i < number; i *= 4) {
            System.out.println(i + " ");
        }
        System.out.println("5'in katları");
        for (int j = 1; j < number; j *= 5) {
            System.out.println(j + " ");
        }
    }
}
