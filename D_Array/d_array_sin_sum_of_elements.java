package D_Array;

public class d_array_sin_sum_of_elements {
    public static void main(String[] args) {
        int sum = 0;
        int marks[] = { 23, 45, 67, 88, 90, 12, 60 };
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        System.out.println("The sum of array elements = " + sum);
    }
}
