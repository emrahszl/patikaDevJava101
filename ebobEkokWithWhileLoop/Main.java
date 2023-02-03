import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, number1, number2, ebob = 1, ekok;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        number1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        number2 = scanner.nextInt();

        i = number1;

        while (i >= 1){
            if ((number1 % i == 0) && (number2 % i == 0)){
                ebob = i;
                break;
            }
            i--;
        }
        ekok = (number1*number2)/ebob;

        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);
    }
}
