package f_method_overloading;

class Calc {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("Sum = " + (a + b + c + d));
    }
}

public class a_overloading_diff_no_param {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        Calc c2 = new Calc();
        Calc c3 = new Calc();
        c1.add(12, 35);
        c2.add(12, 35, 67);
        c3.add(12, 35, 67, 90);
    }
}
