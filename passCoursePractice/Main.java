import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math,physics,turkish,chemistry,music,totalCourse = 0,totalNotes = 0,average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        math = scanner.nextInt();
        if (math>=0 && math<=100){
            totalNotes += math;
            totalCourse++;
        }else{
            System.out.println("Geçersiz giriş, ortalama hesaplamasına eklenmeyecek!");
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = scanner.nextInt();
        if (turkish>=0 && turkish<=100){
            totalNotes += turkish;
            totalCourse++;
        }else{
            System.out.println("Geçersiz giriş, ortalama hesaplamasına eklenmeyecek!");
        }

        System.out.print("Fizik notunuzu giriniz : ");
        physics = scanner.nextInt();
        if (physics>=0 && physics<=100){
            totalNotes += physics;
            totalCourse++;
        }else{
            System.out.println("Geçersiz giriş, ortalama hesaplamasına eklenmeyecek!");
        }

        System.out.print("Kimya notunuzu giriniz : ");
        chemistry = scanner.nextInt();
        if (chemistry>=0 && chemistry<=100){
            totalNotes += chemistry;
            totalCourse++;
        }else{
            System.out.println("Geçersiz giriş, ortalama hesaplamasına eklenmeyecek!");
        }

        System.out.print("Müzik notunuzu giriniz : ");
        music = scanner.nextInt();
        if (music>=0 && music<=100){
            totalNotes += music;
            totalCourse++;
        }else{
            System.out.println("Geçersiz giriş, ortalama hesaplamasına eklenmeyecek!");
        }
        average = totalNotes/totalCourse;
        if (average >= 55){
            System.out.println("Tebrikler, geçtiniz!");
        }else {
            System.out.println("Malesef kaldınız!");
        }
        System.out.println(average);
    }
}
