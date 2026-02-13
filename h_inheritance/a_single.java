package h_inheritance;

class SuperClass {
    public void hi() {
        System.out.println("Hi Sanothimi");
    }
}

class SubClass extends SuperClass {
    public void hello() {
        System.out.println("Hello Sanothimi");
    }
}

public class a_single {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        // accessing own method
        obj.hello();

        // accessing super class method
        obj.hi();
    }
}
