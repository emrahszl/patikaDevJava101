import java.util.Scanner;

public class Main {

    static  void outPrint(){
        System.out.print("Çıktısı : ");
    }
    static void valueCheck(int number) {

        System.out.print(number+" ");
        int value = 5;

        if (number <= 0){
            value *= -1;
        } else {
            valueCheck(number - value);
            System.out.print(number+ " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int number = input.nextInt();

        outPrint();
        valueCheck(number);
    }
}