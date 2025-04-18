package b_basic_io;

import java.util.Scanner;

public class s_swap_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("The value of a=" + a);
        System.out.println("The value of b=" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("The value of a=" + a);
        System.out.println("The value of b=" + b);

        sc.close();
    }
}
