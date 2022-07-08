package creational.factory.concrete;

public class ShapeFactory {

    public Shape getShape(String shape){
        Shape s = null;
        if(shape.equalsIgnoreCase("C")){
            s = new Circle();
        }else if (shape.equalsIgnoreCase("R")){
            s = new Rectangle();
        }else if (shape.equalsIgnoreCase("S")){
            s = new Square();
        }
        return s;
    }
}
