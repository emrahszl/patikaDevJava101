import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int distance, age, tripType;
        double totalPrice = 0, ticketPrice, roundTrip = 1.6, feePerDistance = 0.10, childDiscount = 0.50, teenDiscount = 0.90, oldDiscount = 0.70;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz : ");
        distance = scanner.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        tripType = scanner.nextInt();

        ticketPrice = distance * feePerDistance;

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            if (age < 12) {
                if (tripType == 1) {
                    totalPrice = (ticketPrice * childDiscount);
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                } else {
                    totalPrice = (ticketPrice * childDiscount) * roundTrip;
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                }
            } else if (age < 24) {
                if (tripType == 1) {
                    totalPrice = (ticketPrice * teenDiscount);
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                } else {
                    totalPrice = (ticketPrice * teenDiscount) * roundTrip;
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                }
            } else if (age > 65) {
                if (tripType == 1) {
                    totalPrice = (ticketPrice * oldDiscount);
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                } else {
                    totalPrice = (ticketPrice * oldDiscount) * roundTrip;
                    System.out.println("Toplam Tutar " + totalPrice + " TL");
                }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
