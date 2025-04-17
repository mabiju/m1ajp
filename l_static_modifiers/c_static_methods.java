package l_static_modifiers;

public class c_static_methods {

    // instance variable
    public int a = 67;

    // static variable
    public static int b = 34;

    void displayInstanceMethod(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static void displayStaticMethod(){
        // System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        c_static_methods obj = new c_static_methods();
        // accessing instace method
        obj.displayInstanceMethod();
        System.out.println();
        
        // accessing static method
        displayStaticMethod();

    }
}
