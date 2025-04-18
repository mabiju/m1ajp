package h_inheritance;

class BaseClass {
    void hi() {
        System.out.println("This is method from BaseClass.");
    }
}

class DerivedClass extends BaseClass {
    void hi() {
        System.out.println("This is method from DerivedClass.");
    }
}

public class d_single_same_method {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        BaseClass d2 = new DerivedClass();
        // DerivedClass d1 = new DerivedClass();
        b1.hi();
        // d1.hi();
        d2.hi();
    }
}
