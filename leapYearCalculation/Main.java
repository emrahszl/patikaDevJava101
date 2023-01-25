import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, leapYear;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = scanner.nextInt();

        leapYear = year % 4;

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        } else if (leapYear == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}

