package h_inheritance;

class Vehicle {
    void accelerate() {
        System.out.println("I'm moving towards my destination.");
    }
}

class Aeroplane extends Vehicle {
    void fly() {
        System.out.println("I'm flying.....");
    }
}

class Motorbike extends Vehicle {
    void run() {
        System.out.println("I'm running.....");
    }
}

public class c_hierarchical {
    public static void main(String[] args) {
        Aeroplane Boeing747 = new Aeroplane();
        Boeing747.accelerate(); // accessing super class method
        Boeing747.fly(); // accession own method
        // Boeing747.run(); // error

        Motorbike KawasakiNinja = new Motorbike();
        KawasakiNinja.accelerate();
        KawasakiNinja.run();
        // KawasakiNinja.fly();
    }
}
