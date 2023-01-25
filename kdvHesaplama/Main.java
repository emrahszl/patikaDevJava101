import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double amount,taxRate, taxedPrice,taxRate1 = 0.18,taxRate2 = 0.08,taxValue1,taxValue2,tax;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Tutar Giriniz: ");
        amount = scanner.nextDouble();

        taxValue1 = amount*taxRate1;
        taxValue2 = amount*taxRate2;

        taxRate = amount>=0 && amount<=1000 ? taxValue1 : taxValue2;
        tax = taxRate/amount;
        taxedPrice = taxRate+amount;

        System.out.println("KDV'siz fiyat: "+ amount + " TL");
        System.out.println("KDV oranı : "+ tax);
        System.out.println("KDV'li fiyat: "+ taxedPrice + " TL");
        System.out.println("KDV tutarı: "+ taxRate + " TL");
    }
}
