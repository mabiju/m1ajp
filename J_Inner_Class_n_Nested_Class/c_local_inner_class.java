package J_Inner_Class_n_Nested_Class;

public class c_local_inner_class {

    int clzId = 27;

    void displayClzId() {
        class InnerClassThree {

            void display() {
                System.out.println("College id = " + clzId);
            }
        }
        InnerClassThree in = new InnerClassThree();
        in.display();
    }

    public static void main(String[] args) {
        c_local_inner_class out = new c_local_inner_class();
        out.displayClzId();
    }
}
