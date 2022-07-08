package creational.factory.statics;

public class Client {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern - Static Implementation");
        System.out.println("----------------------------------------------");
        //here getshape() is a static method
        Shape shape = ShapeFactory.getShape("C");
        shape.draw();

        shape = ShapeFactory.getShape("R");
        shape.draw();

        shape = ShapeFactory.getShape("S");
        shape.draw();
    }
}
