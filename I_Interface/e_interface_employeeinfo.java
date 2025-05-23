/* Write a program in java to enter employee id and name of an employee
and to display the information using Java interface. */
package i_interface;

import java.util.Scanner;

interface IEmployee {
    public void getdata();

    public void showdata();
}

public class e_interface_employeeinfo implements IEmployee {
    int emp_id;
    String emp_name;

    public static void main(String[] args) {
        e_interface_employeeinfo emp1 = new e_interface_employeeinfo();
        emp1.getdata();
        emp1.showdata();
    }

    @Override
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("Enter employee name:");
        emp_name = sc.next();
        sc.close();
    }

    @Override
    public void showdata() {
        System.out.println("Employee id = " + emp_id);
        System.out.println("Employee name = " + emp_name);
    }
}
