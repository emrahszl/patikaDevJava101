public class Main {

    static boolean isPalindrom(int number) {
        int tempNumber = number, reverseNumber = 0, lastnumber;

        while (tempNumber != 0) {

            lastnumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastnumber;

            tempNumber /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    int tempNumber, reverseNumber;

    public static void main(String[] args) {

        System.out.println(isPalindrom(8));
    }
}