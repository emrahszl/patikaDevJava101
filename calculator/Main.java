import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1,number2,addidition,subtraction,multiplication,division;
        int operation;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        number1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = scanner.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapmak istediğiniz işleme uygun rakamı giriniz : ");
        operation = scanner.nextInt();

        addidition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;

        if (operation == 1){
            System.out.println("Sonuç: "+ addidition);
        } else if (operation == 2) {
            System.out.println("Sonuç: "+ subtraction);
        } else if (operation == 3) {
            System.out.println("Sonuç: "+ multiplication);
        } else if (operation == 4) {
            System.out.println("Sonuç: "+ division);
        }else{
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
