package creational.abstractfactory.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Design Pattern");
        System.out.println("-------------------------------");

        AbstractFactory abstractFactory = FactoryProducer.getFamily("Shape");

        Shape shape = abstractFactory.getShape("Square");
        shape.draw();

        shape = abstractFactory.getShape("Circle");
        shape.draw();

        abstractFactory = FactoryProducer.getFamily("Color");
        Color color = abstractFactory.getColor("Blue");
        color.fill();

        color = abstractFactory.getColor("Green");
        color.fill();

    }
}
