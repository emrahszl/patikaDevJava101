import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int countNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz : ");
        countNumber = scanner.nextInt();

        for (int n = countNumber; n >= 1; n--){

            for (int i = (2*n -1); i >= 1; i--){

                System.out.print("*");
        }
            System.out.println();

            for (int j = 0; j <= (countNumber-n); j++){

                System.out.print(" ");

            }
        }
    }
}