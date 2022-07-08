package creational.builder.example;


public class Client {
    public static void main(String[] args) {

        System.out.println("Builder Design Pattern - Assignment");
        System.out.println("-----------------------------------");

        Director director = new Director();

        Builder carBuilder = new Car();
        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.showVehicleDetails();

        Builder bikeBuilder = new Bike();
        director.construct(bikeBuilder);
        Product bike = bikeBuilder.getVehicle();
        bike.showVehicleDetails();
    }
}
