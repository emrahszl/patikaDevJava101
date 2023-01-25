import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = scanner.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("Java101")) {
            System.out.println("Hoşgeldiniz!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");
        }
    }
}
