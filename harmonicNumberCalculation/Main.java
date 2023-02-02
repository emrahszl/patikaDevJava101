import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float number, harmonicTotal = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextFloat();

        for (int i = 1; i <= number; i++){

            harmonicTotal += (1.0/i);
        }
        System.out.println("Harmonik Toplamı = "+harmonicTotal);
    }
}
