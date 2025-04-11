package J_Inner_Class_n_Nested_Class;

public class a_member_inner_class {
    String clzName = "Sanothimi";

    //inner class
    class InnerClass{
        void display(){
            System.out.println("College name = " + clzName);
        }
    }

    public static void main(String[] args) {
        a_member_inner_class obj = new a_member_inner_class();
        a_member_inner_class.InnerClass inObj = obj.new InnerClass();
        inObj.display();
    }
}
