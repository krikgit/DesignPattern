package creational.abstractfactory.example;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        Shape s = null;
        switch (shape){
            case "Square":
                s = new Square();
                break;
            case "Circle":
                s= new Circle();
                break;
        }
        return s;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        Color c = null;
        switch (color){
            case "Green":
                c = new Green();
                break;
            case "Blue":
                c = new Blue();
                break;
        }
        return c;
    }
}