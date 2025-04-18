package j_overriding;

class GrandPa {
    public void hi() {
        System.out.println("Hi from GrandPa.");
    }
}

class Dad extends GrandPa {
    public void hello() {
        System.out.println("Hello from Dad");
    }

    @Override
    public void hi() {
        System.out.println("Hi from dad.");
    }
}

public class c_overriding {
    public static void main(String[] args) {
        Dad d = new Dad();
        d.hello();
        d.hi();
    }
}
