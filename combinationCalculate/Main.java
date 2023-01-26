import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, combination, nFactorial = 1, rFactorial = 1, difference, differenceFactorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n değerini giriniz : ");
        n = scanner.nextInt();
        System.out.print("r değerini giriniz : ");
        r = scanner.nextInt();

        difference = n - r;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFactorial *= j;
        }
        for (int y = 1; y <= difference; y++) {
            differenceFactorial *= y;
        }

        combination = nFactorial / (rFactorial * differenceFactorial);

        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
