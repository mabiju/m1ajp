package g_exception_handling;

public class d_exception_array_index {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,99,35,64,10,34,578};

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception handled. " + e);
        }
    }
}
