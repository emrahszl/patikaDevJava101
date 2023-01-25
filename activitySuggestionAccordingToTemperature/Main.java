import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz : ");
        temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
