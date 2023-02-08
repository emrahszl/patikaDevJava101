import java.util.Scanner;

public class Main {

    static void exponent(){

        int base,exponent;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = input.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç : "+result);
    }
    public static void main(String[] args) {

        exponent();
    }
}