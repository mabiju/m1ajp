package g_exception_handling;

import java.util.Scanner;

// creating user-defined exception
class InvalidWeightException extends Exception {
    public InvalidWeightException(String s) {
        super(s);
    }
}

public class j_exception_invalid_product_weight_throw_throws {
    void checkProductWeight(int weight) throws InvalidWeightException {
        if (weight < 100) {
            throw new InvalidWeightException("Invalid weight found.");
        } else {
            System.out.println("Product is ready for further processing.");
        }
    }

    public static void main(String[] args) {
        j_exception_invalid_product_weight_throw_throws obj = new j_exception_invalid_product_weight_throw_throws();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the product:");
        int wt = sc.nextInt();
        sc.close();

        try {
            obj.checkProductWeight(wt);
        } catch (InvalidWeightException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
