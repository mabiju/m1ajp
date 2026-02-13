// demenostrating the use of "super" keyword to access method of super class
package h_inheritance;

class Teacher{
    void study(){
        System.out.println("Teacher is studying....");
    }
}
class Student extends Teacher{
    void study(){
        super.study(); // method from super class
        System.out.println("Student is studying....");
    }
}
public class e_single_same_method_super {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study(); // executes super class method first
    }
}
