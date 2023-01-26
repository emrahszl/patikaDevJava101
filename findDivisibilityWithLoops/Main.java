import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0, average, count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        number = scanner.nextInt();

        System.out.print("Bulunan Sayılar : ");

        for (int i = 0; i <= number; i++) {

            if (i != 0) {
                if ((i % 3 == 0) & (i % 4 == 0)) {
                    System.out.print(i + " ");
                    total += i;
                    count++;
                }
            }
        }
        System.out.println("\nToplam bulunan sayı adedi : " + count);
        average = total / count;
        System.out.println("Ortalama : " + average);
    }
}
