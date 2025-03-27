package D_Array;

public class e_array_sin_average_array_elements {
    public static void main(String[] args) {
        int sum = 0, arrayLength;
        double avg = 0.0;
        int marks[] = { 23, 45, 67, 88, 90, 12, 60 };

        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        arrayLength = marks.length;
        avg = sum / arrayLength;
        System.out.println("Average of array elements = " + avg);
    }
}
