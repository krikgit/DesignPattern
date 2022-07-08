package creational.prototype.assignment;

public class Client {
    public static void main(String[] args) {

        System.out.println("Prototype Design Pattern");
        System.out.println("------------------------");

        CarCache.loadCar();

        BasicCar car = CarCache.getCar("Nano");
        car.description();
        System.out.println("Car details:\n"+car.getColor()+"::"+car.getName()+"::"+car.getPrice());

        BasicCar card = CarCache.getCar("Ford");
        card.description();
        System.out.println("Car details:\n"+card.getColor()+"::"+card.getName()+"::"+card.getPrice());
    }
}
