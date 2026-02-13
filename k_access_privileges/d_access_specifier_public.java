package k_access_privileges;

class MyClass {
    public int roll = 90;
}

public class d_access_specifier_public {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("The roll number is = " + obj.roll);
    }
}
