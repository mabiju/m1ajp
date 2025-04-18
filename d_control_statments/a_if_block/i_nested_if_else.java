package d_control_statments.a_if_block;

import java.util.Scanner;

public class i_nested_if_else {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check +ve, -ve or zero using nested if else:");
            num = sc.nextInt();
        }
        if (num != 0) {
            if (num > 0) {
                System.out.println("The number " + num + " is a +ve integer.");
            } else {
                System.out.println("The number " + num + " is a -ve integer.");
            }
        } else {
            System.out.println("The number is zero");
        }
    }
}
