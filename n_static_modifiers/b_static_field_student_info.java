package n_static_modifiers;

class Student {

    public int roll;
    public String name;
    public static String clzName = "Sanothimi";

    void inputData(int r, String n) {
        roll = r;
        name = n;
    }

    void displayData() {
        System.out.println("\nRoll number  = " + roll);
        System.out.println("Student name  = " + name);
        System.out.println("College name  = " + clzName);
    }
}

public class b_static_field_student_info {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.inputData(11, "Ram");
        s1.displayData();
        s2.inputData(12, "Sita");
        s2.displayData();
        Student.clzName = "Janamaitri";
        s3.inputData(17, "Hari");
        s3.displayData();
    }
}
