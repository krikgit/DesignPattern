package creational.factory.concrete;

public class Client {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern - Concrete Implementation");
        System.out.println("------------------------------------------------");
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("C").draw();
        shapeFactory.getShape("R").draw();
        shapeFactory.getShape("S").draw();
    }
}
