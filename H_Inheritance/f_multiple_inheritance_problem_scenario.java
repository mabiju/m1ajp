package H_Inheritance;

class Buwa{
    void hi(){
        System.out.println("Hi Child");
    }
}

class Muwa{
    void hello(){
        System.out.println("Hello Child");
    }
}

// class Bachcha extends Buwa, Muwa{ // error
class Bachcha extends Buwa{
    void greeetings(){
        System.out.println("Namaste ! my parents");
    }
}


public class f_multiple_inheritance_problem_scenario {
    public static void main(String[] args) {
        Bachcha b1 = new Bachcha();
        b1.greeetings();
        b1.hi();
        // b1.hello();
    }
}
