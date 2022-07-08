package creational.prototype.example;

public class Client {
    public static void main(String[] args) {

        System.out.println("Prototype Design Pattern");
        System.out.println("------------------------");

        ShapeCache.loadCache();

        Shape clonedShape =  ShapeCache.getShape("1");
        System.out.println("Shape: "+clonedShape.getType());

        Shape cloneShape = ShapeCache.getShape("2");
        System.out.println("Shape: "+cloneShape.getType());
    }
}
