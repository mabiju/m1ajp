package l_inner_class_n_nested_class;

public class e_static_nested_class {

    static int roll = 67;

    // static nested class
    static class NestedClass {

        void display() {
            System.out.println("Roll number = " + roll);
        }
    }

    public static void main(String[] args) {
        e_static_nested_class.NestedClass nObj = new e_static_nested_class.NestedClass();
        nObj.display();
    
    }
}

/* 
you need to create the instance of static nested class because it has instance method showRoll(). 
But you don't need to create the object of the Outer class because the nested class is static and static properties, 
methods, or classes can be accessed without an object. 
*/