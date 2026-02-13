package i_interface;

interface IVehicle {
    public void accelerate();
}

interface ICar extends IVehicle {
    public void run();
}

class Car implements ICar {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating....");
    }

    @Override
    public void run() {
        System.out.println("Car is running....");
    }
}

public class d_interface_extending_interface {
    public static void main(String[] args) {
        Car bv = new Car();
        bv.accelerate();
        bv.run();
    }
}
