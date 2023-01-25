import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (scanner.hasNext()) {
            System.out.println(i++ + " " + scanner.nextLine());
        }
        scanner.close();

    }
}
