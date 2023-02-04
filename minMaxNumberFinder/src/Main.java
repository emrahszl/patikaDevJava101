import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, countNumber, maxNumber = 0, minNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        countNumber = scanner.nextInt();

        while (countNumber == 0 || countNumber < 0) {

            System.out.println("Hatalı giriş yaptınız, lütfen pozitif ve en az 2 sayı giriniz !");

            System.out.print("Kaç tane sayı gireceksiniz : ");
            countNumber = scanner.nextInt();

        }

        for (int i = 1; i <= countNumber; i++) {

            System.out.print(i + ". Sayıyı giriniz : ");
            number = scanner.nextInt();

            if (i == 1) {

                minNumber = number;
                maxNumber = number;

            } else {

                if (number > maxNumber) {

                    maxNumber = number;
                    
                } else if (number < minNumber) {
                    
                    minNumber = number;
                    
                }
            }
        }
        
        System.out.println("En büyük sayı : " + maxNumber);
        System.out.println("En küçük sayı : " + minNumber);
    }
}
