package b_basic_io;

public class q_swap_predefined_nums {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, temp;
        System.out.println("Before swapping:");
        System.out.println("The value of num1=" + num1);
        System.out.println("The value of num2=" + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping:");
        System.out.println("The value of num1=" + num1);
        System.out.println("The value of num2=" + num2);
    }
}
