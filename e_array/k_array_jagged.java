package e_array;

public class k_array_jagged {
    public static void main(String[] args) {
        int[][] myArray = {
                { 12, 34, 56, 23 },
                { 56, 77, 88 }
        };
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
