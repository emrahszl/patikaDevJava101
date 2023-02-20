public class Main {

    public static void main(String[] args) {
        isPalindromic("kavak");
    }

    public static boolean isPalindromic(String word){

        String reverseWord="";

        for (int i = 0; i < word.length(); i++){
            for (int j = (word.length()-1)-i; j >= ((word.length()-1)-i); j--) {
                reverseWord += word.charAt(j);
            }
        }

        if (word.equals(reverseWord)) {
            System.out.println(word+" palindromiktir.");
        }
        if (!word.equals(reverseWord)) {
            System.out.println(word+" palindromik değildir.");
        }

        return true;
    }
}