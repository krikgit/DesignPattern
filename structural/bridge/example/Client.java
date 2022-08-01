package structural.bridge.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");
        System.out.println("----------------------");

        Vehicle vehicle = new Car(new Produce(),new Assemble());
        vehicle.manufacture();
        System.out.println("_________________________________");
        Vehicle _vehicle = new Bike(new Produce(),new Assemble());
        _vehicle.manufacture();
    }
}
