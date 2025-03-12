package C_Basic_IO_Class_n_Object;

class Stud {
    int roll, age;
    String name, address;

    void inputDetails(int r, int a, String n, String ad) {
        roll = r;
        age = a;
        name = n;
        address = ad;
    }

    void displayDetails() {
        System.out.println("Roll = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }
}

public class d_student_details {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.inputDetails(11, 25, "Ram", "Ghopteodar");
        s1.displayDetails();
    }
}
