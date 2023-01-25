import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, resetPassword, select;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = scanner.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("Java101")) {
            System.out.println("Hoşgeldiniz.");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (1-evet\n2-hayır :");
            select = scanner.nextLine();
            if (select.equals("1")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                resetPassword = scanner.nextLine();

                if (resetPassword.equals("Java101")) {
                    System.out.print("Şifre oluşturulamadı, Yeni şifre, eski şifreyle aynı olamaz! Lütfen başka şifre giriniz : ");
                    resetPassword = scanner.nextLine();
                    if (!resetPassword.equals("Java101")) {
                        System.out.println("Şifre oluşturuldu.");
                    } else {
                        System.out.println("Yeni şifre, eski şifreyle aynı olamaz!");
                    }
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Lütfen daha sonra tekrar deneyiniz, iyi günler dileriz.");
            }
        }
    }
}
