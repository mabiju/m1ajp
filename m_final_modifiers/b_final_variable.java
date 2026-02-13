package m_final_modifiers;

class MyClass {

    final int a = 78;

    public void displayInfo() {
        System.out.println("The value = " + a);
    }
}

public class b_final_variable {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayInfo();
    }
}
