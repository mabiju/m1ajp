package l_inner_class_n_nested_class;

public class a_inner_class {
    String clzName = "Sanothimi";

    //inner class
    class InnerClass{
        void display(){
            System.out.println("College name = " + clzName);
        }
    }

    public static void main(String[] args) {
        a_inner_class obj = new a_inner_class();
        a_inner_class.InnerClass inObj = obj.new InnerClass();
        inObj.display();
    }
}
