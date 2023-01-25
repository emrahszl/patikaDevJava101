import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1,number2,result, operation = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = scanner.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapmak istediğiniz işleme uygun rakamı giriniz : ");
        operation = scanner.nextInt();

        switch (operation){
            case 1:
                result = number1+number2;
                System.out.println("Sonuç: "+ result);
                break;
            case 2:
                result = number1-number2;
                System.out.println("Sonuç: "+ result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Sonuç: "+ result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println("Sonuç: "+ result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
