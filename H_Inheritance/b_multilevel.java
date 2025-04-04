package H_Inheritance;

class GrandPa {
    void hi() {
        System.out.println("Hi grandchild");
    }
}

class Dad extends GrandPa {
    void hello() {
        System.out.println("Hello Child");
    }
}

class Child extends Dad {
    void namaste() {
        System.out.println("Namaste folks.");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.hi();
        c1.hello();
        c1.namaste();
    }
}
