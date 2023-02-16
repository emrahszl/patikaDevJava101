public class Main {
    public static void main(String[] args) {

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposeArray = new int[myArray[0].length][myArray.length];

        System.out.println("Matris : ");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {

                System.out.print(myArray[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");

        for (int i = 0; i < transposeArray.length; i++) {
            for (int j = 0; j < transposeArray[0].length; j++) {
                if (i == j) {
                    transposeArray[i][j] = myArray[i][j];
                } else {
                    transposeArray[i][j] = myArray[j][i];
                }
                System.out.print(transposeArray[i][j] + "    ");
            }
            System.out.println();
        }
    }
}