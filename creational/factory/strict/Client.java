package creational.factory.strict;

public class Client {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern - Strict Implementation");
        System.out.println("----------------------------------------------");
        Shape shape = new RectangleFactory().getShape();
        shape.draw();

        shape = new CircleFactory().getShape();
        shape.draw();

        shape = new SquareFactory().getShape();
        shape.draw();
    }
}
