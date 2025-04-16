package k_final;

// final class SuperClass {
class SuperClass {

    public void superMethod() {
        System.out.println("Method from super class.");
    }
}

class SubClass extends SuperClass {

    public void subMethod() {
        System.out.println("Method from sub class.");
    }
}

public class c_final_class {

    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        s1.subMethod();
        s1.subMethod();
    }
}
