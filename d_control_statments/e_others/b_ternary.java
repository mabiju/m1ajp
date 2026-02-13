package d_control_statments.e_others;

import java.util.Scanner;

public class b_ternary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            String result = (age < 18) ? "Ineligible to get voter id." : "Eligible to get voter id.";
            System.out.println(result);
        }
    }
}
