package structural.decorator.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        System.out.println("------------------------");

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
