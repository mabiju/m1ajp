package j_overriding;

class Human {
    public void breathe() {
        System.out.println("Human breaths");
    }
}

class Boy extends Human {
    public void breathe() {
        System.out.println("Boy breaths");
    }
}

public class e_overriding {
    public static void main(String[] args) {
        Human obj1 = new Boy(); // reference of Human type
        obj1.breathe();

        Boy b1 = new Boy(); // object type of Boy type
        b1.breathe();
    }
}
