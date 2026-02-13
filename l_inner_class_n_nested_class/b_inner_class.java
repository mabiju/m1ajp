package l_inner_class_n_nested_class;

// outer class
class OuterClass {

    void show() {
        InnerClassTwo in = new InnerClassTwo();
        in.display();
    }

    // inner class
    class InnerClassTwo {

        void display() {
            System.out.println("I am a method from inner class.");
        }
    }
}

public class b_inner_class {

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.show();
    }
}
