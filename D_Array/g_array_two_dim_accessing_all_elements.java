package D_Array;

public class g_array_two_dim_accessing_all_elements {
    public static void main(String[] args) {
        int[][] myArray = {
                // 2 x 3
                { 12, 34, 56 },
                { 34, 77, 90 }
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
