import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int error = 0;

        boolean isSelectCorrect = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı bulma oyununa hoşgeldiniz!\n");

        while (!isSelectCorrect) {
            if (error > 0){
                System.out.println("Hatalı giriş yaptınız!");
            }
            mainMenu();
            System.out.print("\nSeçiminiz : ");
            int select = input.nextInt();

            if (select == 1) {
                isSelectCorrect = true;
                runGame();
            } else if (select == 2) {
                isSelectCorrect = true;
                System.out.println("Tekrar görüşmek dileğiyle...");
            }
            error++;
        }
        input.close();
    }

    public static void runGame() {

        int error = 0;
        boolean isSelectCorrect = false;

        Scanner sc = new Scanner(System.in);
        aboutGame();

        int number = (int) (Math.random() * 100);
        System.out.println("Gizli sayı üretildi, oyun başladı!");
        System.out.print("Tahmininiz : ");
        int guess = sc.nextInt();

        while (guess < 0 || guess > 100) {
            System.out.println("Hatalı giriş yaptınız! Lütfen 0-100 arasında bir giriniz. (0 ile 100 dahil değildir!)\n");
            System.out.print("Tahmininiz : ");
            guess = sc.nextInt();
        }

        for (int i = 5; i > 1; ) {
            if (number != guess) {
                System.out.println("\nYanlış tahmin!");
                i--;
                System.out.println("Kalan Hakkınız : " + i);
                if (number > guess) {
                    System.out.println("İpucu : Gizli sayı tahmin edilenden büyük!");
                } else {
                    System.out.println("İpucu : Gizli sayı tahmin edilenden küçük!");
                }
            } else {
                System.out.println("Tebrikler, kazandınız! Doğru Cevap : " + number);
                break;
            }
            System.out.print("\nTahmininiz : ");
            guess = sc.nextInt();
            while (guess < 0 || guess > 100) {
                System.out.println("Hatalı giriş yaptınız! Lütfen 0-100 arasında bir giriniz. (0 ile 100 dahil değildir!)\n");
                System.out.print("Tahmininiz : ");
                guess = sc.nextInt();
            }
        }
        System.out.println("\nMalesef kaybettiniz! Doğru Cevap : "+number+"\n");

        while (!isSelectCorrect) {
            if (error > 0){
                System.out.println("Hatalı giriş yaptınız!");
            }
            againPlayMenu();
            System.out.print("\nSeçiminiz : ");
            int select = sc.nextInt();

            if (select == 1) {
                isSelectCorrect = true;
                runGame();
            } else if (select == 2) {
                error = 0;
                while (!isSelectCorrect) {
                    if (error > 0){
                        System.out.println("Hatalı giriş yaptınız!");
                    }
                    mainMenu();
                    System.out.print("\nSeçiminiz : ");
                    select = sc.nextInt();

                    if (select == 1) {
                        isSelectCorrect = true;
                        runGame();
                    } else if (select == 2) {
                        isSelectCorrect = true;
                        System.out.println("Tekrar görüşmek dileğiyle...");
                    }
                    error++;
                }
            }
            error++;
        }
        sc.close();
    }

    public static void mainMenu() {
        String mainMenu = ("1- Oyuna Başla \n" +
                "2- Çıkış");

        System.out.println(mainMenu);
    }

    public static void againPlayMenu() {
        String againPlayMenu = ("1- Tekrar Oyna <---> " +
                "2- Ana Menü");
        System.out.println(againPlayMenu);
    }

    public static void aboutGame() {
        System.out.println("\nOyun Hakkında :\n" +
                "=================================================================================== \n" +
                "Oyuna başladığınızda 0-100 arasında bir sayı üretilir. (0 ile 100 dahil değildir!) \n" +
                "Üretilen gizli sayıyı bulmanız için toplamda 5 hakkınız olacak. \n" +
                "Merak etmeyin! Her tahmininizden sonra size küçük bir ipucu vereceğiz. \n" +
                "=================================================================================== \n");
    }
}
