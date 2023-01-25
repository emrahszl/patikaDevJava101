import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kmBasiOdeme = 2.20, minOdeme = 20.0, acilisTutari = 10.0,km,odenecekTutar,hesaplananOdeme;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilecek KM'yi giriniz: ");
        km = scanner.nextDouble();
        hesaplananOdeme = acilisTutari + km * kmBasiOdeme;
        odenecekTutar = hesaplananOdeme <= 20 ? minOdeme : hesaplananOdeme;
        System.out.println("Taksimetre Tutarı : "+odenecekTutar + " TL");
    }
}
