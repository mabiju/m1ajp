package g_exception_handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        // int[] arr = null;
        try {
            // System.out.println(arr[5]);
        } /* catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled." + e); 
        }*/
        catch(Exception e){
            System.out.println("Exception handled" + e);
        }
    }
}
