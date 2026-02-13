package j_overriding;

class HajurBuwa {
    public void namaste() {
        System.out.println("Namaste from your HajurBuwa.");
    }
}

class Buwa extends HajurBuwa {
    public void namaste() {
        System.out.println("Namaste from your Buwa.");
    }
}

class Bachcha extends Buwa {
    public void namaste() {
        System.out.println("Namaste from your Bachcha.");
    }
}

public class d_overriding {
    public static void main(String[] args) {
        HajurBuwa a, b, c;
        a = new HajurBuwa();
        b = new Buwa();
        c = new Bachcha();
        a.namaste();
        b.namaste();
        c.namaste();
    }
}
