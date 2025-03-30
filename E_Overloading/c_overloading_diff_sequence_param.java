package E_Overloading;

class MyNums {
    public void add(int a, double b) {
        System.out.println("The sum = " + (a + b));
    }

    public void add(double a, int b) {
        System.out.println("The sum = " + (a + b));
    }
}

public class c_overloading_diff_sequence_param {
    public static void main(String[] args) {
        MyNums obj = new MyNums();
        obj.add(23, 45.00);
        obj.add(23.34, 45);
    }
}
