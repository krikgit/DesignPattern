package structural.bridge.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");
        System.out.println("----------------------");

        Color red = new Red();
        Shape triangle = new Triangle(red);
        triangle.drawShape(20);
        triangle.modifyBorder(20,2);
        System.out.println("---------------------");
        Color blue = new Blue();
        Shape rect = new Rectangle(blue);
        rect.drawShape(30);
        rect.modifyBorder(30,3);

    }
}