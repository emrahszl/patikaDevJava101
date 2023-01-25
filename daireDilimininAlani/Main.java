import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, 𝛼, partOfCircle ,pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r = scanner.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        𝛼 = scanner.nextDouble();

        partOfCircle = (pi*(r*r)*𝛼)/360;

        System.out.println("Daire diliminin alanı : " + partOfCircle);
    }
}
