import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int arrayElement;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu n : ");
        length = input.nextInt();

        int[] list = new int[length];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 1; i <= length; i++){
            System.out.print(i+". Elemanı : ");
            arrayElement = input.nextInt();
            for (int j = (i-1); j < i; j++){
                list[j] = arrayElement;
            }
        }
        Arrays.sort(list);
        System.out.print("Sıralama : "+Arrays.toString(list));
    }
}