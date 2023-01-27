import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        number1 = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        number2 = scanner.nextInt();

        for (int i = 1; i <= number2; i++) {
            result *=  number1;
        }
        System.out.println(number1+" üzeri "+number2+" = "+ result);
    }
}
