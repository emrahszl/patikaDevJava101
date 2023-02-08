import java.util.Scanner;

public class Main {

    static void sum() {

        int countNumber, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen toplama yapmak istediğiniz sayı adedini giriniz : ");
        countNumber = input.nextInt();

        while (countNumber < 2) {
            System.out.println("Lütfen en az 2 sayı giriniz!");
            System.out.print("Lütfen toplama yapmak istediğiniz sayı adedini giriniz : ");
            countNumber = input.nextInt();
        }
        int result = 0;

        for (int i = 1; i <= countNumber; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();
            result += number;
        }
        System.out.println();
        System.out.println("Toplama işlemi sonucu : " + result);
    }

    static void minus() {

        int countNumber, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen çıkarma yapmak istediğiniz sayı adedini giriniz : ");
        countNumber = input.nextInt();

        while (countNumber < 2) {
            System.out.println("Lütfen en az 2 sayı giriniz!");
            System.out.print("Lütfen çıkarma yapmak istediğiniz sayı adedini giriniz : ");
            countNumber = input.nextInt();
        }

        int result = 0;

        for (int i = 1; i <= countNumber; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();
            if (i == 1) {
                result = number;
            } else {
                result -= number;
            }
        }
        System.out.println();
        System.out.println("Çıkarma işlemi sonucu : " + result);
    }

    static void multiplication() {

        int countNumber, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen çarpma yapmak istediğiniz sayı adedini giriniz : ");
        countNumber = input.nextInt();

        while (countNumber < 2) {
            System.out.println("Lütfen en az 2 sayı giriniz!");
            System.out.print("Lütfen toplama yapmak istediğiniz sayı adedini giriniz : ");
            countNumber = input.nextInt();
        }

        int result = 1;

        for (int i = 1; i <= countNumber; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();
            result *= number;

        }
        System.out.println("Çarpma işlemi sonucu : " + result);
    }

    static void division() {

        Scanner input = new Scanner(System.in);

        double dividend, divisor;

        System.out.print("Bölünecek sayıyı giriniz : ");
        dividend = input.nextDouble();

        System.out.print("Bölen sayıyı giriniz : ");
        divisor = input.nextDouble();

        while (divisor == 0) {

            System.out.println("Bölen 0 girilemez!");
            System.out.print("Bölen sayıyı giriniz : ");
            divisor = input.nextInt();
        }
        double result = dividend / divisor;
        System.out.println("Bölme işlemi sonucu : " + result);
    }

    static void power() {

        int base, exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        base = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        exponent = input.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println(base + " üzeri " + exponent + " = " + result);
    }

    static void factorial() {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyeli alınacak sayıyı giriniz : ");
        number = input.nextInt();

        int result = 1;

        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println(number + "! = " + result);
    }

    static void mode() {

        int number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        number2 = input.nextInt();

        int result = number1 % number2;
        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {

        int width, length;

        Scanner input = new Scanner(System.in);

        System.out.print("Eni giriniz : ");
        width = input.nextInt();
        System.out.print("Boyu giriniz : ");
        length = input.nextInt();

        int rectanglePerimeter = (2 * width) + (2 * length);
        System.out.println("Dikdörtgenin çevresi : " + rectanglePerimeter);

        int rectangleArea = width * length;
        System.out.println("Dikdörtgenin alanı : " + rectangleArea);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int select;

        System.out.println("========================\n " +
                "Yapılabilecek işlemler\n" +
                "======================== \n" +
                "1- Toplama \n" +
                "2- Çıkarma \n" +
                "3- Çarpma \n" +
                "4- Bölme \n" +
                "5- Üslü sayı hesaplama \n" +
                "6- Faktöriyel hesaplma \n" +
                "7- Mod alma \n" +
                "8- Dikdörtgen çevre ve alan hesabı \n" +
                "0- Çıkış yap \n");

        while (true) {

            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }

            switch (select) {

                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;

                case 3:
                    multiplication();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    power();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    mode();
                    break;

                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız ! Lütfen 1-8 arası giriş yapnız.");
            }
        }
        System.out.println("İyi günler dileriz...");
    }
}