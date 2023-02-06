import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfElements, total, primary = 0, secondary = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısı giriniz : ");
        numberOfElements = scanner.nextInt();

        for (int n = 1; n <= (numberOfElements-1); n++) {

            total = primary + secondary;

            System.out.println(primary + " + " + secondary + " = " + total);

            primary = secondary;
            secondary = total;

        }
    }
}
