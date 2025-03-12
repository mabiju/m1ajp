package C_Basic_IO_Class_n_Object;

class Student {
    int roll = 67;
    String name = "Ram Thapa";
}

public class c_class_outside_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll " + s1.roll);
        System.out.println("Name " + s1.name);
    }
}
