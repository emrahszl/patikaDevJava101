import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String identificationNumber, password;
        int right = 3, withdrawal, deposit, option, balance = 1500;

        Scanner scanner = new Scanner(System.in);

        while (right > 0) {
            System.out.print("\nTC Kimlik No : ");
            identificationNumber = scanner.nextLine();
            System.out.print("\nParola : ");
            password = scanner.nextLine();

            if (identificationNumber.equals("12345678901") && password.equals("dev123")) {

                System.out.println("\nMerhaba, Kodluyoruz Bankasına hoşgeldiniz.\n");

                do {
                    System.out.println("Yapabileceğiniz işlemler\n" +
                            "--------------------\n" +
                            "1- Para Çekme\n" +
                            "2- Para Yatırma\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış\n" +
                            "--------------------\n");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    option = scanner.nextInt();
                    System.out.println();

                    switch (option) {

                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            withdrawal = scanner.nextInt();
                            System.out.println();
                            if (withdrawal > balance) {
                                System.out.println("Yetersiz Bakiye!\n");
                                System.out.println();
                            } else {
                                balance -= withdrawal;

                                System.out.println("Çekilen tutar : " + withdrawal+"TL");
                                System.out.println();
                                System.out.println("Kalan bakiye : " + balance+"TL");
                                System.out.println();
                            }
                            break;

                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            deposit = scanner.nextInt();
                            System.out.println();

                            balance += deposit;

                            System.out.println("Yatırılan tutar : " + deposit+"TL");
                            System.out.println();
                            System.out.println("Toplam bakiye : " + balance+"TL");
                            System.out.println();

                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance+"TL");
                            System.out.println();
                            break;
                    }

                } while (option != 4);
                System.out.println("Tekrar görüşmek üzere, iyi günler dileriz.");
                break;
            } else {
                if (identificationNumber.equals("12345678901")) {
                    right--;
                    System.out.println("Hatalı parola ! Kalan hakkınız : " + right);
                    System.out.println();
                } else {
                    System.out.println("Hesap bulunamadı ! Lütfen tekrar giriş yapınız.");
                    System.out.println();
                }
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur! Lütfen bankanız ile iletişime geçiniz.");
                    System.out.println();
                }
            }
        }
    }
}
