import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthday, remainder;
        String monkey = "Maymun", rooster = "Horoz", dog = "Köpek", pig = "Domuz", mouse = "Fare", ox = "Öküz", tiger = "Kaplan", rabbit = "Tavşan", dragon = "Ejderha", snake = "Yılan", horse = "At", sheep = "Koyun";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        birthday = scanner.nextInt();

        remainder = birthday % 12;


        switch (remainder) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : " + monkey);
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : " + rooster);
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : " + dog);
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : " + pig);
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : " + mouse);
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : " + ox);
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : " + tiger);
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : " + rabbit);
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : " + dragon);
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : " + snake);
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : " + horse);
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : " + sheep);
                break;

            default:
                System.out.println("Hatalı Giriş Yaptınız !");
        }
    }
}
