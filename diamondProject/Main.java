import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= (number - i); j++){
                System.out.print(" ");
            }
            for (int x = 1; x <= (2*i)-1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = (number-1); k > 0; k--){
            for (int m = 1; m <= (number - k); m++){
                System.out.print(" ");
            }
            for (int n = 1; n <= (2*k)-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
