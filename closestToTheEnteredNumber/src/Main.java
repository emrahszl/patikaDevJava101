import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, distance, smallerDistance, largerDistance, smallerNumber, largerNumber;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        number = input.nextInt();
        System.out.println("Girilen sayı : " + number);

        smallerNumber = Integer.MIN_VALUE;
        largerNumber = Integer.MAX_VALUE;
        smallerDistance = Integer.MIN_VALUE;
        largerDistance = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {

            distance = list[i] - number;

            if (distance > 0 && distance < largerDistance) {
                largerDistance = distance;
                largerNumber = list[i];
            }
            if (distance < 0 && distance > smallerDistance) {
                smallerDistance = distance;
                smallerNumber = list[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + smallerNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + largerNumber);
        input.close();
    }
}