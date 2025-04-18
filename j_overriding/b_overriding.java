package j_overriding;

class Mom {
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

public class b_overriding {
    public static void main(String[] args) {
        Son ram = new Son();
        ram.cooking();
    }
}
