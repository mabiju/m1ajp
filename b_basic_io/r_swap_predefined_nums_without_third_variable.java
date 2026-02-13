package b_basic_io;

public class r_swap_predefined_nums_without_third_variable {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("Before swapping:");
        System.out.println("The value of num1=" + num1);
        System.out.println("The value of num2=" + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping:");
        System.out.println("The value of num1=" + num1);
        System.out.println("The value of num2=" + num2);
    }
}
