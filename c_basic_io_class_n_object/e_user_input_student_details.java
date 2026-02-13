package c_basic_io_class_n_object;

import java.util.Scanner;

class Studnt {
    int roll, age;
    String name;

    void getData(Scanner sc) {
        roll = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();
    }

    void display() {
        System.out.println("Roll = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Student 1");
        Studnt s1 = new Studnt();
        s1.getData(sc);

        System.out.println("Enter the details of Student 2");
        Studnt s2 = new Studnt();
        s2.getData(sc);

        System.out.println("Enter the details of Student 3");
        Studnt s3 = new Studnt();
        s3.getData(sc);

        System.out.println("\nDisplaying the details of Student 1");
        s1.display();
        System.out.println("\nDisplaying the details of Student 2");
        s2.display();
        System.out.println("\nDisplaying the details of Student 3");
        s3.display();
    }
}
