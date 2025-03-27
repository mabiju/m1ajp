package D_Array;

public class h_array_two_dim {
    public static void main(String[] args) {
        int pos[][] = new int[4][5];
        int k = 0;
        
        // to assign value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                pos[i][j] = k;
                k++;
            }
        }

        // to print value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(pos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
