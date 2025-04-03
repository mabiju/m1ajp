package G_Access_Privileges;

class Student{
    // private int roll = 78;  // not accessible out of class
    public int roll = 78;  // not accessible out of class
}
public class b_access_private {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("The roll number is : " + s1.roll);
    }
}
