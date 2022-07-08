package creational.factory.assignment;

public class Client {
    public static void main(String[] args) {

        System.out.println("Factory Design Pattern - Assignment");
        System.out.println("----------------------------------------------");

        Animal animal = AnimalFactory.getAnimal("d");
        animal.canSwim();
        animal.eatChicken();

        animal = AnimalFactory.getAnimal("t");
        animal.canSwim();
        animal.eatChicken();
    }
}
