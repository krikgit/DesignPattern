package creational.prototype.example;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }
    public  static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
