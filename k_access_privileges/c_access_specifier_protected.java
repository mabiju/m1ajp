package k_access_privileges;

class Calc{
    protected int add(int a, int b){
        return (a+b);
    }
}
/* public class c_access_protected {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println("The result = " + c1.add(12, 34));
    }
} */
public class c_access_specifier_protected extends Calc {
    public static void main(String[] args) {
        c_access_specifier_protected obj = new c_access_specifier_protected();
        System.out.println("The result = " + obj.add(12, 34));
    }
}
