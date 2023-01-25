import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı giriniz : ");
        temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapılabilir");
        } else if (temperature >= 5 && temperature < 25) {
            if (temperature <= 15) {
                System.out.println("Sinemaya gidilebilir");
            }
            if (temperature >= 10) {
                System.out.println("Pikniğe gidilebilir");
            }
        } else if (temperature >= 25) {
            System.out.println("Yüzmeye gidilebilir");
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
