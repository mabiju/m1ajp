package j_overriding;

class SuperClass {
    public void superMethod() {
        System.out.println("This is method from super class.");
    }
}

class SubClass extends SuperClass {
    @Override
    public void superMethod() {
        System.out.println("This is redefined method of SuperClass from SubClass.");
    }
}

public class a_overriding {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.superMethod();
    }
}
