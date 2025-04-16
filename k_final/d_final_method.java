package k_final;

class Mom {

    // final public void cooking() {
    public void cooking() {
        System.out.println("Mom is cooking meal.");
    }
}

class Son extends Mom {

    @Override
    public void cooking() {
        System.out.println("Son is cooking meal.");
    }
}

public class d_final_method {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.cooking();
    }
}
