package G_Access_Privileges;

class MyClass {
    public int roll = 90;
}

public class d_access_public {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("The roll number is = " + obj.roll);
    }
}
